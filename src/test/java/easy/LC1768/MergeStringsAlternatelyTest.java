package easy.LC1768;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {

    MergeStringsAlternately obj = new MergeStringsAlternately();


    @Test
    @DisplayName("Example 1: Input : word1 = \"abc\", word2 = \"pqr\"")
    void example1(){
        Assertions.assertEquals("apbqcr",obj.mergeAlternately("abc","pqr"));
    }

    @Test
    @DisplayName("Example 1: Input : word1 = \"ab\", word2 = \"pqrs\"")
    void example2(){
        Assertions.assertEquals("apbqrs",obj.mergeAlternately("ab","pqrs"));
    }

    @Test
    @DisplayName("Example 1: Input : word1 = \"abcd\", word2 = \"pq\"")
    void example3(){
        Assertions.assertEquals("apbqcd",obj.mergeAlternately("abcd","pq"));
    }

}
