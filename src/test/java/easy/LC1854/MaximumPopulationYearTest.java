package easy.LC1854;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumPopulationYearTest {


    MaximumPopulationYear obj = new MaximumPopulationYear();


    @Test
    @DisplayName("Example 1: Input:  logs = [[1993,1999],[2000,2010]]")
    void example1(){
        Assertions.assertEquals(
                1993 ,obj.maximumPopulation(new int[][]{{1993,1999},{2000,2010}})
        );
    }

    @Test
    @DisplayName("Example 2: Input: logs = [[1950,1961],[1960,1971],[1970,1981]]")
    void example2(){
        Assertions.assertEquals(
                1960  ,obj.maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}})
        );
    }

    @Test
    @DisplayName("Example 2: Input: logs = [ [1982,1998],[2013,2042],[2010,2035],[2022,2050],[2047,2048]]")
    void example3(){
        Assertions.assertEquals(
                2022  ,obj.maximumPopulation(new int[][]{
                        {1982,1998}, {2013,2042}, {2010,2035}, {2022,2050}, {2047,2048}
                })
        );
    }


}
