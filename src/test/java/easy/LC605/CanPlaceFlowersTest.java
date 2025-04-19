package easy.LC605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

    CanPlaceFlowers obj = new CanPlaceFlowers();

    @Test
    @DisplayName("Example 2: Input : flowerbed = [1,0,0,0,1], n = 1")
    void example2(){
        Assertions.assertTrue( obj.canPlaceFlowers(new int[]{1,0,0,0,1},1));
    }

    @Test
    @DisplayName("Example 1: Input :  flowerbed = [1,0,0,0,1], n = 2")
    void example1(){
        Assertions.assertFalse(  obj.canPlaceFlowers(new int[]{1,0,0,0,1},2));
    }


}
