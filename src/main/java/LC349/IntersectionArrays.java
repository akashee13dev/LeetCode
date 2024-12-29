package LC349;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> added = new ArrayList<>();

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
                    if(!added.contains(minArr[i])){
                        added.add(minArr[i]);
                    }
                    break;
                }
            }
        }

        int[] result = new int[added.size()];
        int ind = 0;
        for (int i : added){
            result[ind] = i;
            ind++;
        }

        return result;
    }

}
