package medium.LC179;

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {


        //Learned custom sorting from CharGPT .. taken 1 hour so checked with ChatGPT
        String[] numStr = new String[nums.length];
        int index = 0;
        int count = 0 ;
        for (int i : nums){
            numStr[index] = i+"";
            if(count <= 0){
                count = count + i ;
            }
            index++;
        }
        if (count == 0){
            return "0";
        }

        Arrays.sort(numStr , (prefix , suffix ) -> (suffix + prefix).compareTo(prefix + suffix));

        StringBuilder output = new StringBuilder();
        for (String i : numStr) {
            output.append(i);
        }
        return output.toString();

//        String sum = "";
//        int left = 0 ;
//        int right = nums.length-1;
//
//        while (right > left) {
//            String leftSum = "";
//            String rightSum = "";
//
//            String prefix = leftSum + nums[left];
//            String suffix = +nums[left] + leftSum;
//            leftSum = new BigInteger(prefix).compareTo(new BigInteger(suffix)) > 0 ? prefix : suffix;
//
//
//            prefix = rightSum + nums[right];
//            suffix = +nums[right] + rightSum;
//            rightSum = new BigInteger(prefix).compareTo(new BigInteger(suffix)) > 0 ? prefix : suffix;
//
//            String sumPrefix = leftSum + rightSum;
//            String sumSuffix = rightSum + leftSum;
//            int isLeftBig = new BigInteger(sumPrefix).compareTo(new BigInteger(sumSuffix));
//            String maxSum = isLeftBig > 0 ? sumPrefix : sumSuffix;
//
//            if (sum.isEmpty()) {
//                sum = maxSum;
//            } else {
//                String newSumPrefix = sum + maxSum;
//                String newSumSuffix = maxSum + sum;
//                sum = new BigInteger(newSumPrefix).compareTo(new BigInteger(newSumSuffix)) > 0 ? newSumPrefix : newSumSuffix;
//            }
//
//            left++;
//            right--;
//
//        }
//        for (int num : nums){
//            if(sum.isEmpty()){
//                sum = num+"";
//            }
//            else {
//                String prefix = sum+""+num;
//                String suffix = num+""+sum;
//                sum = new BigInteger(prefix).compareTo(new BigInteger(suffix)) == 1 ? prefix : suffix;
//            }
//        }

        //return sum;
    }

}
