package LC961;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RepeatedElemenArrayTest {

    RepeatedElemenArray obj = new RepeatedElemenArray();


    @Test
    @DisplayName("Example 2: Input : nums = [1,2,3,3]")
    void example2(){
        Assertions.assertEquals(3, obj.repeatedNTimes(new int[]{1,2,3,3}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [2,1,2,5,3,2]")
    void example1(){
        Assertions.assertEquals( 2, obj.repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }

    @Test
    @DisplayName("Example 3: Input :  nums = [5,1,5,2,5,3,5,4]")
    void example3(){
        Assertions.assertEquals( 5, obj.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

}
