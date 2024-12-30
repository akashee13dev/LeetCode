package easy.LC349;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionArraysTest {

    IntersectionArrays obj = new IntersectionArrays();

    @Test
    @DisplayName("Example 5: Input : nums1 = [1,2,2,1], nums2 = [2,2]")
    void example5(){
        Assertions.assertArrayEquals(new int[]{2}, obj.intersection(new int[]{1,2,2,1},new int[]{2,2}));
    }

    @Test
    @DisplayName("Example 6: Input : nums1 = [4,9,5], nums2 = [9,4,9,8,4]")
    void example6(){
        Assertions.assertArrayEquals(new int[]{4,9}, obj.intersection(new int[]{4,9,5},new int[]{9,4,9,8,4}));
    }

}
