package LC985;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumOfEvenNumbersTest {

    SumOfEvenNumbers obj = new SumOfEvenNumbers();

    @Test
    @DisplayName("Test Case 2: Input: nums = {1,2,3,4}, queries = {{1,0},{-3,1},{-4,0},{2,3}}")
    void example2(){
        Assertions.assertArrayEquals(new int[]{8,6,2,4}, obj.sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}}));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = {1}, queries = {{4,0}}")
    void example3(){
        Assertions.assertArrayEquals(new int[]{0}, obj.sumEvenAfterQueries(new int[]{1},new int[][]{{4,0}}));
    }

}
