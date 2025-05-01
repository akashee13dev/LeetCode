package easy.LC643;

public class MaximumAverageSubarrayOne {

    public double findMaxAverage(int[] nums, int k) {

        //Brute Force

//        int len = nums.length;
//        long max = Integer.MIN_VALUE;
//        for (int i = 0 ; i < len ; i++){
//            int limit = i + k ;
//            if(limit > len){
//                break;
//            }
//            int temp = 0;
//            for (int j = i ; j < limit ; j++ ){
//                temp += nums[j];
//            }
//            max = Math.max(max,temp);
//        }
//        return (double) max /k;

        //Sliding Window
            //First take the limit values basic calculations
            //Then Slide from the limit to length
            //Add that (k) and remove (i-k) from that window

        int len = nums.length;
        long max = 0;
        for (int i=0; i<k ; i++){
            max += nums[i];
        }

        long temp = max;
        for (int i=k ; i<len ; i++){
            temp -= nums[i-k];
            temp += nums[i];
            max = Math.max(temp,max);
        }
        return (double) max /k;
    }

}
