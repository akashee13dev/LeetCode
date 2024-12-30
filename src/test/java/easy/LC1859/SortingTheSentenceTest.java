package easy.LC1859;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortingTheSentenceTest {

    SortingTheSentence obj = new SortingTheSentence();

    @Test
    @DisplayName("Example 1: Input:  s = \"is2 sentence4 This1 a3\"")
    void example1(){
        Assertions.assertEquals("This is a sentence",obj.sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"Myself2 Me1 I4 and3\"")
    void example2(){
        Assertions.assertEquals("Me Myself and I",obj.sortSentence("Myself2 Me1 I4 and3"));
    }

}
