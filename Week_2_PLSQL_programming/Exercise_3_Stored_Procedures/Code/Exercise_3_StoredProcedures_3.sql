SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_acct IN NUMBER,
    p_to_acct   IN NUMBER,
    p_amt       IN NUMBER
) AS
    v_from_balance NUMBER;
    v_new_tran_id  NUMBER;
BEGIN
    -- Check if source account has sufficient balance
    SELECT balance INTO v_from_balance
    FROM accounts
    WHERE accountid = p_from_acct;

    IF v_from_balance < p_amt THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Reduce from sender
    UPDATE accounts
    SET balance = balance - p_amt,
        lastmodified = SYSDATE
    WHERE accountid = p_from_acct;

    -- Send to receiver
    UPDATE accounts
    SET balance = balance + p_amt,
        lastmodified = SYSDATE
    WHERE accountid = p_to_acct;

    -- Get new transaction ID (start from 1 if table is empty)
    SELECT NVL(MAX(tran_id), 0) + 1 INTO v_new_tran_id
    FROM transactions;

    -- Insert transaction for sender
    INSERT INTO transactions (
        tran_id, acc_id, tran_date, amount, tran_type
    ) VALUES (
        v_new_tran_id, p_from_acct, SYSDATE, p_amt, 'Transfer'
    );

    -- Insert transaction for receiver
    INSERT INTO transactions (
        tran_id, acc_id, tran_date, amount, tran_type
    ) VALUES (
        v_new_tran_id + 1, p_to_acct, SYSDATE, p_amt, 'Receive'
    );

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');

END;
/
