package LC1758;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumChangesToMakeAlternatingBinaryStringTest {

    MinimumChangesToMakeAlternatingBinaryString obj = new MinimumChangesToMakeAlternatingBinaryString();



    @Test
    @DisplayName("Example 3: Input :  s = \"0100\"")
    void example3(){
        Assertions.assertEquals(1,obj.minOperations("0100"));
    }

    @Test
    @DisplayName("Example 4: Input :  s = \"10\"")
    void example4(){
        Assertions.assertEquals(0,obj.minOperations("10"));
    }

    @Test
    @DisplayName("Example 1: Input :  s = \"1111\"")
    void example1(){
        Assertions.assertEquals(2,obj.minOperations("1111"));
    }

    @Test
    @DisplayName("Example 2: Input :  s = \"1100010111\"")
    void example2(){
        Assertions.assertEquals(3,obj.minOperations("1100010111"));
    }

    @Test
    @DisplayName("Example 5: Input :  s = \"10010100\"")
    void example5(){
        Assertions.assertEquals(3,obj.minOperations("10010100"));
    }



}
