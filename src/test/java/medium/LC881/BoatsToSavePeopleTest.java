package medium.LC881;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {

    BoatsToSavePeople obj = new BoatsToSavePeople();

    @Test
    @DisplayName("Test Case 2: Input: people = [1,2], limit = 3")
    void example1(){
        Assertions.assertEquals(1, obj.numRescueBoats(new int[]{1,2},3));
    }

    @Test
    @DisplayName("Test Case 3:  people = [3,2,2,1], limit = 3")
    void example2(){
        Assertions.assertEquals(3, obj.numRescueBoats(new int[]{3,2,2,1},3));
    }

    @Test
    @DisplayName("Test Case 4:  people = [3,5,3,4], limit = 5")
    void example3(){
        Assertions.assertEquals(4, obj.numRescueBoats(new int[]{3,5,3,4},5));
    }


    @Test
    @DisplayName("Test Case 4:  people = [7,3,2], limit = 8")
    void example4(){
        Assertions.assertEquals(2, obj.numRescueBoats(new int[]{7,3,2},8));
    }


    @Test
    @DisplayName("Test Case 4:  people = [2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10], limit = 50")
    void example5(){
        Assertions.assertEquals(11, obj.numRescueBoats(new int[]{2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10},50));
    }

}
