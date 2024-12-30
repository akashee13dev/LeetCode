package easy.LC1716;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateMoneyTest {

    CalculateMoney obj = new CalculateMoney();


    @Test
    @DisplayName("Example 2: Input : n = 4")
    void example2(){
        Assertions.assertEquals(10,obj.totalMoney(4));
    }


    @Test
    @DisplayName("Example 2: Input : n = 10")
    void example3(){
        Assertions.assertEquals(37,obj.totalMoney(10));
    }

    @Test
    @DisplayName("Example 3: Input : n = 20")
    void example4(){
        Assertions.assertEquals(96,obj.totalMoney(20));
    }

}
