package LC217;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    ContainsDuplicate obj = new ContainsDuplicate();


    @Test
    @DisplayName("Example 2: Input : nums = [1,2,3,1]")
    void example2(){
        Assertions.assertTrue( obj.containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    @DisplayName("Example 3: Input : nums = [1,2,3,4]")
    void example3(){
        Assertions.assertFalse( obj.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    @DisplayName("Example 5: Input : nums = [1,1,1,3,3,4,3,2,4,2]")
    void example5(){
        Assertions.assertTrue( obj.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}
