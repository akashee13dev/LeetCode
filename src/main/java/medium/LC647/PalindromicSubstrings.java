package medium.LC647;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {

        int len = s.length();
        if (len == 0) return 0;
        int countOfPalindrome = 0;
        for (int i = 0 ; i<len ; i++){
            countOfPalindrome += expandAroundCorner(s , i , i);
            countOfPalindrome += expandAroundCorner(s , i , i+1);
        }
        return countOfPalindrome;

    }

    private int expandAroundCorner(String sub , int left , int right) {
        int subLen = sub.length();
        int count = 0;
        while (left >= 0 && right < subLen && sub.charAt(left) == sub.charAt(right)){
            left --;
            right++;
            count++;
        }
        return count;
    }


}
