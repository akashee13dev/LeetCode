package easy.LC1748;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfUniqueElementsTest {


    SumOfUniqueElements obj = new SumOfUniqueElements();

    @Test
    @DisplayName("Example 3: Input :  nums = [1,2,3,2]")
    void example(){
        Assertions.assertEquals(4,obj.sumOfUnique(new int[]{1,2,3,2}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [1,1,1,1,1]")
    void example1(){
        Assertions.assertEquals(0,obj.sumOfUnique(new int[]{1,1,1,1,1}));
    }

    @Test
    @DisplayName("Example 2: Input : nums = [1,2,3,4,5]")
    void example2(){
        Assertions.assertEquals(15,obj.sumOfUnique(new int[]{1,2,3,4,5}));
    }

}
