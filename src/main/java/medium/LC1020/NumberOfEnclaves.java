package medium.LC1020;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {



    public int numEnclaves(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        //First
        // Row
        for (int pos = 0 ; pos < col ; pos++){
            if(!visited[0][pos]){
                cutOpenCels(0 , pos , visited , grid);
            }
        }
        //column
        for (int pos = 0 ; pos < row ; pos++){
            if(!visited[pos][0]){
                cutOpenCels(pos , 0 , visited , grid);
            }
        }

        //Last
        // Row
        int x = row-1;
        for (int pos = 0 ; pos < col ; pos++){
            if(!visited[x][pos]){
                cutOpenCels(x , pos , visited , grid);
            }
        }
        //column
        int y = col - 1;
        for (int pos = 0 ; pos < row ; pos++){
            if(!visited[pos][y]){
                cutOpenCels(pos , y , visited , grid);
            }
        }

        int count = 0;
        for (int i = 0  ; i < row ; i++){
            for (int j = 0  ; j < col ; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    private void cutOpenCels(int x, int y, boolean[][] visited, int[][] grid) {
        visited[x][y] = true;
        if(grid[x][y] == 1){
            Queue<int[]> queue = new LinkedList<>();
            int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
            queue.offer(new int[]{x,y});
            while (!queue.isEmpty()){
                int[] currentLand = queue.poll();
                for (int[] dir : directions){
                    int newX = dir[0] + currentLand[0];
                    int newY = dir[1]+ currentLand[1];
                    if(newX < grid.length && newY < grid[0].length && newX >= 0 && newY >=0 && grid[newX][newY] == 1 && !visited[newX][newY]){
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX,newY});
                    }
                }
            }
        }
    }

}
