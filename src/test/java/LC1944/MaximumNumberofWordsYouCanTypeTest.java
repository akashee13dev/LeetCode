package LC1944;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumNumberofWordsYouCanTypeTest {

    MaximumNumberofWordsYouCanType noOfWords  = new MaximumNumberofWordsYouCanType();

    @Test
    @DisplayName("Example 1: Input: text = \"leet code\", brokenLetters = \"e\"")
    void example1(){
        Assertions.assertEquals(0 , noOfWords.getMaximumWordsCanType("leet code","e"));
    }

    @Test
    @DisplayName("Example 1: Input: text = \"leet code\", brokenLetters = \"lt\"")
    void example2(){
        Assertions.assertEquals(1 , noOfWords.getMaximumWordsCanType("leet code","lt"));
    }

    @Test
    @DisplayName("Example 1: Input: text = \"hello world\", brokenLetters = \"ad\"")
    void example3(){
        Assertions.assertEquals(1 , noOfWords.getMaximumWordsCanType("hello world","ad"));
    }

}
