package easy.LC9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    PalindromeNumber obj = new PalindromeNumber();


    @Test
    @DisplayName("Test Case 3: Input: x = 121")
    void example3(){
        Assertions.assertTrue( obj.isPalindrome(121));
    }

    @Test
    @DisplayName("Test Case 4: Inpur : x = -121")
    void example4(){
        Assertions.assertFalse( obj.isPalindrome(-121));
    }

    @Test
    @DisplayName("Test Case 2: Input : x = 10")
    void example2(){
        Assertions.assertFalse( obj.isPalindrome(10));
    }


}
