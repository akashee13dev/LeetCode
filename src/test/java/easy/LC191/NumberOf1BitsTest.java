package easy.LC191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {

    NumberOf1Bits obj = new NumberOf1Bits();



    @Test
    @DisplayName("Example 3: Input : n = 11")
    void example3(){
        Assertions.assertEquals(3, obj.hammingWeight(11));
    }

    @Test
    @DisplayName("Example 4: Input : n = 128")
    void example4(){
        Assertions.assertEquals(1, obj.hammingWeight(128));
    }


    @Test
    @DisplayName("Example 5: Input : n = 2147483645")
    void example5(){
        Assertions.assertEquals(30, obj.hammingWeight(2147483645));
    }

}
