package easy.LC1523;

public class CountOddNumbers {

    public int countOdds(int low, int high) {
        if(low >= 0 && high >= 0){
            int diff = high - low;
            int oddCount = low%2 != 0 ? 1 : 0;
            oddCount = oddCount == 0 ?  oddCount +  (diff+1)/2 :  oddCount +  diff/2 ;
            return oddCount;
        }
        return 0;
    }

}
