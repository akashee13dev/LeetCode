package easy.LC1812;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DetermineColorOfAChessboardSquareTest {


    DetermineColorOfAChessboardSquare obj = new DetermineColorOfAChessboardSquare();

    @Test
    @DisplayName("Example 1: Input: coordinates = \"a1\"")
    void example1(){
        Assertions.assertFalse(obj.squareIsWhite("a1"));
    }

    @Test
    @DisplayName("Example 2: Input: coordinates = \"h3\"")
    void example2(){
        Assertions.assertTrue(obj.squareIsWhite("h3"));
    }

    @Test
    @DisplayName("Example 2: Input: coordinates = \"c7\"")
    void example3(){
        Assertions.assertFalse(obj.squareIsWhite("c7"));
    }
}
