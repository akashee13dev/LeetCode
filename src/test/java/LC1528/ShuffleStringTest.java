package LC1528;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShuffleStringTest {

    ShuffleString obj = new ShuffleString();

    @Test
    @DisplayName("Example 1: Input : s = \"codeleet\", indices = [4,5,6,7,0,2,1,3]")
    void example1(){
        Assertions.assertEquals("leetcode", obj.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    @Test
    @DisplayName("Example 2: Input : s = \"abc\", indices = [0,1,2]")
    void example2(){
        Assertions.assertEquals("abc", obj.restoreString("abc", new int[]{0,1,2}));
    }

    @Test
    @DisplayName("Test Case 3: Input : s = \"abcdef\", indices = [5,4,3,2,1,0]")
    void example3(){
        Assertions.assertEquals("fedcba", obj.restoreString("abcdef", new int[]{5,4,3,2,1,0}));
    }

    @Test
    @DisplayName("Test Case 4: Input : s = \"hello\", indices = [1,0,3,4,2]")
    void example4(){
        Assertions.assertEquals("eholl", obj.restoreString("hello", new int[]{1,0,3,4,2}));
    }

    @Test
    @DisplayName("Test Case 5: Input : s = \"apple\", indices = [4,3,2,1,0]")
    void example5(){
        Assertions.assertEquals("elppa", obj.restoreString("apple", new int[]{4,3,2,1,0}));
    }

    @Test
    @DisplayName("Test Case 6: Input : s = \"test\", indices = [3,2,1,0]")
    void example6(){
        Assertions.assertEquals("tset", obj.restoreString("test", new int[]{3,2,1,0}));
    }

    @Test
    @DisplayName("Test Case 7: Input : s = \"abcde\", indices = [0,1,2,3,4]")
    void example7(){
        Assertions.assertEquals("abcde", obj.restoreString("abcde", new int[]{0,1,2,3,4}));
    }

    @Test
    @DisplayName("Test Case 8: Input : s = \"xyz\", indices = [2,1,0]")
    void example8(){
        Assertions.assertEquals("zyx", obj.restoreString("xyz", new int[]{2,1,0}));
    }

    @Test
    @DisplayName("Test Case 9: Input : s = \"openai\", indices = [5,4,3,2,1,0]")
    void example9(){
        Assertions.assertEquals("ianepo", obj.restoreString("openai", new int[]{5,4,3,2,1,0}));
    }

}
