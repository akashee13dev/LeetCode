package medium.LC139;

import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i=0 ; i<=s.length();i++){
            for (int j=i-1 ; j>=0;j--){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

//    public boolean wordBreak(String s, List<String> wordDict) {
//        int[] dp = new int[wordDict.size()];
//        Arrays.fill(dp,-1);
//        return isWordBreak(s,wordDict,0,wordDict.size()-1,dp);
//    }
//
//    private boolean isWordBreak(String text , List<String> wordDict , int index , int n,int[] dp){
//        if(index > n){
//            return false;
//        }
//        if(dp[index] != -1){
//            return dp[index] != 0;
//        }
//        String word = wordDict.get(index);
//        boolean isWordBreak = false;
//        if(text.contains(word)){
//            String newWord = text.replaceAll(word,"");
//            if(newWord.isEmpty()){
//                dp[index] = 1 ;
//                return true;
//            }
//            else {
//                isWordBreak = isWordBreak(newWord , wordDict,index+1,n,dp);
//                dp[index] = isWordBreak ? 1 : 0;
//            }
//        }
//        dp[index] = isWordBreak || isWordBreak(text , wordDict , index+1 , n,dp) ? 1 : 0;
//        return dp[index] == 1 ;
//    }
}
