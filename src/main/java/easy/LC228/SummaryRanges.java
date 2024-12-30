package easy.LC228;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        int len = nums.length;
        List<String> ranges = new ArrayList<>();
        if(len == 0){
            return ranges;
        }
        String range = nums[0]+"";
        for (int i = 0 ; i< len ; i++){
            if(i == len -1){
                if(range.endsWith("->")){
                    range = range.concat(nums[i]+"");
                }
                else {
                    range = nums[i]+"";
                }
            }
            else {
                if(nums[i] + 1 != nums[i+1] ){
                    if(range.endsWith("->")){
                        range = range.concat(nums[i]+"");
                    }
                    ranges.add(range);
                    range = nums[i+1]+"";
                }
                else {
                    if(!range.endsWith("->")){
                        range = range.concat("->");
                    }
                }
            }
        }
        ranges.add(range);
        return ranges;
    }

}
