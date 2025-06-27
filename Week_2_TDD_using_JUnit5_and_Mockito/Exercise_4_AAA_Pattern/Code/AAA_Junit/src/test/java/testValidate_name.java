import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class testValidate_name{

    static Validate validate;

    @BeforeEach
    void init(){
        validate=new Validate();
        System.out.println("Validate object created....");
    }

    @Test
    public void test1(){

        //Arrange
        String firstName = "Gopavarapu";
        String lastName = "Gopavarapu";
        boolean expected = true;

        //Act
        boolean result = validate.validate_name(firstName,lastName);

        //Assert
        assertTrue(expected==result);
    }

    @Test
    public void test2(){

        //Arrange
        String firstName = "VVITU";
        String lastName = "VVITU";
        boolean expected = true;

        //Act
        boolean result = validate.validate_name(firstName,lastName);

        //Assert
        assertTrue(expected==result);
    }

    @AfterAll
    static void removeResources(){
        validate = null;
    }

}