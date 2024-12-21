package LC1882;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProcessTasksUsingServersTest {

    ProcessTasksUsingServers tasks = new ProcessTasksUsingServers();

    @Test
    @DisplayName("Example 1: Input: servers = [3,3,2], tasks = [1,2,3,2,1,2]")
    void example1(){
        Assertions.assertEquals(Arrays.toString( new int[]{2,2,0,2,1,2}) , Arrays.toString(tasks.getAssignTasks(
                new int[]{3,3,2} , new int[]{1,2,3,2,1,2}
        )));
    }

    @Test
    @DisplayName("Example 2: Input: servers = [5,1,4,3,2], tasks = [2,1,2,4,5,2,1]")
    void example3(){
        Assertions.assertEquals(Arrays.toString( new int[]{1,4,1,4,1,3,2}) ,Arrays.toString(tasks.getAssignTasks(
                new int[]{5,1,4,3,2} , new int[]{2,1,2,4,5,2,1}
        )));
    }


}
