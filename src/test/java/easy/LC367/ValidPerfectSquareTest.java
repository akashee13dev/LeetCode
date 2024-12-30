package easy.LC367;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidPerfectSquareTest {


    ValidPerfectSquare obj = new ValidPerfectSquare();

    @Test
    @DisplayName("Example 5: Input : num = 16")
    void example5(){
        Assertions.assertTrue( obj.isPerfectSquare(16));
    }

    @Test
    @DisplayName("Example 6: Input : num = 14")
    void example6(){
        Assertions.assertFalse( obj.isPerfectSquare(14));
    }

}
