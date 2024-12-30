package easy.LC88;

import java.util.Arrays;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

//        if(m == 0){
//            System.arraycopy(nums2, 0, nums1, 0, n);
//        }
//        else if(n != 0){
//            int[] temp = new int[nums1.length];
//            temp = nums1;
//            int[] tempArray = Arrays.copyOf(nums1, nums1.length);
//            int len = nums1.length;
//            int xIndex = 0;
//            int yIndex = 0;
//            for (int i =0 ; i<len ; i++){
//                if(yIndex >= n){
//                    temp[i] = tempArray[xIndex];
//                    xIndex++;
//                }
//                else if(xIndex >= m){
//                    temp[i] = nums2[yIndex];
//                    yIndex++;
//                }
//                else{
//                    if(xIndex<=m && tempArray[xIndex] <= nums2[yIndex]){
//                        temp[i] = tempArray[xIndex];
//                        xIndex++;
//                    }
//                    else {
//                        temp[i] = nums2[yIndex];
//                        yIndex++;
//                    }
//                }
//            }
//        }



        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return nums2;
        }
        if(n == 0){
            return nums1;
        }
        int[] tempArray = Arrays.copyOf(nums1, nums1.length);
        int[] temp = new int[nums1.length];
        temp = nums1;
        int len = nums1.length;
        int xIndex = 0;
        int yIndex = 0;
        for (int i =0 ; i<len ; i++){
            if(yIndex >= n){
                temp[i] = tempArray[xIndex];
                xIndex++;
            }
            else if(xIndex >= m){
                temp[i] = nums2[yIndex];
                yIndex++;
            }
            else{
                if(xIndex<=m && tempArray[xIndex] <= nums2[yIndex]){
                    temp[i] = tempArray[xIndex];
                    xIndex++;
                }
                else {
                    temp[i] = nums2[yIndex];
                    yIndex++;
                }
            }
        }
        return temp;

    }

}
