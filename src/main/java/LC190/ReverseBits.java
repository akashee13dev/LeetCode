package LC190;

import java.math.BigInteger;

public class ReverseBits {

    public long reverseBits(int n) {
        //Taken From ChatGPT ... Learned new types like << , != , >> ...
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Shift result left to make space for the next bit
            result <<= 1;
            // Add the last bit of n to result
            result |= (n & 1);
            // Shift n right to process the next bit
            n >>= 1;
        }

        return result;


    }


}
