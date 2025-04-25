package easy.LC345;

import easy.LC344.ReverseString;

import java.util.List;

public class ReverseVowels {

    public String reverseVowels(String s) {

        int len = s.length() -1 ;
        char[] letter = s.toCharArray();
        int start = 0;
        int end = len;
        List<Character> vowels = List.of('a','e', 'i' , 'o' , 'u' , 'A' , 'E' , 'I' ,'O' , 'U');
        while (start < end){
            while (start < end && !vowels.contains(letter[start]) ){
                start++;
            }
            while (start < end && !vowels.contains(letter[end]) ){
                end--;
            }
            char temp = letter[start];
            letter[start] = letter[end];
            letter[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(letter);
//
//
//        int[] indexes = new int[s.length()];
//        char[] vowels = new char[s.length()];
//        String result = "";
//
//        int index = 0;
//        char[] chars = s.toCharArray();
//        int len = chars.length;
//        for (int i = 0 ; i<len ; i++){
//            char c = chars[i];
//            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
//                indexes[index] = i;
//                vowels[index] = c;
//                index++;
//            }
//        }
//
//        int[] newIndexes = new int[index];
//        char[] newVowels = new char[index];
//
//        for (int i = 0 ; i<index ; i++){
//            newVowels[i] = vowels[i];
//            newIndexes[i] = indexes[i];
//        }
//        newVowels = new ReverseString().reverseString(newVowels);
//
//        int indexInd = 0;
//        int vowelLen = newVowels.length;
//        for (int i = 0 ; i<len ; i++){
//            if(indexInd < vowelLen &&  i == newIndexes[indexInd]){
//                result = result.concat(newVowels[indexInd]+"");
//                indexInd++;
//            }
//            else {
//                result = result.concat(s.charAt(i)+"");
//            }
//        }
//        return result;

    }


}
