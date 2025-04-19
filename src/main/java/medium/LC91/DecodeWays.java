package medium.LC91;

public class DecodeWays {

    public int numDecodings(String s) {
        int len = s.length();
        if(s.startsWith("0") && len <= 2){
            return 0;
        }
        int[] dp = new int[len];
        return numberOfEncodings(s,0,len-1,dp);


    }

    private int numberOfEncodings(String  s , int index , int len , int[] dp){
        if(index >= len){
            return s.substring(index).startsWith("0") ? 0 : 1;
        }
        if(dp[index] != 0){
            return dp[index];
        }
        String subString = s.substring(index,index+1);
        if(subString.startsWith("0")){
            return 0;
        }
        int firstDigit = numberOfEncodings(s,index+1 , len , dp);
        int secondDigit = 0;
        if((subString.equals("1") || subString.equals("2")) && Integer.valueOf(s.substring(index,index+2)) <= 26){
            secondDigit = numberOfEncodings(s,index+2 , len,dp);
        }
        return dp[index] = firstDigit+secondDigit;
    }



}
