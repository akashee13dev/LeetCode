package easy.LC1742;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumNumberBallsTest {

    MaximumNumberBalls obj = new MaximumNumberBalls();


    @Test
    @DisplayName("Example 3: Input :  lowLimit = 1, highLimit = 10")
    void example(){
        Assertions.assertEquals(2,obj.countBalls(1,10));
    }

    @Test
    @DisplayName("Example 1: Input :  lowLimit = 5, highLimit = 15")
    void example1(){
        Assertions.assertEquals(2,obj.countBalls(5,15));
    }

    @Test
    @DisplayName("Example 2: Input : lowLimit = 19, highLimit = 28")
    void example2(){
        Assertions.assertEquals(2,obj.countBalls(19,28));
    }


    @Test
    @DisplayName("Example 2: Input : lowLimit = 11, highLimit = 104")
    void example3(){
        Assertions.assertEquals(9,obj.countBalls(11,104));
    }
}
