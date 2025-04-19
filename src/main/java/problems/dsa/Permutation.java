package problems.dsa;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    private int[] input = null;

    private Permutation(int[] array){
        this.input = array;
    }

    public Permutation getInstance(int[] n){
        return new Permutation(n);
    }

    public List<List<Integer>> getPermutations(){
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> singlePerm = new ArrayList<>();
        boolean[] indexArray = new boolean[input.length];
        calculatePermutation(input , permutations , singlePerm , indexArray);
        printPermutation(permutations);
        return permutations;
    }

    public static void main(String[] args) {
        int[] input = {2,3,1};
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> singlePerm = new ArrayList<>();
        boolean[] indexArray = new boolean[input.length];
        calculatePermutation(input , permutations , singlePerm , indexArray);
        printPermutation(permutations);
    }



    private static void calculatePermutation(int[] input , List<List<Integer>> permutations , List<Integer> singlePerm , boolean[] indexArray){

        if(input.length == singlePerm.size()){
            permutations.add(new ArrayList<>(singlePerm));
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

    private static void printPermutation(List<List<Integer>> permutations){
        for (List<Integer> permutation : permutations){
            for (Integer num : permutation){
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }


}
