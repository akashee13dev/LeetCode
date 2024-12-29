package LC383;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    RansomNote obj = new RansomNote();

    @Test
    @DisplayName("Example 5: Input : ransomNote = \"a\", magazine = \"b\"")
    void example5(){
        Assertions.assertFalse( obj.canConstruct("a","b"));
    }

    @Test
    @DisplayName("Example 6: Input : ransomNote = \"aa\", magazine = \"ab\"")
    void example6(){
        Assertions.assertFalse( obj.canConstruct("aa","ab"));
    }

    @Test
    @DisplayName("Example 7: Input : ransomNote = \"aa\", magazine = \"aab\"")
    void example7(){
        Assertions.assertTrue( obj.canConstruct("aa","aab"));
    }

}
