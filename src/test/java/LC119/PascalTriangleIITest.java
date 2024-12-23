package LC119;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PascalTriangleIITest {

    PascalTriangleII obj = new PascalTriangleII();

    @Test
    @DisplayName("Test Case 1: Input: rowIndex = 3")
    void example2(){
        Assertions.assertEquals(Arrays.asList(1,3,3,1), obj.getRow(3));
    }

    @Test
    @DisplayName("Test Case 2: Input: rowIndex = 0")
    void example3(){
        Assertions.assertEquals(Arrays.asList(1), obj.getRow(0));
    }


    @Test
    @DisplayName("Test Case 4: Input: rowIndex = 1")
    void example4(){
        Assertions.assertEquals(Arrays.asList(1,1), obj.getRow(1));
    }

}
