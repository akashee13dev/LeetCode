package easy.LC342;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PowerFourTest {


    PowerFour obj = new PowerFour();


    @Test
    @DisplayName("Example 3: Input : n = 16")
    void example3(){
        Assertions.assertTrue( obj.isPowerOfFour(16));
    }

    @Test
    @DisplayName("Example 5: Input : n = 5")
    void example5(){
        Assertions.assertFalse( obj.isPowerOfFour(5));
    }

    @Test
    @DisplayName("Example 6: Input : n = 1")
    void example6(){
        Assertions.assertTrue( obj.isPowerOfFour(1));
    }



}
