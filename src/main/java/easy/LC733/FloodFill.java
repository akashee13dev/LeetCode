package easy.LC733;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int row = image.length;
        int col = image[0].length;
        boolean[][] visited = new boolean[row][col];
        changePixel(sr , sc , image , color , image[sr][sc] , visited);
        return image;

    }

    private void changePixel(int sr, int sc, int[][] image, int color, int currentColor, boolean[][] visited) {

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length){
            return;
        }
        if(image[sr][sc] == currentColor && !visited[sr][sc]){
            visited[sr][sc] = true;
            image[sr][sc] = color;
            if(sr > 0 ){
                changePixel(sr -1 , sc , image , color , currentColor, visited);
            }
            if(sc < image[0].length ){
                changePixel(sr , sc + 1 , image , color , currentColor, visited);
            }
            if(sr < image.length ){
                changePixel(sr +1 , sc , image , color , currentColor, visited);
            }
            if(sc > 0 ){
                changePixel(sr , sc - 1 , image , color , currentColor, visited);
            }
        }
    }

}
