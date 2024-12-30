package easy.LC191;

public class NumberOf1Bits {

    public int hammingWeight(int n) {


        String bits = Integer.toBinaryString(n);
        bits = bits.replaceAll("[^1]","");
        return bits.length();

    }

}
