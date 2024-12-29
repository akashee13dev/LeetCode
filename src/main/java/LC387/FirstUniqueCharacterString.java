package LC387;

public class FirstUniqueCharacterString {

    public int firstUniqChar(String s) {

        int len = s.length();
        if(len < 2){
            return 0;
        }

        boolean isMatched = false;
        for (int i = 0 ; i<len ; i++){
            for (int j = 0 ; j<len ; j++){
                if(i!=j){
                    if(s.charAt(i) == s.charAt(j)){
                        isMatched = true;
                        break;
                    }
                }
            }
            if(!isMatched){
                return i;
            }
            isMatched = false;
        }

        return -1;

    }

}
