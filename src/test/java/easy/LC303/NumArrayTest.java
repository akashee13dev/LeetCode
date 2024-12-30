package easy.LC303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumArrayTest {


    @Test
    @DisplayName("Example 1 : Input : [\"NumArray\", \"sumRange\", \"sumRange\", \"sumRange\"] [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]")
    public void example1(){

        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1,obj.sumRange(0,2));
        Assertions.assertEquals(-1,obj.sumRange(2,5));
        Assertions.assertEquals(-3,obj.sumRange(0,5));
    }

}
