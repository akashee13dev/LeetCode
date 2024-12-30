package easy.LC344;

public class ReverseString {

    public char[] reverseString(char[] s) {
        char[] clone = s.clone();
        char[] reverse = s;
        int ind = s.length - 1;
        for (char c : clone){
            reverse[ind] = c;
            ind --;
        }
        return s;
    }

}
