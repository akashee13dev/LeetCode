package LC1779;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindNearestPointTest {

    FindNearestPoint obj = new FindNearestPoint();



    @Test
    @DisplayName("Example 3: Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]")
    void example3(){
        Assertions.assertEquals(2,obj.nearestValidPoint(
                3 , 4 , new int[][] { {1,2},{3,1},{2,4},{2,3},{4,4} }
        ));
    }

    @Test
    @DisplayName("Example 3: Input: x = 3, y = 4, points = [[3,4]]")
    void example1(){
        Assertions.assertEquals(0,obj.nearestValidPoint(
                3 , 4 , new int[][] { {3,4} }
        ));
    }

    @Test
    @DisplayName("Example 3: Input: x = 3, y = 4, points = [[2,3]]")
    void example2(){
        Assertions.assertEquals(-1,obj.nearestValidPoint(
                3 , 4 , new int[][] { {2,3} }
        ));
    }

    @Test
    @DisplayName("Example 4: Input: x = 3, y = 4, points = [[2,3]]")
    void example4(){
        Assertions.assertEquals(-1,obj.nearestValidPoint(
                8092 , 5187 , new int[][] { {5614,4261},{562,8701}}
        ));
    }

    @Test
    @DisplayName("Example 4: Input: x = 3, y = 4, points = [[2,3]]")
    void example5(){
        Assertions.assertEquals(0,obj.nearestValidPoint(
                1 , 1 , new int[][] { {1,1},{1,1}}
        ));
    }

    @Test
    @DisplayName("Example 6: Input: x = 2, y = 2, points =  [[5,4],[3,4],[1,3],[3,2],[1,7],[4,2]]")
    void example6(){
        Assertions.assertEquals(3,obj.nearestValidPoint(
                2 , 2 , new int[][] { {5,4},{3,4},{1,3},{3,2},{1,7},{4,2}}
        ));
    }

    @Test
    @DisplayName("Example 6: Input: x = 3, y = 4, points =    [[1,2],[3,1],[2,4],[2,3],[4,4]]")
    void example7(){
        Assertions.assertEquals(2,obj.nearestValidPoint(
                3 , 4 , new int[][] { {1,2},{3,1},{2,4},{2,3},{4,4}}
        ));
    }




}
