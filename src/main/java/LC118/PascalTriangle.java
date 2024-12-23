package LC118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        for (int i = 0 ; i<numRows ; i++){
            ArrayList<Integer> currentList = new ArrayList<>();
            for (int j = 0 ; j<=i ; j++){
                if(j == 0 ||  j == i){
                    currentList.add(1);
                }
                else{
                    currentList.add(previous.get(j-1)+previous.get(j));
                }
            }
            pascal.add(currentList);
            previous = currentList;
        }
        return pascal;

    }

}
