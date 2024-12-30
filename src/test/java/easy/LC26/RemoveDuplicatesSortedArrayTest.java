package easy.LC26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesSortedArrayTest {

    RemoveDuplicatesSortedArray obj = new RemoveDuplicatesSortedArray();

    @Test
    @DisplayName("Test Case 1: Input: nums = [1,1,2]")
    void example1(){
        Assertions.assertEquals(2,obj.removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    @DisplayName("Test Case 2: Input:  nums = [0,0,1,1,1,2,2,3,3,4]")
    void example2(){
        Assertions.assertEquals(5,obj.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

}
