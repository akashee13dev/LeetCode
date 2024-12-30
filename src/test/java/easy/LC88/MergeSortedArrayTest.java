package easy.LC88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    MergeSortedArray obj = new MergeSortedArray();


    @Test
    @DisplayName("Test Case 1: Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3")
    void example1(){
        Assertions.assertArrayEquals(new int[]{1,2,2,3,5,6},obj.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3));
    }
    @Test
    @DisplayName("Test Case 2: Input: nums1 = [1], m = 1, nums2 = [], n = 0")
    void example2(){
        Assertions.assertArrayEquals(new int[]{1},obj.merge(new int[]{1},1,new int[]{},0));
    }
    @Test
    @DisplayName("Test Case 3: Input: nums1 = [0], m = 0, nums2 = [1], n = 1")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1},obj.merge(new int[]{},0,new int[]{1},1));
    }


}
