package easy.LC1556;

public class ThousandSeparator {

    public String thousandSeparator(int n) {
        if(n > 999){

            String numberStr = n+"";
            String finalString = numberStr;
            StringBuilder builder = new StringBuilder(finalString);
            int loopLen = numberStr.length() / 3 ;
            for (int i=0 ; i<loopLen ; i++){
                int index = numberStr.length() -  ((i+1) *3);
                if(index > 0){
                    builder.insert(index,".");
                }
            }
            return builder.toString();
        }
        return n+"";
    }

}
