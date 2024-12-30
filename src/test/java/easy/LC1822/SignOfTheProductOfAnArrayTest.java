package easy.LC1822;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SignOfTheProductOfAnArrayTest {

    SignOfTheProductOfAnArray obj = new SignOfTheProductOfAnArray();


    @Test
    @DisplayName("Example 1: Input: nums = [1,1,1]")
    void example1(){
        Assertions.assertEquals(1,obj.arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [1,5,2,4,1]")
    void example2(){
        Assertions.assertEquals(0,obj.arraySign(new int[]{1,5,0,2,-3}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [8]")
    void example3(){
        Assertions.assertEquals(-1,obj.arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [8]")
    void example4(){
        Assertions.assertEquals(-1,obj.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }


}
