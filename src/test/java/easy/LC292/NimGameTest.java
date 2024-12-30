package easy.LC292;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NimGameTest {

    NimGame obj = new NimGame();

    @Test
    @DisplayName("Example 5: Input : n = 4")
    void example5(){
        Assertions.assertFalse(obj.canWinNim(4));
    }

    @Test
    @DisplayName("Example 4: Input : n = 1")
    void example4(){
        Assertions.assertTrue(obj.canWinNim(1));
    }

    @Test
    @DisplayName("Example 6: Input : n = 2")
    void example6(){
        Assertions.assertTrue(obj.canWinNim(2));
    }

    @Test
    @DisplayName("Example 7: Input : n = 6")
    void example7(){
        Assertions.assertTrue(obj.canWinNim(6));
    }

}
