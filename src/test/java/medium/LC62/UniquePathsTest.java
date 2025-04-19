package medium.LC62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    UniquePaths obj = new UniquePaths();


    @Test
    @DisplayName("Test Case 1: Input: m = 3, n = 7")
    void example1(){
        Assertions.assertEquals( 28, obj.uniquePaths(3,7));
    }

    @Test
    @DisplayName("Test Case 2: Input: m = 3, n = 2")
    void example2(){
        Assertions.assertEquals( 3, obj.uniquePaths(3,2));
    }



}
