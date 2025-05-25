package medium.LC547;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

    NumberOfProvinces obj = new NumberOfProvinces();

    @Test
    public void testProvinces() {
        // Test case 1:
        int[][] isConnected1 = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 1, 1}
        };
        // Expected output is 2 provinces: {City 0, City 1} and {City 2, City 3}
        Assertions.assertEquals(2, obj.findCircleNum(isConnected1));

        // Test case 2 (from your example):
        int[][] isConnected2 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        // Expected output is 2 provinces
        Assertions.assertEquals(2, obj.findCircleNum(isConnected2));

        // Test case 3 (from your example):
        int[][] isConnected3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        // Expected output is 3 provinces
        Assertions.assertEquals(3, obj.findCircleNum(isConnected3));
    }


}
