package LC345;

import LC344.ReverseString;

public class ReverseVowels {

    public String reverseVowels(String s) {

        int[] indexes = new int[s.length()];
        char[] vowels = new char[s.length()];
        String result = "";

        int index = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0 ; i<len ; i++){
            char c = chars[i];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                indexes[index] = i;
                vowels[index] = c;
                index++;
            }
        }

        int[] newIndexes = new int[index];
        char[] newVowels = new char[index];

        for (int i = 0 ; i<index ; i++){
            newVowels[i] = vowels[i];
            newIndexes[i] = indexes[i];
        }
        newVowels = new ReverseString().reverseString(newVowels);

        int indexInd = 0;
        int vowelLen = newVowels.length;
        for (int i = 0 ; i<len ; i++){
            if(indexInd < vowelLen &&  i == newIndexes[indexInd]){
                result = result.concat(newVowels[indexInd]+"");
                indexInd++;
            }
            else {
                result = result.concat(s.charAt(i)+"");
            }
        }
        return result;

    }


}
