package medium.LC332;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {

    CoinChange obj = new CoinChange();

    @Test
    @DisplayName("Test Case 1: Input:  coins = [1,2,5], amount = 11")
    void example1(){
        Assertions.assertEquals(3, obj.coinChange(new int[]{1,2,5},11));
    }

    @Test
    @DisplayName("Test Case 2: Input: coins = [2], amount = 3")
    void example2(){
        Assertions.assertEquals(-1, obj.coinChange(new int[]{2},3));
    }


    @Test
    @DisplayName("Test Case 3: Input: coins = [1], amount = 0")
    void example3(){
        Assertions.assertEquals(0, obj.coinChange(new int[]{1},0));
    }


}
