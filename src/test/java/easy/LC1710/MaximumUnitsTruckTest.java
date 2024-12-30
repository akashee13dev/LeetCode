package easy.LC1710;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumUnitsTruckTest {

    MaximumUnitsTruck obj =  new MaximumUnitsTruck();


    @Test
    @DisplayName("Example 2: Input : boxTypes = {{1,3},{2,2},{3,1}}, truckSize = 4")
    void example3(){
        Assertions.assertEquals(8,obj.maximumUnits(new int[][]{{1,3},{2,2},{3,1}},4));
    }

    @Test
    @DisplayName("Example 3: Input : boxTypes = {{5,10},{2,5},{4,7},{3,9}}, truckSize = 10")
    void example4(){
        Assertions.assertEquals(91,obj.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}},10));
    }

}
