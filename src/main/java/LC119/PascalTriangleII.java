package LC119;

import LC118.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {



       //return new PascalTriangle().generate(rowIndex+1).get(rowIndex);

        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        for (int i = 0 ; i<rowIndex+1 ; i++){
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
        return pascal.get(rowIndex);

    }


}
