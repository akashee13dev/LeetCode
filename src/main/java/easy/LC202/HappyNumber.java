package easy.LC202;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        List<Integer> results = new ArrayList<>();
        while (n != 1){
            int temp = 0;
            while (n > 0){
                temp = temp + (n%10 * n%10);
                n = n/10;
            }
            if(temp == 1){
                return true;
            }
            if(results.contains(temp)){
                return false;
            }
            results.add(temp);
            n = temp;
        }
        return true;




//        if(n == 1){
//            return true;
//        }
//        List<Integer> results = new ArrayList<>();
//        String num = n+"";
//        int total = 0;
//        while (total != 1){
//            for (char c : num.toCharArray()){
//                total = total + (Integer.parseInt(c+"") * Integer.parseInt(c+""));
//            }
//            if(results.contains(total)){
//                return false;
//            }
//            if(total == 1){
//                return true;
//            }
//            results.add(total);
//            num = total+"";
//            total = 0;
//        }
//        return true;
    }

}
