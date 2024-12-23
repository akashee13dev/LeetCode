package LC118;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PascalTriangleTest {

    PascalTriangle obj = new PascalTriangle();


    @Test
    @DisplayName("Test Case 1: Input: numRows = 5")
    void example2(){
        Assertions.assertEquals(Arrays.asList(
                Arrays.asList(1), Arrays.asList(1,1), Arrays.asList(1,2,1), Arrays.asList(1,3,3,1), Arrays.asList(1,4,6,4,1)
        ), obj.generate(5));
    }

    @Test
    @DisplayName("Test Case 2: Input: numRows = 1")
    void example3(){
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1)), obj.generate(1));
    }

}
