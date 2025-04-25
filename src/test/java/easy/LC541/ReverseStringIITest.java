package easy.LC541;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringIITest {

    ReverseStringII obj = new ReverseStringII();


    @Test
    @DisplayName("Example 2: Input :   s = \"abcdefg\", k = 2")
    void example2(){
        Assertions.assertEquals("bacdfeg", obj.reverseStr("abcdefg",2));
    }

    @Test
    @DisplayName("Example 1: Input : s = \"abcd\", k = 2")
    void example1(){
        Assertions.assertEquals("bacd" , obj.reverseStr("abcd",2));
    }


}
