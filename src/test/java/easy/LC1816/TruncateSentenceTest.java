package easy.LC1816;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TruncateSentenceTest {

    TruncateSentence obj = new TruncateSentence();


    @Test
    @DisplayName("Example 1: s = \"Hello how are you Contestant\", k = 4")
    void example1(){
        Assertions.assertEquals("Hello how are you",obj.truncateSentence("Hello how are you Contestant",4));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"What is the solution to this problem\", k = 4")
    void example2(){
        Assertions.assertEquals("What is the solution",obj.truncateSentence("What is the solution to this problem",4));
    }

}
