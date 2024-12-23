package LC1170;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CompareFrequencySmallestCharacterTest {

    CompareFrequencySmallestCharacter obj = new CompareFrequencySmallestCharacter();


    @Test
    @DisplayName("Test Case 1: Input : queries = [\"cbd\"], words = [\"zaaaz\"]")
    void example1(){
        Assertions.assertArrayEquals(new int[]{1}, obj.numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"}));
    }

    @Test
    @DisplayName("Test Case 2: Input : queries = [\"bbb\",\"cc\"], words = [\"a\",\"aa\",\"aaa\",\"aaaa\"]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{1, 2}, obj.numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"}));
    }

    @Test
    @DisplayName("Test Case 3: Input : queries = [\"a\",\"abc\"], words = [\"a\",\"aa\",\"aaa\"]")
    void example3(){
        Assertions.assertArrayEquals(new int[]{2, 2}, obj.numSmallerByFrequency(new String[]{"a", "abc"}, new String[]{"a", "aa", "aaa"}));
    }

    @Test
    @DisplayName("Test Case 4: Input : queries = [\"zzzz\",\"abcd\"], words = [\"z\",\"zz\",\"zzz\",\"zzzz\"]")
    void example4(){
        Assertions.assertArrayEquals(new int[]{0, 3}, obj.numSmallerByFrequency(new String[]{"zzzz", "abcd"}, new String[]{"z", "zz", "zzz", "zzzz"}));
    }

    @Test
    @DisplayName("Test Case 5: Input : queries = [\"aaa\",\"bbbb\"], words = [\"a\",\"aa\",\"aaa\"]")
    void example5(){
        Assertions.assertArrayEquals(new int[]{0, 0}, obj.numSmallerByFrequency(new String[]{"aaa", "bbbb"}, new String[]{"a", "aa", "aaa"}));
    }

    @Test
    @DisplayName("Test Case 6: Input : queries = [\"a\"], words = [\"zzzz\"]")
    void example6(){
        Assertions.assertArrayEquals(new int[]{1}, obj.numSmallerByFrequency(new String[]{"a"}, new String[]{"zzzz"}));
    }

    @Test
    @DisplayName("Test Case 7: Input : queries = [\"aa\",\"aaa\"], words = [\"bb\",\"b\"]")
    void example7(){
        Assertions.assertArrayEquals(new int[]{0, 0}, obj.numSmallerByFrequency(new String[]{"aa", "aaa"}, new String[]{"bb", "b"}));
    }

    @Test
    @DisplayName("Test Case 8: Input : queries = [\"abcdefg\"], words = [\"a\",\"ab\"]")
    void example8(){
        Assertions.assertArrayEquals(new int[]{0}, obj.numSmallerByFrequency(new String[]{"abcdefg"}, new String[]{"a", "ab"}));
    }

    @Test
    @DisplayName("Test Case 9: Input : queries = [\"aaaaa\",\"bbb\"], words = [\"c\",\"cc\",\"ccc\"]")
    void example9(){
        Assertions.assertArrayEquals(new int[]{0, 0}, obj.numSmallerByFrequency(new String[]{"aaaaa", "bbb"}, new String[]{"c", "cc", "ccc"}));
    }

    @Test
    @DisplayName("Test Case 10: Input : queries = [\"x\",\"y\"], words = [\"x\",\"y\",\"xy\"]")
    void example10(){
        Assertions.assertArrayEquals(new int[]{0, 0}, obj.numSmallerByFrequency(new String[]{"x", "y"}, new String[]{"x", "y", "xy"}));
    }

}
