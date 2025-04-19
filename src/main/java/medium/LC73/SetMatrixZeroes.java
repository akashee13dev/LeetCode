package medium.LC73;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {

    public int[][] setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dummy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);

        List<Integer> processedRows = new ArrayList<>();
        List<Integer> processedCols = new ArrayList<>();

        int row = 0;
        for (int[] matrixRow : dummy){
            int col = 0;
            for (int matrixCol : matrixRow){

                if(matrixCol == 0){

                    if(!processedRows.contains(row)){
                        //left
                        int currentColPosition = col;
                        while (currentColPosition >= 0){
                            matrix[row][currentColPosition] = 0;
                            currentColPosition--;
                        }

                        //right
                        currentColPosition = col;
                        while (currentColPosition < cols){
                            matrix[row][currentColPosition] = 0;
                            currentColPosition++;
                        }
                        processedRows.add(row);
                    }
                    if(!processedCols.contains(col)){

                        //up
                        int currentRowPosition = row;
                        while (currentRowPosition >= 0){
                            matrix[currentRowPosition][col] = 0;
                            currentRowPosition--;
                        }

                        //down
                        currentRowPosition = row;
                        while (currentRowPosition < rows){
                            matrix[currentRowPosition][col] = 0;
                            currentRowPosition++;
                        }
                        processedCols.add(col);
                    }
                }

                col++;
            }
            row++;
        }

        return matrix;
    }


}
