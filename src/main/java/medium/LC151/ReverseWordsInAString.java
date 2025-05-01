package medium.LC151;

public class ReverseWordsInAString {

    public String reverseWords(String s) {

        String [] arr = s.split(" ");
        int len = arr.length;
        if(len == 1){
            return s.replaceAll(" ","");
        }
        int start = 0;
        int end = len-1;

        while (start < end){
            while(start < end && (arr[start].isEmpty() || arr[start].isBlank())){
                start++;
            }
            while(start < end && (arr[end].isEmpty() || arr[end].isBlank())){
                end--;
            }
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        StringBuilder builder = new StringBuilder();
        for (int i=0 ; i<= len - 1 ; i++){
            if(arr[i].isEmpty() || arr[i].isBlank()){
                continue;
            }
            builder.append(arr[i]);
            if(i != len - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
