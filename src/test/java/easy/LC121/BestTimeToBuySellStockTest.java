package easy.LC121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BestTimeToBuySellStockTest {

    BestTimeToBuySellStock obj = new BestTimeToBuySellStock();


    @Test
    @DisplayName("Test Case 1: prices = [7,1,5,3,6,4]")
    void example2(){
        Assertions.assertEquals(5, obj.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    @DisplayName("Test Case 2: prices = [7,6,4,3,1]")
    void example3(){
        Assertions.assertEquals(0, obj.maxProfit(new int[]{7,6,4,3,1}));
    }


}
