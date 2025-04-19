package medium.LC1717;

public class MaximumScoreFromRemovingSubstrings {

    public int maximumGain(String s, int x, int y) {

        StringBuilder builder = new StringBuilder(s);
        int score = 0;

        int baIndex = builder.toString().indexOf("ba");
        int abIndex = builder.toString().indexOf("ab");
        if(abIndex < baIndex) {
            while (abIndex > -1){
                builder.replace(abIndex,abIndex+2,"");
                score+=x;
                abIndex = builder.toString().indexOf("ab");
            }
            baIndex = builder.toString().indexOf("ba");
            while (baIndex > -1){
                builder.replace(baIndex, baIndex +1,"");
                score+=y;
                baIndex = builder.toString().indexOf("ba");
            }
        }
        else {
            while (baIndex > -1){
                builder.replace(baIndex , baIndex+2,"");
                score+=y;
                baIndex = builder.toString().indexOf("ba");
            }
            abIndex = builder.toString().indexOf("ab");
            while (abIndex > -1){
                builder.replace(abIndex,abIndex+2,"");
                score+=x;
                abIndex = builder.toString().indexOf("ab");
            }
        }
        return score;
    }

}
