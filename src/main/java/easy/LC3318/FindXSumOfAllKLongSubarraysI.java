package easy.LC3318;

import java.util.*;

public class FindXSumOfAllKLongSubarraysI {

    public int[] findXSum(int[] nums, int k, int x) {
        int len = nums.length;
        List<Integer> resultList = new ArrayList<>();
        for (int i=0; i< len-k+1  ; i++){
            int[] window = Arrays.copyOfRange(nums , i ,k + i);
            Map<Integer,Integer> freqMap = new HashMap<>();
            for (int windowEle : window){
                freqMap.put(windowEle , freqMap.getOrDefault(windowEle , 0) + 1);
            }
            resultList.add(getTopXSumUsingPQ(freqMap , x));
//            freqMap = sortMap(freqMap);
//            List<int[]> freqList = new ArrayList<>();
//            for (int key : freqMap.keySet()){
//                freqList.add(new int[]{key,freqMap.get(key)});
//            }
//            int sum = 0;
//            for (int j = 0; j<Math.min(x,freqList.size()); j++){
//                sum += freqList.get(j)[0] * freqList.get(j)[1];
//            }
 //           resultList.add(sum);
        }
        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private Map<Integer, Integer> sortMap(Map<Integer, Integer> freqMap) {
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
         sortedEntries.sort((ele1 , ele2) -> {
            return ele1.getValue().equals(ele2.getValue()) ? ele2.getKey() - ele1.getKey() : ele2.getValue() - ele1.getValue();
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }


    private int getTopXSumUsingPQ(Map<Integer, Integer> freqMap , int x){
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((ele1 , ele2) -> {
            return ele1[1] != ele2[1] ? ele2[1] - ele1[1] : ele2[0] - ele1[0];
        });

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            priorityQueue.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        List<int[]> freqList = new ArrayList<>();
        for (int key : freqMap.keySet()){
            freqList.add(new int[]{key,freqMap.get(key)});
        }

        int sum = 0;
        for (int j = 0; j<x && !priorityQueue.isEmpty(); j++){
            int[] subFreqArr = priorityQueue.poll();
            sum += subFreqArr[0] * subFreqArr[1];
        }
        return sum;
    }

}
