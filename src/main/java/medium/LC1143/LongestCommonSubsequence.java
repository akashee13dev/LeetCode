package medium.LC1143;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        if(!hasCommonCharacter(text1,text2)){
            return 0;
        }
        int xLen = text1.length();
        int yLen = text2.length();
        int[][] dp = new int[xLen+1][yLen+1];

        for (int i=1;i<=xLen;i++){
            for (int j=1;j<=yLen;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 +  dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[xLen][yLen];

 //       return getLongestSubSequence(text1,text2,xLen-1,yLen-1,dp);
    }
    public boolean hasCommonCharacter(String s1, String s2) {
        int mask1 = 0, mask2 = 0;
        for (char c : s1.toCharArray()){
            mask1 |= (1 << (c - 'a'));
        }
        for (char c : s2.toCharArray()){
            mask2 |= (1 << (c - 'a'));
        }
        return (mask1 & mask2) != 0;
    }

    private int getLongestSubSequence(String text1 , String text2 , int x , int y,int[][]dp){

        if(x < 0 || y <0){
            return 0;
        }
        if(dp[x][y] != 0){
            return dp[x][y];
        }
        if(text1.charAt(x) == text2.charAt(y)){
            return dp[x][y] = 1 + getLongestSubSequence(text1,text2,x-1,y-1,dp);
        }
        else {
            return dp[x][y] = Math.max(getLongestSubSequence(text1,text2,x-1,y,dp) , getLongestSubSequence(text1,text2,x,y-1,dp));
        }
    }

}
