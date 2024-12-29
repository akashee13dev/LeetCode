package LC941;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {

    ValidMountainArray obj = new ValidMountainArray();


    @Test
    @DisplayName("Example 3: Input : arr = [2,1]")
    void example3(){
        Assertions.assertFalse(  obj.validMountainArray(new int[]{2,1}));
    }

    @Test
    @DisplayName("Example 4: Input : arr = [3,5,5]")
    void example4(){
        Assertions.assertFalse(obj.validMountainArray(new int[]{3,5,5}));
    }
    @Test
    @DisplayName("Example 1: Input : arr = [0,3,2,1]")
    void example1(){
        Assertions.assertTrue( obj.validMountainArray(new int[]{0,3,2,1}));
    }


    @Test
    @DisplayName("Example 5: Input : arr = [0,3,2,1]")
    void example5(){
        Assertions.assertTrue( obj.validMountainArray(new int[]{0,3,2,1}));
    }

    @Test
    @DisplayName("Example 7: Input : arr =[14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3]")
    void example7(){
        Assertions.assertFalse( obj.validMountainArray(new int[]{14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3}));
    }


}
