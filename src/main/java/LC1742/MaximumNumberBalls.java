package LC1742;

public class MaximumNumberBalls {

    /**
     * @implNote  Need to complete after sometimes
     * @param lowLimit
     * @param highLimit
     * @return
     */

    public int countBalls(int lowLimit, int highLimit) {

        int[] box = new int[10];
        int maxBalls = 0;

        for (int ind = lowLimit ; ind <= highLimit ; ind++){
            int boxIndex = getBoxIndex(ind);
            box[boxIndex-1]++;
            maxBalls = Math.max(box[boxIndex-1],maxBalls);
        }
        return maxBalls;

    }

    private int getBoxIndex(int ind) {
        if(ind >= 0 && ind <= 9){
            return ind;
        }
        if(ind >= 10 && ind <= 99){
            String sum = ind+"";
            while (sum.length() != 1){
                sum = (Integer.parseInt(sum.charAt(0)+"") + Integer.parseInt(sum.charAt(1)+"")) + "";
            }
            return Integer.parseInt(sum);
        }
        if(ind >= 100 && ind <= 999){
            String sum = ind+"";
            while (sum.length() != 1){
                if(sum.length() > 2){
                    sum =(Integer.parseInt(sum.charAt(0)+"") + Integer.parseInt(sum.charAt(1)+"") + Integer.parseInt(sum.charAt(2)+""))+"" ;
                }
                else {
                    sum =(Integer.parseInt(sum.charAt(0)+"") + Integer.parseInt(sum.charAt(1)+""))+"";
                }
            }
            return Integer.parseInt(sum);
        }
        int sum = 0;
        String num = ind+"";
        int len = num.length();
        for (int i=0;i<len;i++){
            sum += Integer.parseInt(num.charAt(i)+"");
        }
        String finalSum = sum+"";
        while (finalSum.length() != 1){
            if(finalSum.length() > 2){
                finalSum =(Integer.parseInt(finalSum.charAt(0)+"") + Integer.parseInt(finalSum.charAt(1)+"") + Integer.parseInt(finalSum.charAt(2)+""))+"" ;
            }
            else {
                finalSum =(Integer.parseInt(finalSum.charAt(0)+"") + Integer.parseInt(finalSum.charAt(1)+""))+"";
            }
        }
        return Integer.parseInt(finalSum);
    }

}
