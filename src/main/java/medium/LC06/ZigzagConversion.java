package medium.LC06;

import java.util.Objects;

public class ZigzagConversion {

    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }
        int strLen = s.length();
        int processLen = 0;

        int cycleLength = 2 * numRows - 2;
        int fullCycles = strLen / cycleLength;
        int remainingChars = strLen % cycleLength;
        int totalColumns = fullCycles * (numRows - 1);
        if (remainingChars > 0) {
            totalColumns++;
        }
        if (remainingChars > numRows - 1) {
            totalColumns = totalColumns+(remainingChars-numRows);
        }
        int colLen = totalColumns;
        String [][] arr = new String[numRows][colLen];

        int xInd = 0;
        int yInd = 0;
        boolean isDown = true;
        while (processLen < strLen){
            arr[xInd][yInd] = s.charAt(processLen)+"";
            processLen++;

            if(xInd == 0){
                isDown = true;
            }
            else if (xInd == numRows-1){
                isDown = false;
            }

            if(isDown){
                xInd++;
            }
            else {
                xInd--;
                yInd++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String[] str : arr){
            for (String st : str){
                if(Objects.nonNull(st)){
                    builder.append(st);
                }
            }
        }
        return builder.toString();

    }

}
