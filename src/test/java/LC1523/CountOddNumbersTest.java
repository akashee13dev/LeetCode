package LC1523;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountOddNumbersTest {

    CountOddNumbers obj = new CountOddNumbers();

    @Test
    @DisplayName("Test Case 1: Input : low = 3, high = 7")
    void example1(){
        Assertions.assertEquals(3, obj.countOdds(3, 7));  // Odd numbers: 3, 5, 7
    }

    @Test
    @DisplayName("Test Case 2: Input : low = 8, high = 10")
    void example2(){
        Assertions.assertEquals(1, obj.countOdds(8, 10));  // Odd number: 9
    }

    @Test
    @DisplayName("Test Case 3: Input : low = 1, high = 1")
    void example3(){
        Assertions.assertEquals(1, obj.countOdds(1, 1));  // Odd number: 1
    }

    @Test
    @DisplayName("Test Case 4: Input : low = 0, high = 0")
    void example4(){
        Assertions.assertEquals(0, obj.countOdds(0, 0));  // No odd numbers in range
    }

    @Test
    @DisplayName("Test Case 5: Input : low = 2, high = 10")
    void example5(){
        Assertions.assertEquals(4, obj.countOdds(2, 10));  // Odd numbers: 3, 5, 7, 9
    }

    @Test
    @DisplayName("Test Case 6: Input : low = 15, high = 20")
    void example6(){
        Assertions.assertEquals(3, obj.countOdds(15, 20));  // Odd numbers: 15, 17, 19
    }

    @Test
    @DisplayName("Test Case 7: Input : low = 1, high = 100")
    void example7(){
        Assertions.assertEquals(50, obj.countOdds(1, 100));  // Odd numbers from 1 to 100
    }

    @Test
    @DisplayName("Test Case 8: Input : low = 10, high = 15")
    void example8(){
        Assertions.assertEquals(3, obj.countOdds(10, 15));  // Odd numbers: 11, 13, 15
    }

    @Test
    @DisplayName("Test Case 9: Input : low = 100, high = 200")
    void example9(){
        Assertions.assertEquals(50, obj.countOdds(100, 200));  // Odd numbers from 100 to 200
    }

    @Test
    @DisplayName("Test Case 10: Input : low = 200, high = 200")
    void example10(){
        Assertions.assertEquals(0, obj.countOdds(200, 200));  // No odd numbers in range
    }

    @Test
    @DisplayName("Test Case 11: Input : low = 14, high = 17")
    void example11(){
        Assertions.assertEquals(2, obj.countOdds(14, 17));  // 15 , 17
    }


}
