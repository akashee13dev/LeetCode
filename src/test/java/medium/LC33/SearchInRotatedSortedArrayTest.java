package medium.LC33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();




    @Test
    @DisplayName("Test Case 1: Input: [4,5,6,7,0,1,2]")
    void example1(){
        Assertions.assertEquals(4, obj.search(new int[]{4,5,6,7,0,1,2},0));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [4,5,6,7,0,1,2]")
    void example2(){
        Assertions.assertEquals(-1, obj.search(new int[]{4,5,6,7,0,1,2},3));
    }


    @Test
    @DisplayName("Test Case 3: Input: nums = [1]")
    void example3(){
        Assertions.assertEquals(-1, obj.search(new int[]{1},0));
    }


}
