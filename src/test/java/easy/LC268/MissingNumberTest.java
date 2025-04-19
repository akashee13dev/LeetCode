package easy.LC268;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    MissingNumber obj = new MissingNumber();


    @Test
    @DisplayName("Example 3: Input : [3,0,1]")
    void example3(){
        Assertions.assertEquals(2,obj.missingNumber(new int[]{3,0,1}));
    }

    @Test
    @DisplayName("Example 2: Input : nums = [0,1]")
    void example2(){
        Assertions.assertEquals(2,obj.missingNumber(new int[]{0,1}));
    }

    @Test
    @DisplayName("Example 1: Input : nums = [9,6,4,2,3,5,7,0,1]")
    void example1(){
        Assertions.assertEquals(8,obj.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }


}
