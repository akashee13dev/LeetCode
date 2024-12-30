package easy.LC344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    ReverseString obj = new ReverseString();


    @Test
    @DisplayName("Example 5: Input : s = [\"h\",\"e\",\"l\",\"l\",\"o\"]")
    void example5(){
        Assertions.assertArrayEquals(new char[]{'o','l','l','e','h'}, obj.reverseString(new char[]{'h','e','l','l','o'}));
    }

    @Test
    @DisplayName("Example 6: Input : s = [\'H\',\'a\',\'n\',\'n\',\'a\',\'h\']")
    void example6(){
        Assertions.assertArrayEquals(new char[]{'H','a','n','n','a','h'}, obj.reverseString(new char[]{'h','a','n','n','a','H'}));
    }

}
