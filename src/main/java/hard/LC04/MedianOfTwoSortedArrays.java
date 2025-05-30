package hard.LC04;

public class MedianOfTwoSortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int one = nums1.length;
        int two = nums2.length;
        boolean isTwo = (one+two) % 2 == 0;
        int result = isTwo ? (one+two+2) / 2 : (one+two+1) / 2  ;
        int[] arr = new int[result];
        int x = 0 , y = 0 ;
        for (int i = 0 ; i < result ; i++){
            if(one > x && two > y){
                if(nums1[x] < nums2[y]){
                    arr[i] = nums1[x];
                    x++;
                }
                else {
                    arr[i] = nums2[y];
                    y++;
                }
            }
            else if(x < one){
                arr[i] = nums1[x];
                x++;
            }
            else if(y < two){
                arr[i] = nums2[y];
                y++;
            }
        }
        return isTwo && result > 1 ? ((double) arr[result - 1] + arr[result - 2])/2  : arr[result-1];
    }

}
