package easy.LC1946;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestNumberAfterMutatingSubstringTest {


    LargestNumberAfterMutatingSubstring mutatingSubstring = new LargestNumberAfterMutatingSubstring();

    @Test
    @DisplayName("Example 1: Input: num = \"132\", change = [9,8,5,0,3,6,4,2,6,8]\nOutput: \"832\"")
    void example1(){
        String maximumNumber = mutatingSubstring.maximumNumber("132", new int[]{9, 8, 5, 0, 3, 6, 4, 2, 6, 8});
        Assertions.assertEquals("833",maximumNumber);
    }

    @Test
    @DisplayName("Example 2: Input: num = \"021\", change = [9,4,3,5,7,2,1,9,0,6]\n" + "Output: \"934\"")
    void example2(){
        String maximumNumber = mutatingSubstring.maximumNumber("021", new int[]{9, 4, 3, 5, 7, 2, 1, 9, 0, 6});
        Assertions.assertEquals("934",maximumNumber);
    }

    @Test
    @DisplayName("Example 3: Input: num = \"5\", change = [1,4,7,5,3,2,5,6,9,4]\nOutput: \"5\"")
    void example3(){
        String maximumNumber = mutatingSubstring.maximumNumber("5", new int[]{1, 4, 7, 5, 3, 2, 5, 6, 9, 4});
        Assertions.assertEquals("5",maximumNumber);
    }
}
