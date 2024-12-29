package LC859;

public class BuddyStrings {

    /**
     * @implNote  Failing for long input , need to optimize
     * @param s
     * @param goal
     * @return
     */
    public boolean buddyStrings(String s, String goal) {

        int len = s.length();

        if(len == 1 && s.equals(goal)){
            return false;
        }
        if(s.equals(goal)){
            if(s.length() >= 26){
                return true;
            }
        }

        for(int i = 0 ; i < len -1 ; i++){
            StringBuilder builder = new StringBuilder(s);
            for (int j = i+1 ; j < len ; j++){
                builder.replace(i ,i+1, s.charAt(j)+"");
                builder.replace(j , j+1 , s.charAt(i)+"");
                if(builder.toString().equals(goal)){
                    return true;
                }
                else {
                    builder = new StringBuilder(s);
                }
            }
        }
        return false;

    }

}
