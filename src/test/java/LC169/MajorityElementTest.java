package LC169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    MajorityElement obj = new MajorityElement();



    @Test
    @DisplayName("Example 1: Input : nums = [3,2,3]")
    void example1(){
        Assertions.assertEquals(3,obj.majorityElement(new int[]{3,2,3}));
    }

    @Test
    @DisplayName("Example 2: Input : nums = [2,2,1,1,1,2,2]")
    void example2(){
        Assertions.assertEquals(2,obj.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }


}
