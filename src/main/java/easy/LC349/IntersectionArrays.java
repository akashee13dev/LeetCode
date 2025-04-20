package easy.LC349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        //Brute Force
//        List<Integer> added = new ArrayList<>();
//
//        int num1Len = nums1.length;
//        int num2Len = nums2.length;
//        int miniLen = num1Len;
//        int maxLen = num2Len;
//        int[] minArr = nums1;
//        int[] maxArr = nums2;
//
//        if(num1Len > num2Len){
//            miniLen = num2Len;
//            maxLen = num1Len;
//            minArr = nums2;
//            maxArr = nums1;
//        }
//
//        for (int i = 0 ; i<miniLen ; i++){
//            for (int j = 0 ; j<maxLen ; j++){
//                if(minArr[i] == maxArr[j]){
//                    if(!added.contains(minArr[i])){
//                        added.add(minArr[i]);
//                    }
//                    break;
//                }
//            }
//        }
//
//        int[] result = new int[added.size()];
//        int ind = 0;
//        for (int i : added){
//            result[ind] = i;
//            ind++;
//        }
//
//        return result;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int lenOne = nums1.length -1;
        int lenTwo = nums2.length - 1;

        int i=0;
        int j=0;
        List<Integer> inter = new ArrayList<>();

        while (i <= lenOne && j<=lenTwo){
            if(nums1[i] == nums2[j]){
                if(!inter.contains(nums1[i])){
                    inter.add(nums1[i]);
                }
                j++;
                i++;
                while(i<lenOne && nums1[i] == nums1[i-1]){
                    i++;
                }
                while(j<lenTwo && nums2[j] == nums2[j-1]){
                    j++;
                }
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        int size = inter.size();
        int[] result = new int[size];
        for (int ind = 0; ind <size; ind++){
            result[ind] = inter.get(ind);
        }
        return result;
    }

}
