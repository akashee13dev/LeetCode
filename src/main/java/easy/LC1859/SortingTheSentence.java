package easy.LC1859;

public class SortingTheSentence {

    public String sortSentence(String s) {

        String[] wordArray = s.split(" ");
        String[] soterdWordArray = new String[wordArray.length];
        for (String word : wordArray){
            int index = Integer.parseInt(word.charAt(word.length()-1)+"");
            String actualWord = word.substring(0,word.length()-1);
            soterdWordArray[index-1] = actualWord;
        }

        String sentence = "";
        for (String sortedWord : soterdWordArray){
            sentence = sentence.concat(sortedWord)+" ";
        }
        return sentence.substring(0,sentence.length()-1);
    }

}
