package LC1528;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

            char[] finalLetter = new char[s.length()];
            int loopLen = s.length() ;
            for (int i=0 ; i<loopLen ; i++){
                finalLetter[indices[i]] = s.charAt(i);
            }
            return new String(finalLetter);

    }

}
