package medium.LC567;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        if(s2.isEmpty()){
            return false;
        }
        if(s1.isEmpty()){
            return true;
        }
        int oneLen = s1.length();
        int twoLen = s2.length();

        int[] oneFreq = new int[26];
        int[] twoFreq = new int[26];

        for (int i = 0 ; i<oneLen ; i++){
            oneFreq[s1.charAt(i)-'a']++;
            twoFreq[s2.charAt(i)-'a']++;
        }

        for (int i = 0 ; i<twoLen-oneLen ; i++){
            if(containsSameString(oneFreq,twoFreq)){
                return true;
            }
            twoFreq[s2.charAt(i+oneLen)-'a']++;
            twoFreq[s2.charAt(i)-'a']--;
        }
        return containsSameString(oneFreq,twoFreq);
    }

    private boolean containsSameString(int[] oneFreq, int[] twoFreq) {
        for (int i =0 ; i<26 ; i++){
            if(oneFreq[i] != twoFreq[i]){
                return false;
            }
        }
        return true;
    }

}
