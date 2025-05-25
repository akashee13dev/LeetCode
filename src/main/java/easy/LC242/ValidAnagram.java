package easy.LC242;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        int oneLen = s.length();
        int twoLen = t.length();

        if(oneLen == twoLen){
            if(s.equals(t)){
                return true;
            }
            int[] array = new int[26];
            char[] charOne = s.toCharArray();
            char[] charTwo = t.toCharArray();

            for(int ind = 0 ; ind < oneLen; ind++){ //O(n)
                array[charOne[ind]- 'a']++;
                array[charTwo[ind]- 'a']--;
            }
            for(int ele : array){ //O(1)
                if(ele != 0 ){
                    return false;
                }
            }
            return true;
        }
        return false;


//        if(s.length() == t.length() && s.contains(t)){
//            return true;
//        }
//
//        int len = s.length();
//        int tLen = t.length();
//        for (int i = 0 ; i<len; i++){
//            for (int j = 0 ; j < tLen ; j++){
//                if(s.replaceAll(" ","").equals(t.replaceAll(" ",""))){
//                    return true;
//                }
//                if(s.charAt(i) == t.charAt(j)){
//                    s = s.replaceFirst(s.charAt(i)+""," ");
//                    t = t.replaceFirst(t.charAt(j)+""," ");
//                    break;
//                }
//                if(s.isBlank() && t.isBlank()){
//                    return true;
//                }
//            }
//        }
//        return s.isBlank() && t.isBlank();

    }

}
