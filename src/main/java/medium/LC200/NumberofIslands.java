package medium.LC200;

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
                    findIsland(i , j , grid);
                }
            }
        }
        return islandCount;

    }

    private void findIsland(int x, int y, char[][] grid) {


            if (x < 0 || x >= breath || y < 0 || y >= depth || grid[x][y] != '1') {
                return;
            }

            grid[x][y] = '5';

            if(x != 0 ){
                findIsland(x - 1, y, grid);//Top
            }
            if(x < breath - 1){
                findIsland(x + 1, y, grid);//Bottom
            }
            if(y != 0){
                findIsland(x, y - 1, grid);//Left
            }
            if(y < depth - 1){
                findIsland(x, y + 1, grid);//Right
            }

    }

}
