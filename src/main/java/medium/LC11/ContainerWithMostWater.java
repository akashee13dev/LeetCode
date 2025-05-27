package medium.LC11;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

//        int len = height.length;
//        int maxArea = 0 ;
//
//        for (int i = 0 ; i<len-1 ; i++){
//            for (int j = i+1 ; j<len ; j++){
//               int area =  Math.min(height[i],height[j]) * Math.abs(i - j);
//               maxArea = Math.max(maxArea , area);
//            }
//        }
//
//        return maxArea;

        int len = height.length;
        if(len == 2){
            return height[0] * height[1];
        }
        int start = 0;
        int end = len-1;
        int max = 0;
        while(end > start){
            max = Math.max(max, (Math.min(height[start] , height[end]) * (end-start)));
            if(height[end] > height[start]){
                start++;
            }
            else {
                end--;
            }
        }
        return max;



//        int left = 0;
//        int right = height.length - 1;
//        int maxArea = 0;
//
//        while (left < right) {
//            int area = Math.min(height[left], height[right]) * (right - left);
//            maxArea = Math.max(maxArea, area);
//            if (height[left] < height[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        return maxArea;

    }

}
