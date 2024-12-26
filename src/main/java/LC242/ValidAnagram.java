package LC242;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length() && s.contains(t)){
            return true;
        }

        int len = s.length();
        int tLen = t.length();
        for (int i = 0 ; i<len; i++){
            for (int j = 0 ; j < tLen ; j++){
                if(s.replaceAll(" ","").equals(t.replaceAll(" ",""))){
                    return true;
                }
                if(s.charAt(i) == t.charAt(j)){
                    s = s.replaceFirst(s.charAt(i)+""," ");
                    t = t.replaceFirst(t.charAt(j)+""," ");
                    break;
                }
                if(s.isBlank() && t.isBlank()){
                    return true;
                }
            }
        }
        return s.isBlank() && t.isBlank();

    }

}
