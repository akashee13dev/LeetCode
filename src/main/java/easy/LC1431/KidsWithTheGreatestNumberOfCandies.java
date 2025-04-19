package easy.LC1431;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMaxCandies(candies);
        List<Boolean> kidsWithTheGreatestNumberOfCandies = new ArrayList<>();
        int len = candies.length;

        if(extraCandies == 0){
            for (int i = 0 ; i<len ; i++){
                kidsWithTheGreatestNumberOfCandies.add(false);
            }
        }
        else {
            for (int i = 0 ; i<len ; i++){
                kidsWithTheGreatestNumberOfCandies.add(candies[i]+extraCandies >= max);
            }
        }
        return kidsWithTheGreatestNumberOfCandies;
    }

    private int getMaxCandies(int[] candies) {
        int max = candies[0];
        int len = candies.length;
        for (int i = 1 ; i<len ; i++){
            max = Math.max(max , candies[i]);
        }
        return max;
    }

}
