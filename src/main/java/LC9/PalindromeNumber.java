package LC9;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        String num = x+"";
        String  numTemp = num;

        int len = num.length();

        for (int i=0;i<len;i++){
            if(!(num.charAt(i)+"").equals(numTemp.charAt(len-1-i)+"")){
                return false;
            }
        }
        return true;


    }

}
