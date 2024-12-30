package easy.LC231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    PowerOfTwo obj = new PowerOfTwo();


    @Test
    @DisplayName("Example 3: Input : n = 1")
    void example3(){
        Assertions.assertTrue( obj.isPowerOfTwo(1));
    }

    @Test
    @DisplayName("Example 5: Input : n = 16")
    void example5(){
        Assertions.assertTrue( obj.isPowerOfTwo(16));
    }

    @Test
    @DisplayName("Example 6: Input : n = 3")
    void example6(){
        Assertions.assertFalse( obj.isPowerOfTwo(3));
    }

}
