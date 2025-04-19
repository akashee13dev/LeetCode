package medium.LC39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        getCombinationSum(candidates,target,0 , new ArrayList<>());
        return combinations;
    }

    private void getCombinationSum(int[] candidates , int target , int index , List<Integer> currentCombination){
        if(index == candidates.length){
            if(target == 0){
                combinations.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        if(candidates[index] <= target){
            currentCombination.add(candidates[index]);
            int currentIndex = currentCombination.size();
            getCombinationSum(candidates,target-candidates[index], index , currentCombination);
            currentCombination.remove(currentIndex-1);
        }
        getCombinationSum(candidates,target, index+1 , currentCombination);
    }

}
