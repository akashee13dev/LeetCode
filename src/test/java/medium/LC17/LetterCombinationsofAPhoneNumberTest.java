package medium.LC17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LetterCombinationsofAPhoneNumberTest {

    LetterCombinationsofAPhoneNumber obj = new LetterCombinationsofAPhoneNumber();


    @Test
    @DisplayName("Test Case 2: Input: digits = \"23\"")
    void example2(){
        Assertions.assertEquals(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"), obj.letterCombinations("23"));
    }

    @Test
    @DisplayName("Test Case 3: Input: digits = \"\"")
    void example3(){
        Assertions.assertEquals(Arrays.asList(), obj.letterCombinations(""));
    }

    @Test
    @DisplayName("Test Case 4: Input: digits = \"2\"")
    void example4(){
        Assertions.assertEquals(Arrays.asList("a","b","c"), obj.letterCombinations("2"));
    }



}
