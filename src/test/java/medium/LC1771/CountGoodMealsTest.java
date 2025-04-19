package medium.LC1771;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountGoodMealsTest {

    CountGoodMeals obj = new CountGoodMeals();

    @Test
    @DisplayName("Test Case 2: deliciousness = [1,3,5,7,9]")
    void example2(){
        Assertions.assertEquals(4, obj.countPairs(new int[]{1,3,5,7,9}));
    }

    @Test
    @DisplayName("Test Case 3: deliciousness = [1,1,1,3,3,3,7]")
    void example3(){
        Assertions.assertEquals(15, obj.countPairs(new int[]{1,1,1,3,3,3,7}));
    }

}
