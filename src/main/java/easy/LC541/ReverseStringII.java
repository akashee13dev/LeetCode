package easy.LC541;

public class ReverseStringII {

    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i =0 ; i <len ; i=i+(2*k)){
            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);
            while (start < end){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(chars);

    }


}
