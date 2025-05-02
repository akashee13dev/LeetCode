package medium.LC05;

public class LongestPalindromicSubstring {

        public String longestPalindrome(String s) {
            int len = s.length();
            if (len == 0) return "";

            String longestPalindrome = "";
            for (int center = 0; center < len; center++) {

                String oddPalindrome = expandAroundCenter(s, center, center);
                if (oddPalindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = oddPalindrome;
                }

                String evenPalindrome = expandAroundCenter(s, center, center + 1);
                if (evenPalindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = evenPalindrome;
                }
            }

            return longestPalindrome;
        }

        private String expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }

}
