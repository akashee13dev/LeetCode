package LC1880;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckifWordEqualsSummationofTwoWordsTest {

    CheckifWordEqualsSummationofTwoWords obj = new CheckifWordEqualsSummationofTwoWords();


    @Test
    @DisplayName("Example 1: Input: firstWord = \"acb\", secondWord = \"cba\", targetWord = \"cdb\"")
    void example1(){
        Assertions.assertTrue(obj.isSumEqual("acb", "cba", "cdb"));
    }

    @Test
    @DisplayName("Example 2: Input: firstWord = \"aaa\", secondWord = \"a\", targetWord = \"aab\"")
    void example2(){
        Assertions.assertFalse(obj.isSumEqual("aaa","a","aab"));
    }


    @Test
    @DisplayName("Example 2: Input: firstWord = \"aaa\", secondWord = \"a\", targetWord = \"aaaa\"")
    void example3(){
        Assertions.assertTrue(obj.isSumEqual("aaa","a","aaaa"));
    }


}
