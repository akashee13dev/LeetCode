package LC28;

public class ImplementStr {

    public int strStr(String haystack, String needle) {

        if(!haystack.contains(needle)){
            return -1;
        }
        if (haystack.startsWith(needle)){
            return 0;
        }
        String[] remaining = haystack.split(needle);
        if(remaining.length == 0){
            return -1;
        }
        return remaining[0].length();
    }

}
