package medium.LC417;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> waterFlowPlaces = new ArrayList<>();

        int height = heights[0].length;
        int width = heights.length;
        boolean[][] visited = new boolean[width][height];
        boolean[][] canReachBoth = new boolean[width][height];
        for (int i=0 ; i<width ;i++){
            for (int j=0 ; j<height ; j++){
                List<Boolean> isOceanReached = process(i , j , heights , visited , canReachBoth);
                if (isOceanReached.get(0) && isOceanReached.get(1)) {
                    waterFlowPlaces.add(new ArrayList<>(List.of(i , j)));
                }
            }
        }
        return waterFlowPlaces;
    }

    private List<Boolean> process(int x , int y , int[][] heights , boolean[][] visited , boolean[][] canReachBoth){

        List<Boolean> pacificVsAtlantic = new ArrayList<>();
        System.out.println("x is "+x+" y is "+y);
        if (x < 0 || y < 0 || x >= heights.length || y >= heights[0].length){
            return pacificVsAtlantic;
        }
        if(visited[x][y]){
            return canReachBoth[x][y] ? List.of(true, true) : pacificVsAtlantic;
        }
        visited[x][y] = true;
        int count = 0;
        if(x == 0  || y == 0){
            count++;
            pacificVsAtlantic.add(0,true);
        }
        if(x == heights.length -1 || y == heights[0].length - 1){
            count++;
            pacificVsAtlantic.add(1,true);
        }
        if(count == 2){
            canReachBoth[x][y] = true;
            return pacificVsAtlantic;
        }

        List<Boolean> top =     x != 0 && heights[x][y] >= heights[x - 1][y] ?  process(x - 1, y, heights,visited , canReachBoth) : pacificVsAtlantic;
        if(top.get(0) && top.get(1)){
            canReachBoth[x][y] = true;
            return List.of(true,true);
        }

        List<Boolean> bottom =  x != heights.length - 1 && heights[x][y] >= heights[x + 1][y] ? process(x+1, y, heights,visited , canReachBoth) : pacificVsAtlantic;
        if(bottom.get(0) && bottom.get(1)){
            canReachBoth[x][y] = true;
            return List.of(true,true);
        }

        List<Boolean> left =    y != 0 && heights[x][y] >= heights[x][y-1]                    ? process(x , y-1, heights,visited , canReachBoth) : pacificVsAtlantic;
        if(left.get(0) && left.get(1)){
            canReachBoth[x][y] = true;
            return List.of(true,true);
        }

        List<Boolean> right =   y != heights[0].length - 1  && heights[x][y] >= heights[x][y+1] ? process(x , y+1, heights,visited , canReachBoth) : pacificVsAtlantic;
        if(right.get(0) && right.get(1)){
            canReachBoth[x][y] = true;
            return List.of(true,true);
        }

        canReachBoth[x][y] = pacificVsAtlantic.get(0) && pacificVsAtlantic.get(1);
        return pacificVsAtlantic;

    }

}
