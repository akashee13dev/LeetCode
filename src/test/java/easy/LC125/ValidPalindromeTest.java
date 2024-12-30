package easy.LC125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome obj = new ValidPalindrome();


    @Test
    @DisplayName("Example 1: Input : s = \"A man, a plan, a canal: Panama\"")
    void example1(){
        Assertions.assertTrue(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    @DisplayName("Example 2: Input : s = \"race a car\"")
    void example2(){
        Assertions.assertFalse(obj.isPalindrome("race a car"));
    }

    @Test
    @DisplayName("Example 3: Input : s = \" \"")
    void example3(){
        Assertions.assertTrue( obj.isPalindrome(" "));
    }

    @Test
    @DisplayName("Example 4: Input : s = \"0P\"")
    void example4(){
        Assertions.assertFalse( obj.isPalindrome("0P"));
    }

}
