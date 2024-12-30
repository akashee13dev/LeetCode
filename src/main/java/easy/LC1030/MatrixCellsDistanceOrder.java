package easy.LC1030;

public class MatrixCellsDistanceOrder {

    /**
     * @implNote  QUestion not understood
     * @param rows
     * @param cols
     * @param rCenter
     * @param cCenter
     * @return
     */
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        int[][] matrix = new int[rows][cols];
        for (int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                matrix[i][j] = Math.abs(i-rCenter) + Math.abs(j-cCenter);
            }
        }

        int loopLen = matrix.length;
        int[][] finalArray = new int[rows*cols][cols];
        int index = 0;
        for (int i=0;i<loopLen; i++){
            int[] array = matrix[i];
            finalArray[index] = new int[]{rCenter,array[0]};
            finalArray[index+1] = new int[]{cCenter,array[1]};
            index+=2;
        }
        return finalArray;
    }

}
