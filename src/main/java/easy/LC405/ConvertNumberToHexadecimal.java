package easy.LC405;


public class ConvertNumberToHexadecimal {

    public String toHex(int num) {

        if(num < 0){
           return hexForNegative(num);
        }
        if(num <= 15){
            return num < 10 ? num+"" : num == 10 ? "a" : num == 11 ? "b" : num == 12 ? "c" : num == 13 ? "d" : num == 14 ? "e"  : "f";
        }

        String hex = "";
        while (num != 0){
            int reminder = num%16 ;
            if(reminder >= 10){
                hex = hex.concat(reminder == 10 ? "a" : reminder == 11 ? "b" : reminder == 12 ? "c" : reminder == 13 ? "d" : reminder == 14 ? "e"  : "f");
            }
            else {
                hex = hex.concat(reminder+"");
            }
            num = num/16;
        }
        return reverseString(hex);
    }

    /**
     * @implNote Dont know how to convert for negative number so used built in functions sorry Akashee..
     * @param num
     * @return
     */
    private String hexForNegative(int num) {

        return Integer.toHexString(num);

    }

    public String  reverseString(String  s) {
        int len = s.length();
        String result = "";
        for (int i = len-1 ; i>=0 ; i--){
            result = result.concat(s.charAt(i)+"");
        }
        return result;
    }

}
