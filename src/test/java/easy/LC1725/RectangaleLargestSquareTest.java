package easy.LC1725;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangaleLargestSquareTest {

    RectangaleLargestSquare obj = new RectangaleLargestSquare();


    @Test
    @DisplayName("Example 2: Input : rectangles = {{5,8},{3,9},{5,12},{16,5}}")
    void example2(){
        Assertions.assertEquals(3,obj.countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}}));
    }


    @Test
    @DisplayName("Example 2: Input : rectangles = {{2,3},{3,7},{4,3},{3,7}}")
    void example3(){
        Assertions.assertEquals(3,obj.countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}}));
    }

}
