package easy.LC1732;

public class FindHighestAltitude {

    public int largestAltitude(int[] gain) {

        int len = gain.length;
        int currentAltitude = 0;
        int[] altitudes = new int[len+1];
        int maxAltitude = 0;
        altitudes[0] = 0;
        for (int i=0;i<len;i++){
            currentAltitude = gain[i] + currentAltitude;
            altitudes[i+1] = currentAltitude;
            maxAltitude = Math.max(currentAltitude , maxAltitude);
        }
        return maxAltitude;
    }

}
