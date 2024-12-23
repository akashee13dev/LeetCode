package LC1550;

public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        if(len < 3){
            return false;
        }

        int oddSequence = 0;
        for (int n : arr){
            if (n%2 != 0){
                oddSequence++;
                if(oddSequence == 3){
                    return true;
                }
            }
            else {
                oddSequence = 0;
            }
        }
        return oddSequence == 3;
    }

}
