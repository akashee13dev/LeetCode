package easy.LC414;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        for (int num : nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        return list.size() >= 3 ? list.get(list.size()-3) : list.get(list.size()-1);


//        List<Integer> list = new ArrayList<>();
//        int max = 0;
//        for (int num : nums){
//            max = Math.max(max , num);
//            if(!list.contains(num)){
//                list.add(num);
//            }
//        }
//        return list.size() >= 3 ? list.get(2) : max;

    }


}

