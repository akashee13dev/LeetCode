package medium.LC31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

    int inputLen = 0;
    int outPutIndex = 0;
    int totalLen = 0;
    int[] actualInput;

    public List<Integer> nextPermutation(int[] nums) {
        List<Integer> result = null;
        actualInput = nums.clone();
        //sorting
        Arrays.sort(nums);
        inputLen = nums.length;
        totalLen = getFactorial(inputLen);
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> singlePerm = new ArrayList<>();
        boolean[] indexArray = new boolean[inputLen];
        calculatePermutation(nums , permutations , singlePerm , indexArray);
        result = permutations.get(outPutIndex);
        int[] newArray = permutations.get(outPutIndex).stream().mapToInt(Integer::intValue).toArray();
        System.arraycopy(newArray , 0 , nums , 0 , inputLen);
        return result;
    }

    private int getFactorial(int n){
        while (n>1){
            return n + getFactorial(n-1);
        }
        return 1;
    }

    private void calculatePermutation(int[] input , List<List<Integer>> permutations , List<Integer> singlePerm , boolean[] indexArray){

        if(input.length == singlePerm.size()){
            permutations.add(new ArrayList<>(singlePerm));
            if(outPutIndex == 0){
                boolean isSameInput = isInputPermutation(singlePerm , actualInput);
                if(isSameInput){
                    if(permutations.size() == totalLen){
                        outPutIndex = 0;
                    }
                    else {
                        outPutIndex = permutations.size();
                    }
                }
            }
            return;
        }
        else {
            for (int ind = 0 ; ind < input.length ; ind++){
                if(!indexArray[ind]){
                    indexArray[ind] = true;
                    singlePerm.add(input[ind]);
                    calculatePermutation(input , permutations , singlePerm , indexArray);
                    singlePerm.remove(singlePerm.size() - 1);
                    indexArray[ind] = false;
                }
            }
        }
    }

    private boolean isInputPermutation(List<Integer> singlePerm, int[] input) {
        boolean isSameArray = true;
        for (int ind = 0 ; ind < inputLen-1 ; ind++){
            if(input[ind] != singlePerm.get(ind)){
                isSameArray = false;
                break;
            }
        }
        return isSameArray;
    }


}
