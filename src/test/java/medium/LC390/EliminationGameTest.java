package medium.LC390;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class EliminationGameTest {

    EliminationGame obj = new EliminationGame();

    @Test
    @DisplayName("Test Case 2: Input: n = 9")
    void example2(){
        Assertions.assertEquals(6, obj.lastRemaining(9));
    }

    @Test
    @DisplayName("Test Case 3: n = 1")
    void example3(){
        Assertions.assertEquals(1, obj.lastRemaining(1));
    }


}
