package easy.LC1128;

import java.util.HashMap;

public class NumberOfEquivalentDominoPairs {

    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        //Brute Force
//        int len = dominoes.length;
//        for (int i = 0 ; i<len-1 ; i++){
//            for (int j=i+1 ; j < len ; j++){
//                int[] dominoeI = dominoes[i];
//                int[] dominoeJ = dominoes[j];
//                if(
//                        (dominoeI[0] == dominoeJ[0] && dominoeI[1] == dominoeJ[1]) ||
//                         (dominoeI[0] == dominoeJ[1] && dominoeI[1] == dominoeJ[0])
//                ){
//                    count++;
//                }
//            }
//        }

        //Simple o(n) solution

        HashMap<String  , Integer> minMaxPair = new HashMap<>();
        for (int[] dom : dominoes){
            int min = Math.min(dom[0],dom[1]);
            int max = Math.max(dom[0],dom[1]);
            String minMaxStr = min+" , "+max;
            count += minMaxPair.getOrDefault(minMaxStr, 0);
            minMaxPair.put(minMaxStr ,minMaxPair.getOrDefault(minMaxStr, 0)+1);
        }

        return count;
    }

}
