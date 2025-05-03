package medium.LC1007;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumDominoRotationsForEqualRowTest {

    MinimumDominoRotationsForEqualRow obj  = new MinimumDominoRotationsForEqualRow();

    @Test
    @DisplayName("Test Case 1: Input: tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]")
    void example2(){
        Assertions.assertEquals(2,obj.minDominoRotations(new int[]{2,1,2,4,2,2},new int[]{5,2,6,2,3,2}));
    }


    @Test
    @DisplayName("Test Case 2: tops = [3,5,1,2,3], bottoms = [3,6,3,3,4]")
    void example4(){
        Assertions.assertEquals(-1,obj.minDominoRotations(new int[]{3,5,1,2,3},new int[]{3,6,3,3,4}));
    }


}
