package LC350;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArraysTwo {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> addedIndex = new ArrayList<>();
        List<Integer> takenIndex = new ArrayList<>();

        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int miniLen = num1Len;
        int maxLen = num2Len;
        int[] minArr = nums1;
        int[] maxArr = nums2;

        if(num1Len > num2Len){
            miniLen = num2Len;
            maxLen = num1Len;
            minArr = nums2;
            maxArr = nums1;
        }

        for (int i = 0 ; i<miniLen ; i++){
            for (int j = 0 ; j<maxLen ; j++){
                if(minArr[i] == maxArr[j]){
                    if( !addedIndex.contains(i) && !takenIndex.contains(j)){
                        addedIndex.add(i);
                        takenIndex.add(j);
                        break;
                    }
                }
            }
        }

        int[] result = new int[addedIndex.size()];
        int ind = 0;
        for (int i : addedIndex){
            result[ind] = minArr[i];
            ind++;
        }

        return result;
    }

}
