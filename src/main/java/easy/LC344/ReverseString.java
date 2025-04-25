package easy.LC344;

public class ReverseString {

    public char[] reverseString(char[] s) {
//        char[] clone = s.clone();
//        char[] reverse = s;
//        int ind = s.length - 1;
//        for (char c : clone){
//            reverse[ind] = c;
//            ind --;
//        }
//        return s;


        int ind = s.length - 1;
        int start = 0;
        int end = ind;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }

}
