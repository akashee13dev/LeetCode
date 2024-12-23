package LC28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ImplementStrTest {

    ImplementStr obj = new ImplementStr();



    @Test
    @DisplayName("Test Case 1: Input: haystack = \"sadbutsad\", needle = \"sad\"")
    void example1(){
        Assertions.assertEquals(0,obj.strStr("sadbutsad","sad"));
    }

    @Test
    @DisplayName("Test Case 2: Input:  haystack = \"leetcode\", needle = \"leeto\"")
    void example2(){
        Assertions.assertEquals(-1,obj.strStr("leetcode","leeto"));
    }

}
