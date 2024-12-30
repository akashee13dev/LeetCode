package easy.LC326;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PowerThreeTest {

    PowerThree obj = new PowerThree();


    @Test
    @DisplayName("Example 3: Input : n = 27")
    void example3(){
        Assertions.assertTrue( obj.isPowerOfThree(27));
    }

    @Test
    @DisplayName("Example 5: Input : n = 0")
    void example5(){
        Assertions.assertFalse( obj.isPowerOfThree(0));
    }

    @Test
    @DisplayName("Example 6: Input : n = -1")
    void example6(){
        Assertions.assertFalse( obj.isPowerOfThree(-1));
    }


}
