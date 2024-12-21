package LC1848;

public class MinimumDistanceToTheTargetElement {

    public int getMinDistance(int[] nums, int target, int start) {

        int minDistanct = 0;

        int len = nums.length;
        boolean isFirstTime = true;
        for (int ind = 0 ; ind < len ; ind++){
            if(target == nums[ind]){
                minDistanct = !isFirstTime ? Math.min(minDistanct , Math.abs(ind - start)) : Math.abs(ind - start);
                isFirstTime = false;
            }
        }
        return minDistanct;

    }

}
