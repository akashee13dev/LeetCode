package easy.LC623;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @implNote  Laterr....
 */
public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {

        int len = nums.length ;
        int max = 1;
        Set<Integer> set = new TreeSet<>();
        for (int num : nums){
            if(len <= 3){
                max *= num;
            }
            else {
                set.add(num);
            }
        }
        if(len <= 3){
            return max;
        }
        else {
            List<Integer> list = new ArrayList<>(set);
            list = list.subList(len - 3 , len);
            for (int num : list){
                max *= num;
            }
        }
        return max;
    }

}
