package medium.LC271;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CustomEncoderDecoderTest {

    CustomEncoderDecoder obj = new CustomEncoderDecoder();

    @Test
    @DisplayName("Test Case 1: Encode [\"abx\", \"a\", \"\", \"akash\", null]")
    void testEncode() {
        List<String> input = Arrays.asList("abx", "a", "", "akash", null);
        String expected = "$abx$a!$akash@";
        String actual = obj.encode(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test Case 2: Decode \"abx$a@akash!\"")
    void testDecode() {
        String input = "$abx$a!$akash@";
        List<String> expected = Arrays.asList("abx", "a", "", "akash", null);
        List<String> actual = obj.decode(input);
        Assertions.assertEquals(expected, actual);
    }

}
