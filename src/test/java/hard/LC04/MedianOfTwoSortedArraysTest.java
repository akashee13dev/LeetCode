package hard.LC04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();

    @Test
    @DisplayName("Test Case 1: nums1 = [1,3], nums2 = [2]")
    void example1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Assertions.assertEquals(2.0, obj.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    @DisplayName("Test Case 2: nums1 = [1,2], nums2 = [3,4]")
    void example2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Assertions.assertEquals(2.5, obj.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    @DisplayName("Edge Case: nums1 = [], nums2 = [1]")
    void edgeCase1() {
        int[] nums1 = {};
        int[] nums2 = {1};
        Assertions.assertEquals(1.0, obj.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    @DisplayName("Edge Case: nums1 = [2], nums2 = []")
    void edgeCase2() {
        int[] nums1 = {2};
        int[] nums2 = {};
        Assertions.assertEquals(2.0, obj.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

    @Test
    @DisplayName("Test Case: nums1 = [0,0], nums2 = [0,0]")
    void allZeros() {
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        Assertions.assertEquals(0.0, obj.findMedianSortedArrays(nums1, nums2), 0.00001);
    }

}
