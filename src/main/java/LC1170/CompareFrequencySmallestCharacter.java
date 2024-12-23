package LC1170;

public class CompareFrequencySmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {


        int [] queryNum = new int[queries.length] ;
        int [] wordNum  = new int[words.length] ;

        int ind = 0;
        for(String query : queries){
            queryNum[ind] = getSmallFrequency(queries[ind]);
            ind ++;
        }
        ind = 0;
        for(String word : words){
            wordNum[ind] = getSmallFrequency(words[ind]);
            ind ++;
        }

        int[] smallFrequescy = new int[queryNum.length];
        int index = 0;
        for(int query : queryNum){
            int count = 0;
            for (int word : wordNum){
                count = query < word ? count+1 : count;
            }
            smallFrequescy[index] = count;
            index++;
        }
        return smallFrequescy;


    }

    private int getSmallFrequency(String query) {
        char[] letters = query.toCharArray();
        char small = letters[0];
        int frequency = 0;
        for (char letter : letters){
            if(letter < small){
                small = letter;
                frequency = 1;
            }
            else if(letter == small) {
                frequency++;
            }
        }
        return frequency;
    }

}
