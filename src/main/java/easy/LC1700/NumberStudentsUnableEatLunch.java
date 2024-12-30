package easy.LC1700;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStudentsUnableEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {

        List<Integer> queue = Arrays.stream(students).boxed().collect(Collectors.toList());
        List<Integer> food = Arrays.stream(sandwiches).boxed().collect(Collectors.toList());

        boolean isFoodAvailable = true;

        int leftCount = 0;
        int loopCount = 0;

        while (isFoodAvailable){
            if(queue.isEmpty() || food.isEmpty() || loopCount == students.length || Collections.disjoint(queue, food)){
                isFoodAvailable  = false;
            }
            else {
                if(queue.get(0).equals(food.get(0))){
                    queue.remove(0);
                    food.remove(0);
                    leftCount++;
                    loopCount = 0;
                }
                else {
                    int currentStudent = queue.get(0);
                    queue = queue.subList(1,queue.size());
                    queue.add(currentStudent);
                    loopCount++;
                }
            }
        }
        return students.length - leftCount;

//        int oneCountQueue = 0;
//        int zeroCountQueue = 0;
//        int oneCountFood = 0;
//        int zeroCountFood = 0;
//        for (int i=0;i<len;i++){
//            if(queue[i] == 0){
//                zeroCountQueue++;
//            }
//            else {
//                oneCountQueue++;
//            }
//
//            if(food[i] == 0){
//                zeroCountFood++;
//            }
//            else {
//                oneCountFood++;
//            }
//        }
//
//        if(oneCountQueue == oneCountFood && zeroCountQueue == zeroCountFood){
//            return 0;
//        }
//        if(oneCountQueue == oneCountFood){
//            return Math.abs(zeroCountFood-zeroCountQueue);
//        }
//        if(zeroCountQueue == zeroCountFood){
//            return Math.abs(oneCountQueue-oneCountFood);
//        }
//
//        return Math.abs(zeroCountFood-zeroCountQueue) + Math.abs(oneCountQueue-oneCountFood);

    }


}
