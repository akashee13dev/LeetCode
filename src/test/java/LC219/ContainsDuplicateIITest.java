package LC219;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateIITest {

    ContainsDuplicateII obj = new ContainsDuplicateII();


    @Test
    @DisplayName("Example 2: Input : nums = [1,2,3,1], k = 3")
    void example2(){
        Assertions.assertTrue( obj.containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }

    @Test
    @DisplayName("Example 3: Input : nums = [1,0,1,1], k = 1")
    void example3(){
        Assertions.assertTrue( obj.containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }

    @Test
    @DisplayName("Example 5: Input : nums = [1,2,3,1,2,3], k = 2")
    void example5(){
        Assertions.assertFalse( obj.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }


}
