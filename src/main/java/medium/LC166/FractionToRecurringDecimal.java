package medium.LC166;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

    public String fractionToDecimal(int numerator, int denominator) {
//        BigDecimal resultInNum = new BigDecimal(numerator).divide(new BigDecimal(denominator), new MathContext(20));
//        String resultStr = resultInNum.toPlainString();
//        while (true){
//            if(resultStr.endsWith("0")){
//                resultStr = resultStr.substring(0,resultStr.length()-1);
//            }
//            else {
//                break;
//            }
//        }
//        if(resultStr.endsWith(".")){
//            return resultStr.replace(".","");
//        }
//
//        String numeric = resultStr.split("\\.")[0];
//        String decimal = resultStr.split("\\.")[1];
//        decimal = removeCommon(decimal);
//        return numeric+"."+decimal;
        if(numerator == 0){
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            builder.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        //numeric
        long numeric = num/den;
        builder.append(numeric);

        //reminder
        long remind = num%den;
        if(remind == 0){
            return builder.toString();
        }
        builder.append(".");
        Map<Long , Integer> reminderVsIndex = new HashMap<>();
        while (remind != 0){
            if(reminderVsIndex.containsKey(remind)){
                int index = reminderVsIndex.get(remind);
                builder.insert(index,"(");
                builder.append(")");
                return builder.toString();
            }
            reminderVsIndex.put(remind,builder.length());
            remind = remind * 10;
            builder.append(remind / den);
            remind = remind%den;
        }
        return builder.toString();

    }
//
//    private String removeCommon(String decimal) {
//
//        int len = decimal.length();
//        if(len <= 3){
//            return decimal;
//        }
//        for (int i = 0 ; i < len ; i++){
//            String subStr = decimal.substring(0 , i+1);
//            String temp = decimal;
//            if(temp.replaceAll(subStr,"").isEmpty()){
//                return "("+subStr+")";
//            }
//        }
//        return decimal;
//
//    }

}
