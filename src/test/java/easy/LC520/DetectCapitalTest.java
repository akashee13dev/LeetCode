package easy.LC520;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DetectCapitalTest {

    DetectCapital obj = new DetectCapital();

    @Test
    @DisplayName("Example 2: Input : word = \"USA\"")
    void example2(){
        Assertions.assertTrue( obj.detectCapitalUse("USA"));
    }

    @Test
    @DisplayName("Example 1: Input :  word = \"FlaG\"")
    void example1(){
        Assertions.assertFalse(  obj.detectCapitalUse("FlaG"));
    }

}
