package easy.LC263;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UglyNumberTest {

    UglyNumber obj = new UglyNumber();

    @Test
    @DisplayName("Example 3: Input : n = 6")
    void example3(){
        Assertions.assertTrue(obj.isUgly(6));
    }

    @Test
    @DisplayName("Example 2: Input : n = 14")
    void example2(){
        Assertions.assertFalse(obj.isUgly(14));
    }

    @Test
    @DisplayName("Example 5: Input : n = 1")
    void example5(){
        Assertions.assertTrue(obj.isUgly(1));
    }

    @Test
    @DisplayName("Example 4: Input : n = 8")
    void example4(){
        Assertions.assertTrue(obj.isUgly(8));
    }

}
