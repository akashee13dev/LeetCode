package LC1758;

public class MinimumChangesToMakeAlternatingBinaryString {

    public int minOperations(String s) {
        int n = s.length();
        int countPattern1 = 0;
        int countPattern2 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && s.charAt(i) != '0') {
                countPattern1++;
            } else if (i % 2 != 0 && s.charAt(i) != '1') {
                countPattern1++;
            }

            if (i % 2 == 0 && s.charAt(i) != '1') {
                countPattern2++;
            } else if (i % 2 != 0 && s.charAt(i) != '0') {
                countPattern2++;
            }
        }
        return Math.min(countPattern1, countPattern2);
    }

}
