package medium.LC207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

    CourseSchedule obj = new CourseSchedule();


    @Test
    @DisplayName("Test Case 1: Input: numCourses = 2, prerequisites = [[1,0]]")
    void example2(){
        Assertions.assertTrue(obj.canFinish(2,new int[][]{{1,0}}));
    }

    @Test
    @DisplayName("Test Case 2: numCourses = 2, prerequisites = [[1,0],[0,1]]")
    void example3(){
        Assertions.assertFalse(obj.canFinish(2,new int[][]{{1,0},{0,1}}));
    }


}
