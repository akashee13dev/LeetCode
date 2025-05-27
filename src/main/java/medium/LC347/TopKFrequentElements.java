package medium.LC347;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        HashMap<Integer , Integer> freqMap = new HashMap();
        for(int num : nums){
            if(freqMap.containsKey(num)){
                freqMap.put(num , freqMap.get(num) + 1 );
            }
            else{
                freqMap.put(num , 1);
            }
//freqMap.put(num , freqMap.getOrDefault(num + 1 , 1));
        }

        Queue<Integer> pq = new PriorityQueue<>(
                (a,b) -> freqMap.get(a) - freqMap.get(b)
        );

        for(int element : freqMap.keySet()){
            pq.add(element);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[pq.size()];
        for(int i = 0 ; i<k ; i++){
            result [i]  = pq.poll();
        }
        return result ;

    }

}
