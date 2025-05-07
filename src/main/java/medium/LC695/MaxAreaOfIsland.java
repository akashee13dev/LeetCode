package medium.LC695;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        int max = 0 ;
        for (int i = 0 ; i < row; i++){
            for (int j = 0 ; j < col ; j++){
                if(!visited[i][j]){
                    int area = checkArea(i , j , visited , grid , 0);
                    max = Math.max(area,max);
                }
            }
        }

        return max;

    }

    private int checkArea(int i, int j, boolean[][] visited, int[][] grid, int currentArea) {
        if (i < 0 || i >= grid.length  || j < 0 ||  j >= grid[0].length) {
            return currentArea;
        }
        if(grid[i][j] == 1 && !visited[i][j]){
            visited[i][j] = true;
            int area = currentArea + 1 ;
            if(i != 0 ){
                area = checkArea(i - 1, j, visited , grid , area);//Top
            }
            if(i < grid.length - 1){
                area = checkArea(i + 1, j , visited , grid , area);//Bottom
            }
            if(j != 0){
                area = checkArea(i, j - 1,visited , grid , area);//Left
            }
            if(j < grid[0].length - 1){
                area = checkArea(i, j + 1,visited , grid , area);//Right
            }
            return area;
        }
        return currentArea;
    }

}
