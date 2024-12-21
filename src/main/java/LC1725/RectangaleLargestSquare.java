package LC1725;

public class RectangaleLargestSquare {

    public int countGoodRectangles(int[][] rectangles) {

        int len = rectangles.length;
        int [] lengths = new int[len];
        int maxLength = 0;
        int maxLengthCount = 0;

        for (int i=0;i<len;i++){
            int currentLen = Math.min(rectangles[i][0],rectangles[i][1]);
            lengths[i] = currentLen;
            if(maxLength >= currentLen){
                maxLengthCount = maxLength == currentLen ? maxLengthCount + 1 : maxLengthCount;
            }
            else {
                maxLength = currentLen;
                maxLengthCount = 1 ;
            }
        }

        return maxLengthCount;

    }

}
