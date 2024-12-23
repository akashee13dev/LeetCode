package LC27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    RemoveElement obj = new RemoveElement();

    @Test
    @DisplayName("Test Case 1: Input: nums = [3,2,2,3], val = 3")
    void example1(){
        Assertions.assertEquals(2,obj.removeElement(new int[]{3,2,2,3},3));
    }

    @Test
    @DisplayName("Test Case 2: Input:  nums = [0,1,2,2,3,0,4,2], val = 2")
    void example2(){
        Assertions.assertEquals(5,obj.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }

}
