package medium.LC424;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        int len = s.length();
        int start = 0;
        int result = 0;
        int[] charOccurence = new int[26];
        int max = 0;
        for (int end = 0; end < len ; end++){
            max = Math.max(max,++charOccurence[s.charAt(end)-'A']);
            if(end - start + 1 - max > k){
                charOccurence[s.charAt(start)-'A']--;
                start++;
            }

            result = Math.max(result,end - start + 1);
        }
        return result;
    }

    private boolean isValid(int strLen , int maxCharLen , int replaceCount){
        return strLen - maxCharLen <= replaceCount;
    }
}
