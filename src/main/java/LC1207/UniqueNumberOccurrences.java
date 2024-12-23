package LC1207;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class UniqueNumberOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer , Integer> unique = new HashMap<>();
        int len = arr.length;

        for (int i = 0 ; i<len ; i++){
            int currentEle = arr[i];
            long count = Arrays.stream(arr).filter(num -> num == currentEle).count();
            unique.put(currentEle,Integer.parseInt(count+""));
        }

        for (Integer value : unique.values()) {
            long count = unique.values().stream().filter(num -> num.equals(value)).count();
            if(count >= 2){
                return false;
            }
        }
        return true;

    }

}
