package medium.LC200;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {

    int breath = 0;
    int depth = 0;

    public int numIslands(char[][] grid) {


        breath = grid.length;
        depth = grid[0].length;

        int islandCount = 0;
        for (int i = 0 ; i<breath ; i++){
            for (int j = 0 ; j<depth ; j++){
                char place = grid[i][j];
                if(place != '5' && place != '0'){
                    islandCount++;
                    findIslandDfs(i , j , grid);
                    //findIslandBfs(i , j , grid);
                }
            }
        }
        return islandCount;

    }

    private void findIslandBfs(int i, int j, char[][] grid) {
        grid[i][j] = '5';
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        queue.offer(new int[]{i,j});
        while (!queue.isEmpty()){
            int[] currentLand = queue.poll();
            for (int[] dir : directions){
                int newX = dir[0] + currentLand[0];
                int newY = dir[1]+ currentLand[1];
                if(newX < breath && newY < depth && newX >= 0 && newY >=0 && grid[newX][newY] == '1'){
                    grid[newX][newY] = '5';
                    queue.offer(new int[]{newX,newY});
                }
            }
        }
    }

    private void findIslandDfs(int x, int y, char[][] grid) {


            if (x < 0 || x >= breath || y < 0 || y >= depth || grid[x][y] != '1') {
                return;
            }

            grid[x][y] = '5';

            if(x != 0 ){
                findIslandDfs(x - 1, y, grid);//Top
            }
            if(x < breath - 1){
                findIslandDfs(x + 1, y, grid);//Bottom
            }
            if(y != 0){
                findIslandDfs(x, y - 1, grid);//Left
            }
            if(y < depth - 1){
                findIslandDfs(x, y + 1, grid);//Right
            }

    }

}
