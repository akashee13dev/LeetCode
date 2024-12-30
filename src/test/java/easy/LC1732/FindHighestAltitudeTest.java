package easy.LC1732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindHighestAltitudeTest {

    FindHighestAltitude obj = new FindHighestAltitude();

    @Test
    @DisplayName("Example 2: Input : gain = [-5,1,5,0,-7]")
    void example2(){
        Assertions.assertEquals(1,obj.largestAltitude(new int[]{-5,1,5,0,-7}));
    }


    @Test
    @DisplayName("Example 2: Input : gain = [-4,-3,-2,-1,4,3,2]")
    void example3(){
        Assertions.assertEquals(0,obj.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

}
