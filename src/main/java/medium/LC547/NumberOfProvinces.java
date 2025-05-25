package medium.LC547;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {

        int totalCity = isConnected.length;
        boolean[] visitedCity = new boolean[totalCity];
        int count = 0;
        for (int i = 0 ; i < totalCity ; i++){
            if(!visitedCity[i]){
                dfs(i , visitedCity  , isConnected );
                count++;
            }
        }
        return count;
    }

    private void dfs(int currentCity, boolean[] visitedCity, int[][] isConnected) {
        visitedCity[currentCity] = true;
        for (int j = 0 ; j < isConnected.length ; j++){
            if(isConnected[currentCity][j] == 1 && !visitedCity[j] ){
                dfs(j , visitedCity , isConnected);
            }
        }
    }

}
