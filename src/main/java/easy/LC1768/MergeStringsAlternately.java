package easy.LC1768;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

//        if(word1.isEmpty() ){
//            return word2;
//        }
//        if(word2.isEmpty() ){
//            return word1;
//        }
//        String mergeString = "";
//        int wordOneLen = word1.length();
//        int wordTwoLen = word2.length();
//        int loopLen = Math.min(wordOneLen,wordTwoLen);
//        for (int i=0;i < loopLen ; i++){
//            mergeString =mergeString.concat(word1.charAt(i)+"").concat(word2.charAt(i)+"");
//        }
//        if(wordOneLen == wordTwoLen){
//            return mergeString;
//        }
//        else{
//            mergeString = mergeString.concat(wordOneLen > wordTwoLen ? word1.substring(loopLen) : word2.substring(loopLen));
//            return mergeString;
//        }

        char[] wordOne = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();

        int wordOneLen = wordOne.length;
        int wordTwoLen = wordTwo.length;
        char[] concatChars = new char[wordOneLen+wordTwoLen];
        int i=0;
        int index = 0;
        while (i < wordOneLen || i< wordTwoLen){
            if(i < wordOneLen){
                concatChars[index] = wordOne[i];
                index++;
            }
            if(i < wordTwoLen){
                concatChars[index] = wordTwo[i];
                index++;
            }
            i++;
        }
        return new String(concatChars);

    }

}
