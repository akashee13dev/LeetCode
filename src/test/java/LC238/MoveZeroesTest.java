package LC238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    MoveZeros obj = new MoveZeros();

    @Test
    @DisplayName("Example 3: Input : nums = [0,1,0,3,12]")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1,3,12,0,0} , obj.moveZeroes(new int[]{0,1,0,3,12}));
    }

    @Test
    @DisplayName("Example 4: Input : nums = [0]")
    void example4(){
        Assertions.assertArrayEquals(new int[]{0}, obj.moveZeroes(new int[]{0}));
    }

}
