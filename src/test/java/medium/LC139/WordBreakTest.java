package medium.LC139;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class WordBreakTest {

    WordBreak obj = new WordBreak();


    @Test
    @DisplayName("Test Case 1: Input: s = \"leetcode\", wordDict = [\"leet\",\"code\"]")
    void example1(){
        Assertions.assertTrue(obj.wordBreak("leetcode", Arrays.asList("leet","code")));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"applepenapple\", wordDict = [\"apple\",\"pen\"]")
    void example2(){
        Assertions.assertTrue( obj.wordBreak("applepenapple",Arrays.asList("apple","pen")));
    }


    @Test
    @DisplayName("Test Case 3: Input: s = \"catsandog\", wordDict = [\"cats\",\"dog\",\"sand\",\"and\",\"cat\"]")
    void example3(){
        Assertions.assertFalse( obj.wordBreak("catsandog",Arrays.asList("cats","dog","sand","and","cat")));
    }


    @Test
    @DisplayName("Test Case 4: Input: s = \"cars\", wordDict = [\"car\",\"ca\",\"rs\"]")
    void example4(){
        Assertions.assertTrue( obj.wordBreak("cars",Arrays.asList("car","ca","rs")));
    }

}
