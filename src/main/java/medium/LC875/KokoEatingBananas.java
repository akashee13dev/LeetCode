package medium.LC875;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        //We have to calculate what is the time taking for each 0 to Max pile
        int left = 1;
        int right = 1;
        for (int pile : piles){
            right = Math.max(right , pile);
        }

        while (left < right) {
            int middle = left + (right - left)/2;
            int hourForCurrentPosition = 0;
            for (int pile : piles){
                hourForCurrentPosition += (int) Math.ceil((double) pile/middle);
            }
            if(hourForCurrentPosition <= h){ // Can Complete
                right = middle; // We have to move right to check much high , since current hour is valid , Still koko liked to spend more time by eating slowly
            }
            else {
                left = middle+1; //Since current time is high we have to move left to right side
            }
            //piles = [3,6,7,11], h = 8
            //At max in single time    : [ 1, 2 , 3,  4 , 5 , 6 , 7 , 8 , 9 , 10]
            //Total Time taken for that: [27, 15, 10, 8 , 8 , 6 , 5 , 5 , 5 , 5 ]
            // Here Total Time is keep decreasing ,
                //Use Left right based on the first array , check the result using 2nd array
            // So If hour is can completed we need to move right index towards left to find more better result
            // If Hour is high to decrease that we need to move left index towards middle to find result

        }
        return left;
    }

}
