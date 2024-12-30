package easy.LC190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {

    ReverseBits obj = new ReverseBits();

    @Test
    public void testReverseBitsExample1() {
        // Example 1: n = 00000010100101000001111010011100
        int input = 43261596; // Binary: 00000010100101000001111010011100
        int expectedOutput = 964176192; // Binary: 00111001011110000010100101000000
        Assertions.assertEquals(expectedOutput, obj.reverseBits(input));
    }

    @Test
    public void testReverseBitsExample2() {
        // Example 2: n = 11111111111111111111111111111101
        long input = 4294967293L; // Binary: 11111111111111111111111111111101 (casted to long)
        long expectedOutput = 3221225471L; // Binary: 10111111111111111111111111111111
        Assertions.assertEquals(expectedOutput, obj.reverseBits((int) input)); // We pass as int but treat it as unsigned
    }

}
