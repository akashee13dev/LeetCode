package medium.LC153;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindMinimumRotatedSortedArrayTest {

    FindMinimumRotatedSortedArray obj = new FindMinimumRotatedSortedArray();


    @Test
    @DisplayName("Test Case 1: Input: [3,4,5,1,2]")
    void example1(){
        Assertions.assertEquals(1, obj.findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [4,5,6,7,0,1,2]")
    void example2(){
        Assertions.assertEquals(0, obj.findMin(new int[]{4,5,6,7,0,1,2}));
    }


    @Test
    @DisplayName("Test Case 3: Input: nums = [11,13,15,17]")
    void example3(){
        Assertions.assertEquals(11, obj.findMin(new int[]{11,13,15,17}));
    }

}
