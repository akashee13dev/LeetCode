package medium.LC853;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarFleetTest {

    CarFleet obj = new CarFleet();

    @Test
    @DisplayName("Test Case 1: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]")
    void example1() {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        Assertions.assertEquals(3, obj.carFleet(target, position, speed));
    }

    @Test
    @DisplayName("Test Case 2: target = 10, position = [3], speed = [3]")
    void example2() {
        int target = 10;
        int[] position = {3};
        int[] speed = {3};
        Assertions.assertEquals(1, obj.carFleet(target, position, speed));
    }

    @Test
    @DisplayName("Test Case 3: target = 100, position = [0,2,4], speed = [4,2,1]")
    void example3() {
        int target = 100;
        int[] position = {0, 2, 4};
        int[] speed = {4, 2, 1};
        Assertions.assertEquals(1, obj.carFleet(target, position, speed));
    }

}
