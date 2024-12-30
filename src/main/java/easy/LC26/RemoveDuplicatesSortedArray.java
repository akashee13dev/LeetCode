package easy.LC26;


import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {

        int[] temp = nums;
        int index = 0;
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums){
            if(!sortedSet.contains(num)){
                sortedSet.add(num);
                temp[index] = num;
                index++;
            }
        }
        nums = temp;
        return sortedSet.size();
    }

}
