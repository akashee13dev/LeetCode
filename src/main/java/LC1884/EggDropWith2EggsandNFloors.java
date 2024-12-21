package LC1884;

public class EggDropWith2EggsandNFloors {


    public int getExitFloor(int eggCount) {

        int floor = 1;
        while (eggCount > 0 ){
            eggCount -= floor;
            if(eggCount > 0) {
                floor++;
            }
        }
        return floor;

    }
}
