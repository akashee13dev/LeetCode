package LC989;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AddArrayFormIntegerTest {

    AddArrayFormInteger obj = new AddArrayFormInteger();


    @Test
    @DisplayName("Test Case 2: Input: num = [1,2,0,0], k = 34")
    void example2(){
        Assertions.assertEquals(Arrays.asList(1,2,3,4), obj.addToArrayForm(new int[]{1,2,0,0}, 34));
    }

    @Test
    @DisplayName("Test Case 3: Input: num = [2,7,4], k = 181")
    void example3(){
        Assertions.assertEquals(Arrays.asList(4,5,5), obj.addToArrayForm(new int[]{2,7,4}, 181));
    }

    @Test
    @DisplayName("Test Case 3: Inpur : num = [2,1,5], k = 806")
    void example4(){
        Assertions.assertEquals(Arrays.asList(1,0,2,1), obj.addToArrayForm(new int[]{2,1,5}, 806));
    }

}
