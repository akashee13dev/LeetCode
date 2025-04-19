package medium.LC200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    NumberofIslands obj = new NumberofIslands();

    @Test
    @DisplayName("Test Case 3: grid = [" +
            "                {'1','1','1','1','0'},\n" +
            "                {'1','1','0','1','0'},\n" +
            "                {'1','1','0','0','0'},\n" +
            "                {'0','0','0','0','0'}" +
            "] ")
    void example3(){
        Assertions.assertEquals(1, obj.numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }));
    }

    @Test
    @DisplayName("Test Case 1: grid = [" +
            "                {'1','1','0','0','0'},\n" +
            "                {'1','1','0','0','0'},\n" +
            "                {'0','0','1','0','0'},\n" +
            "                {'0','0','0','1','1'}]")
    void example(){
        Assertions.assertEquals(3, obj.numIslands(new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        }));
    }

    @Test
    @DisplayName("Test Case Sample")
    void testOneIsland() {
        Assertions.assertEquals(1, obj.numIslands(new char[][]{
                {'1', '1', '0'},
                {'1', '0', '0'},
                {'0', '0', '0'}
        }));
    }


}
