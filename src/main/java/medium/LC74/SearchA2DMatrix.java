package medium.LC74;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;

        int start = 0 ;
        int end = (row * cols) - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            int middleValue = matrix[middle/cols][middle%cols];
            if(middleValue == target){
                return true;
            }
            else if (middleValue > target){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }

        }
        return false;
    }

}
