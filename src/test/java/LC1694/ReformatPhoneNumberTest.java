package LC1694;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReformatPhoneNumberTest {

    ReformatPhoneNumber obj = new ReformatPhoneNumber();


    @Test
    @DisplayName("Example 1: Input : number = \"1-23-45 6\"")
    void example1(){
        Assertions.assertEquals("123-456",obj.reformatNumber("1-23-45 6"));
    }

    @Test
    @DisplayName("Example 2: Input : number = \"123 4-567\"")
    void example2(){
        Assertions.assertEquals("123-45-67",obj.reformatNumber("123 4-567"));
    }

    @Test
    @DisplayName("Example 3: Input : number = \"123 4-5678\"")
    void example3(){
        Assertions.assertEquals("123-456-78",obj.reformatNumber("123 4-5678"));
    }

}
