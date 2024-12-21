package LC1884;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EggDropWith2EggsandNFloorsTest {

    EggDropWith2EggsandNFloors noOfFloors  = new EggDropWith2EggsandNFloors();

    @Test
    @DisplayName("Example 1: Input: eggCount=2")
    void example1(){
        Assertions.assertEquals(2 , noOfFloors.getExitFloor(2));
    }

    @Test
    @DisplayName("Example 2: Input: eggCount=1485")
    void example3(){
        Assertions.assertEquals(54 , noOfFloors.getExitFloor(1485));
    }

    @Test
    @DisplayName("Example 1: Input: eggCount=100")
    void example2(){
        Assertions.assertEquals(14 , noOfFloors.getExitFloor(100));
    }

}
