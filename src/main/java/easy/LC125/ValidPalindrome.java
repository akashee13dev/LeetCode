package easy.LC125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if(s.isBlank() || s.isEmpty()){
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if(s.isEmpty() || s.isBlank() || s.length() == 1){
            return true;
        }

        s = s.toLowerCase();
        int len = s.length();

        for (int i = 0 ; i < len ; i++){
            if(!(s.charAt(i)+"").equals(s.charAt(len-1-i)+"")){
                return false;
            }
        }
        return true;

    }

}
