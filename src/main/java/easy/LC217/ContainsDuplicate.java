package easy.LC217;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.containsKey(i)){
                return true;
            }
            else {
                map.put(i , 1);
            }
        }
        return false;
    }

}