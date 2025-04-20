package medium.LC881;

import java.util.Arrays;

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {


            Arrays.sort(people);
            int i = 0, j = people.length - 1;
            int boatCount = 0;

            while (i <= j) {
                if (people[i] + people[j] <= limit) {
                    i++; // Pair the lightest person with the heaviest
                }
                j--; // Always move the heavier person
                boatCount++;
            }

            return boatCount;


//        while (i <= j){
//            int weight = people[i] + people[j];
//            if(weight == currentBoatCapasity){
//                boatCount++;
//                currentBoatCapasity = limit;
//                i++;
//                j--;
//            }
//            else if (weight > currentBoatCapasity){
//                boatCount++;
//                currentBoatCapasity = limit;
//                if(people[i] > people[j]){
//                    i++;
//                }
//                else {
//                    j--;
//                }
//            }
//            else {
//                currentBoatCapasity = currentBoatCapasity - weight;
//                if(currentBoatCapasity <= 0){
//                    if(currentBoatCapasity == 0){
//                        boatCount++;
//                        currentBoatCapasity = limit;
//                    }
//                    i++;
//                    j--;
//                }
//                else{
//                    if(people[i] > people[j]){
//                        j--;
//                    }
//                    else {
//                        i++;
//                    }
//                }
//            }
//        }
//        return currentBoatCapasity != limit ? boatCount + 1 : boatCount;

    }

}
