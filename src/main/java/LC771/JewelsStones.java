package LC771;

public class JewelsStones {

    public int numJewelsInStones(String jewels, String stones) {

        int len = 0;

        int startingLen = stones.length();
        for (char c : jewels.toCharArray()){
            stones = stones.replaceAll(c+"","");
            int newLen = stones.length();
            len += startingLen - newLen;
            startingLen = newLen;
        }

        return len;

    }

}
