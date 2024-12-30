package easy.LC07;

public class ReverseInteger {

    public int reverse(int x) {

        if(x >= -9 && x <= 9){
            return x;
        }
        boolean isNegative = x < 0 ;
        x = Math.abs(x);
        String xStr = x+"";
        StringBuilder builder = new StringBuilder();
        for (char ch : xStr.toCharArray()){
            builder.insert(0,ch);
        }
        if(isNegative){
            builder.insert(0,"-");
        }
        try {
            return Integer.parseInt(builder.toString());
        }
        catch (Exception e){
            return 0;
        }
    }

}
