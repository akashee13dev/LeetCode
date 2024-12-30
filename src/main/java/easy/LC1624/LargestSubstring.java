package easy.LC1624;

public class LargestSubstring {

    public int maxLengthBetweenEqualCharacters(String s) {

        int length = s.length();
        boolean isUnique = s.chars().distinct().count() == length;
        if (isUnique){
            return -1;
        }
        if(s.charAt(0) == s.charAt(length-1)){
            return length - 2;
        }
        int len = -1;
        for (int j=0;j<length ; j++){
            char letter = s.charAt(j);
            if(s.chars().distinct().anyMatch(ch -> ch == letter)){
                for (int i = j; i<length-1 ; i++){
                    if(s.charAt(i+1) == letter){
                        len = Math.max(len,i - j);
                    }
                }
            }
        }
        return len;

    }

}
