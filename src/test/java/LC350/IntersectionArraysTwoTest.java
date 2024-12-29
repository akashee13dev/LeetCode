package LC350;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntersectionArraysTwoTest {


    IntersectionArraysTwo obj = new IntersectionArraysTwo();

    @Test
    @DisplayName("Example 5: Input : nums1 = [1,2,2,1], nums2 = [2,2]")
    void example5(){
        Assertions.assertArrayEquals(new int[]{2,2}, obj.intersect(new int[]{1,2,2,1},new int[]{2,2}));
    }

    @Test
    @DisplayName("Example 6: Input : nums1 = [4,9,5], nums2 = [9,4,9,8,4]")
    void example6(){
        Assertions.assertArrayEquals(new int[]{4,9}, obj.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4}));
    }

    @Test
    @DisplayName("Example 7: Input : nums1 = [3,1,2], nums2 = [1,1]")
    void example7(){
        Assertions.assertArrayEquals(new int[]{1}, obj.intersect(new int[]{3,1,2},new int[]{1,1}));
    }

}
