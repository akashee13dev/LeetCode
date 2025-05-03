package medium.LC2762;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContinuouSubarraysTest {

    ContinuouSubarrays obj = new ContinuouSubarrays();

    @Test
    @DisplayName("Test Case 1: nums = [5,4,2,4]")
    void example1(){
        Assertions.assertEquals(8, obj.continuousSubarrays(new int[]{5,4,2,4}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [1,2,3]")
    void example2(){
        Assertions.assertEquals(6, obj.continuousSubarrays(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [65,66,67,66,66,65,64,65,65,64]")
    void example3(){
        Assertions.assertEquals(43, obj.continuousSubarrays(new int[]{65,66,67,66,66,65,64,65,65,64}));
    }
}
