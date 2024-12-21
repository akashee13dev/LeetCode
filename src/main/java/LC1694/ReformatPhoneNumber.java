package LC1694;

public class ReformatPhoneNumber {

    public String reformatNumber(String number) {

        String phone = number.replaceAll(" ","").replaceAll("-","");
        int len = phone.length();
        if(len <= 4){
            if(len <= 3){
                return phone;
            }
            if(len == 4){
                StringBuilder sb = new StringBuilder(phone);
                sb.insert(2, "-");
                return sb.toString();
            }
        }

        int remaining = len%3;
        int loopLen =  remaining == 1 ? (len / 3) - 1 :  len / 3 ;
        remaining = remaining == 1 ? remaining + 3 : remaining;

        String finalPhone = "";
        int currentIndex = 0;
        for (int i = 0 ; i<loopLen && currentIndex < len - 1  ; i++){
            finalPhone = finalPhone.concat(phone.substring(currentIndex , currentIndex+3));
            currentIndex+=3;
            finalPhone = finalPhone.concat("-");
        }
        if(remaining <= 4){
            if(remaining == 2){
                finalPhone = finalPhone.concat(phone.substring(len-2 , len));
            }
            if(remaining == 3){
                finalPhone = finalPhone.concat(phone.substring(len-3 , len));
            }
            if(remaining == 4){
                finalPhone = finalPhone.concat(phone.substring(len-4 , len-2));
                finalPhone = finalPhone.concat("-");
                finalPhone = finalPhone.concat(phone.substring(len-2 , len));
            }
        }
        finalPhone = finalPhone.endsWith("-") ? finalPhone.substring(0, finalPhone.length()-1) : finalPhone;
        return finalPhone;
    }

}
