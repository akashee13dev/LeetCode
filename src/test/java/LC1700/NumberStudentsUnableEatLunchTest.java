package LC1700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberStudentsUnableEatLunchTest {


    NumberStudentsUnableEatLunch obj = new NumberStudentsUnableEatLunch();

    @Test
    @DisplayName("Example 1: Input : students = [1,1,0,0], sandwiches = [0,1,0,1]")
    void example1(){
        Assertions.assertEquals(0,obj.countStudents(new int[]{1,1,0,0} , new int[]{0,1,0,1}));
    }

    @Test
    @DisplayName("Example 2: Input : students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]")
    void example2(){
        Assertions.assertEquals(3,obj.countStudents(new int[]{1,1,1,0,0,1} , new int[]{1,0,0,0,1,1}));
    }


}
