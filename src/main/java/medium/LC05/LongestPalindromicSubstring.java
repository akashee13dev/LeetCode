package medium.LC05;

public class LongestPalindromicSubstring {


    /**
     * @implNote  Will do Later
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {


        return s;
//
//        if(s.isEmpty()){
//            return "";
//        }
//        if(s.length() == 1){
//            return s;
//        }
//
//        int len = s.length();
//        int maxInd = 0;
//        int minInd = len;
//        int palindromLen = 0;
//        for (int i = 0; i < len; i++){
//            String  temp = s.substring(i , len);
//            int tempLen  = temp.length();
//            for (int j = 0 ; j< tempLen/2; j++){
//                if(temp.charAt(j) == temp.charAt(tempLen-1-j)){
//                    if(palindromLen != (tempLen-1-j)-j){
//                        maxInd = Math.max(tempLen-1-j+i , maxInd);
//                        minInd = Math.min(j+i , minInd);
//                        palindromLen = (tempLen-1-j)-(j+i);
//                    }
//                }
//            }
//            //reverse
//            String  reverse = s.substring(0 , len - i);
//            if(temp.equals(reverse)){
//                continue;
//            }
//            int reverseLen = reverse.length();
//            for (int j = 0; j< reverseLen /2; j++){
//                if(reverse.charAt(j) == reverse.charAt(reverseLen -1-j)){
//                    if((reverseLen-1-j)-j != palindromLen){
//                        maxInd = Math.max(reverseLen-1-j+i , maxInd);
//                        minInd = Math.min(j+i , minInd);
//                        palindromLen = (reverseLen-1-j)-(j+i);
//                    }
//                }
//            }
//        }
//
//        if(maxInd == 0 && minInd == len){
//            return  s.charAt(0)+"";
//        }
//        else {
//            return s.length() - 1 == maxInd ? s.substring(minInd) : s.substring(minInd,maxInd + 1);
//        }

    }

}
