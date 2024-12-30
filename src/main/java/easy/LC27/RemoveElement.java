package easy.LC27;

import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int[] temp = nums;
        int index = 0;
        for (int num : nums){
            if(val != num){
                temp[index] = num;
                index++;
            }
        }
        nums = temp;
        return index;

    }

}
