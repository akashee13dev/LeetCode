package LC389;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {

//        int ind = 0;
//        for (char c : s.toCharArray()){
//            if(c != t.charAt(ind)){
//                return t.charAt(ind);
//            }
//            ind++;
//        }
//        return t.charAt(ind);

        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c - 'a'] < 0) {
                return c;
            }
        }
        return t.charAt(0);

//        int len = t.length();
//        for (int i=0;i<len ; i++){
//            String temp = i==0 ? t.substring(i+1) : i == len-1 ? t.substring(0,len-1) : t.substring(0,i).concat(t.substring(i+1,len));
//            if(temp.equals(s)){
//                return t.charAt(i);
//            }
//        }
//        return t.charAt(0);

    }

}
