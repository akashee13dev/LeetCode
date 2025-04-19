package easy.LC1431;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KidsWithTheGreatestNumberOfCandiesTest {

    KidsWithTheGreatestNumberOfCandies obj = new KidsWithTheGreatestNumberOfCandies();


    @Test
    @DisplayName("Test Case 1: Input : candies = [2,3,5,1,3], extraCandies = 3")
    void example1(){
        Assertions.assertEquals(Arrays.asList(true,true,true,false,true) ,obj.kidsWithCandies(new int[]{2,3,5,1,3},3));  // Expected output: true
    }

    @Test
    @DisplayName("Test Case 2: Input : candies = [4,2,1,1,2], extraCandies = 1")
    void example2(){
        Assertions.assertEquals(Arrays.asList(true,false,false,false,false) , obj.kidsWithCandies(new int[]{4,2,1,1,2},1));  // Expected output: false
    }

    @Test
    @DisplayName("Test Case 3: Input : candies = [12,1,12], extraCandies = 10")
    void example3(){
        Assertions.assertEquals(Arrays.asList(true,false,true) ,obj.kidsWithCandies(new int[]{12,1,12},10));  // Expected output: true
    }


}
