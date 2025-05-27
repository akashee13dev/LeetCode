package hard.LC42;

public class TrappingRainWater {

    public int trap(int[] height) {

        int len = height.length;
        int left = 0;
        int right = len-1;

        int rain = 0;
        int leftMax = 0;
        int rightMax = 0;

        while(right > left){
            if(height[left] < height[right]){
                if(leftMax <= height[left]){
                    leftMax =  height[left];
                }
                else {
                    rain += leftMax - height[left];
                }
                left++;
            }
            else {
                if(rightMax <= height[right]){
                    rightMax =  height[right];
                }
                else {
                    rain += rightMax - height[right];
                }
                right--;

            }
        }
        return rain;


    }

}
