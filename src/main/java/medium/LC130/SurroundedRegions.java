package medium.LC130;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

    public void solve(char[][] board) {

        int row = board.length;
        int col = board[0].length;

        boolean[][] visited = new boolean[row][col];

        //First
        // Row
        for (int pos = 0 ; pos < col ; pos++){
            if(!visited[0][pos]){
                captureRegions(0 , pos , visited , board);
            }
        }
        //column
        for (int pos = 0 ; pos < row ; pos++){
            if(!visited[pos][0]){
                captureRegions(pos , 0 , visited , board);
            }
        }

        //Last
        // Row
       int x = row-1;
        for (int pos = 0 ; pos < col ; pos++){
            if(!visited[x][pos]){
                captureRegions(x , pos , visited , board);
            }
        }
        //column
        int y = col - 1;
        for (int pos = 0 ; pos < row ; pos++){
            if(!visited[pos][y]){
                captureRegions(pos , y , visited , board);
            }
        }

        for (int i = 0  ; i < row ; i++){
            for (int j = 0  ; j < col ; j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void captureRegions(int x, int y, boolean[][] visited, char[][] board) {
        visited[x][y] = true;
        if(board[x][y] == 'O'){
            Queue<int[]> queue = new LinkedList<>();
            int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
            queue.offer(new int[]{x,y});
            while (!queue.isEmpty()){
                int[] currentLand = queue.poll();
                for (int[] dir : directions){
                    int newX = dir[0] + currentLand[0];
                    int newY = dir[1]+ currentLand[1];
                    if(newX < board.length && newY < board[0].length && newX >= 0 && newY >=0 && board[newX][newY] == 'O' && !visited[newX][newY]){
                        visited[newX][newY] = true;
                        queue.offer(new int[]{newX,newY});
                    }
                }
            }
        }
    }


}
