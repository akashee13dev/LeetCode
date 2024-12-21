package LC1869;

public class LongerContiguousSegmentsofOnesthanZeros {

    public boolean checkZeroOnes(String s) {

        int oneCount = 0;
        int zeroCount = 0 ;
        int oneCountTemp = 0;
        int zeroCountTemp = 0;
        char[] numbers = s.toCharArray();
        for (char num : numbers){
            if(num == '1'){
                oneCount++;
                //Set 0 Details
                zeroCountTemp = Math.max(zeroCountTemp, zeroCount);
                zeroCount = 0;
            }
            else {
                zeroCount++;
                //Set 1 Details
                oneCountTemp = Math.max(oneCountTemp, oneCount);
                oneCount = 0;
            }
        }
        oneCountTemp = Math.max(oneCountTemp, oneCount);
        zeroCountTemp = Math.max(zeroCountTemp, zeroCount);
        return oneCountTemp > zeroCountTemp;
    }

}
