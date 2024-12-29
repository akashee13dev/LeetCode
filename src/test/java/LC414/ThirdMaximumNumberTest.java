package LC414;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {

    ThirdMaximumNumber obj = new ThirdMaximumNumber();


    @Test
    @DisplayName("Example 2: Input : nums = [3,2,1]")
    void example2(){
        Assertions.assertEquals(1 ,  obj.thirdMax(new int[]{3,2,1}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [1,2]")
    void example1(){
        Assertions.assertEquals(2,  obj.thirdMax(new int[]{1,2}));
    }


    @Test
    @DisplayName("Example 3: Input : nums = [2,2,3,1]")
    void example3(){
        Assertions.assertEquals(1 ,  obj.thirdMax(new int[]{2,2,3,1}));
    }

}
