package LC844;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {


        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();

        for (char c : s.toCharArray()){
            if(c == '#'){
                if(!sBuilder.toString().isEmpty()){
                    sBuilder.deleteCharAt(sBuilder.toString().length()-1);
                }
            }
            else {
                sBuilder.append(c);
            }
        }
        for (char c : t.toCharArray()){
            if(c == '#'){
                if(!tBuilder.toString().isEmpty()){
                    tBuilder.deleteCharAt(tBuilder.toString().length()-1);
                }
            }
            else {
                tBuilder.append(c);
            }
        }
        return sBuilder.toString().contentEquals(tBuilder);



    }

}
