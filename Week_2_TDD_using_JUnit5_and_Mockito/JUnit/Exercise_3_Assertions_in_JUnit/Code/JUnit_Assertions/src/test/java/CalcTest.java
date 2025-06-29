
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {


    Calc c = new Calc();
    @Test
    void testAdd(){

        assertEquals(23,c.add(11,12));
        assertEquals(24,c.add(12,12));
    }

    @Test
    public void testSub(){
        assertEquals(-1,c.sub(11,12),()->"error");
        assertEquals(99,c.sub(111,12));
    }
}
