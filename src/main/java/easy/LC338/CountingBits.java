package easy.LC338;

public class CountingBits {
    public int[] countBits(int n) {

        int[] countBits = new int[n+1];
        for (int i=0 ; i<=n ; i++){
//            String binaryString = Integer.toBinaryString(i);
//            binaryString = binaryString.replaceAll("[^1]","");
//            countBits[i] = binaryString.length();

            int currentN = i + 0;
            int result = 0;
            for (int j=0 ; j<32 ; ++j){
                result += currentN & 1 ;
                currentN >>= 1;
            }
            countBits[i] = result;
        }
        return countBits;

    }
}
