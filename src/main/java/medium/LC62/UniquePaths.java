package medium.LC62;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] visited = new int[m][n];
        return getUniquePaths(0,0,m-1,n-1,visited);
    }


    private  int getUniquePaths(int x , int y , int m , int n,int[][] visited){
        if(x > m || y > n){
            return 0;
        }
        if(visited[x][y] != 0){
            return visited[x][y];
        }
        if(x == m && y == n){
            return 1;
        }

        return visited[x][y] = getUniquePaths(x+1 , y , m , n , visited) + getUniquePaths(x , y+1 , m , n , visited);
    }
}
