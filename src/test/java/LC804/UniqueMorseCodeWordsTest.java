package LC804;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UniqueMorseCodeWordsTest {

    UniqueMorseCodeWords obj = new UniqueMorseCodeWords();


    @Test
    @DisplayName("Example 1: Input :  words = [\"gin\",\"zen\",\"gig\",\"msg\"]")
    void example1(){
        Assertions.assertEquals( 2, obj.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }

    @Test
    @DisplayName("Example 3: Input : words = [\"a\"]")
    void example3(){
        Assertions.assertEquals( 1, obj.uniqueMorseRepresentations(new String[]{"a"}));
    }


}
