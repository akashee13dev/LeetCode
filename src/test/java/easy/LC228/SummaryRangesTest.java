package easy.LC228;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SummaryRangesTest {

    SummaryRanges obj = new SummaryRanges();

    @Test
    @DisplayName("Example 3: Input : nums = [0,1,2,4,5,7]")
    void example3(){
        Assertions.assertEquals(Arrays.asList("0->2","4->5","7"), obj.summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    @Test
    @DisplayName("Example 5: Input : nums = [0,2,3,4,6,8,9]")
    void example5(){
        Assertions.assertEquals(Arrays.asList("0","2->4","6","8->9") , obj.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }



    @Test
    @DisplayName("Example 6: Input : nums = [-2147483648,-2147483647,2147483647]")
    void example6(){
        Assertions.assertEquals(Arrays.asList("-2147483648->-2147483647","2147483647") , obj.summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
    }


}
