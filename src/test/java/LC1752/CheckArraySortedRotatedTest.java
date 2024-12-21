package LC1752;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckArraySortedRotatedTest {

    CheckArraySortedRotated obj = new CheckArraySortedRotated();


    @Test
    @DisplayName("Example 4: Input :  nums = [3,4,5,1,2]")
    void example4(){
        Assertions.assertTrue(obj.check(new int[]{3,4,5,1,2}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [2,1,3,4]")
    void example1(){
        Assertions.assertFalse(obj.check(new int[]{2,1,3,4}));
    }

    @Test
    @DisplayName("Example 2: Input :  nums = [1,2,3]")
    void example2(){
        Assertions.assertTrue(obj.check(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("Example 3: Input :  nums = [1,1,1]")
    void example3(){
        Assertions.assertTrue(obj.check(new int[]{1,1,1}));
    }

    @Test
    @DisplayName("Example 5: Input :  nums = [6,10,6]")
    void example5(){
        Assertions.assertTrue(obj.check(new int[]{6,10,6}));
    }

    @Test
    @DisplayName("Example 6: Input :  nums = [5,5,6,6,6,9,1,2]")
    void example6(){
        Assertions.assertTrue(obj.check(new int[]{5,5,6,6,6,9,1,2}));
    }





}
