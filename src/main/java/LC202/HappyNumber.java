package LC202;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public boolean isHappy(int n) {

        if(n == 1){
            return true;
        }
        List<Integer> results = new ArrayList<>();
        String num = n+"";
        int total = 0;
        while (total != 1){
            for (char c : num.toCharArray()){
                total = total + (Integer.parseInt(c+"") * Integer.parseInt(c+""));
            }
            if(results.contains(total)){
                return false;
            }
            if(total == 1){
                return true;
            }
            results.add(total);
            num = total+"";
            total = 0;
        }
        return true;
    }

}
