package easy.LC202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {


    HappyNumber obj = new HappyNumber();


    @Test
    @DisplayName("Example 3: Input : n = 19")
    void example3(){
        Assertions.assertTrue( obj.isHappy(19));
    }

    @Test
    @DisplayName("Example 4: Input : n = 2")
    void example4(){
        Assertions.assertFalse( obj.isHappy(2));
    }



}
