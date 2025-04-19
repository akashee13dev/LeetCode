package medium.LC1771;

import java.util.HashSet;

/**
 * @Facing Timeout exception for 64th Case of 72 , long array
 */
public class CountGoodMeals {

    public int countPairs(int[] deliciousness) {

        int output = 0;
        int index = deliciousness.length;
        HashSet<Integer> power = new HashSet<>();
        for (int i = 0; i < 32; i++) {
            power.add(1 << i);
        }
        for (int i=0 ; i < index-1 ; i++){
            for (int j=i+1 ; j<index ; j++){
                if(power.contains( deliciousness[i] + deliciousness[j])){
                    output++;
                }
            }
        }
        return output;
    }

//    private boolean isSquerRoot(int num) {
//        return num > 0 && (num & (num - 1)) == 0;
//    }

}
