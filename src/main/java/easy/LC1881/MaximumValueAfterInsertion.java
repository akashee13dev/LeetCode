package easy.LC1881;


import java.math.BigInteger;

public class MaximumValueAfterInsertion {


    public String getMaximumValue(String longIntString, int number) {
        BigInteger longInt = new BigInteger(longIntString);
        boolean isNegative = longInt.compareTo(new BigInteger("0")) < 0;
        longInt = isNegative ? longInt.abs() : longInt;
        BigInteger bigNumber = BigInteger.ZERO;
        int len = (longInt+"").length();
        for (int ind = 0 ; ind<=len ; ind++){
            StringBuilder builder = new StringBuilder(longInt+"");
            builder.insert(ind, number+"");
            String result = builder.toString();
            bigNumber = bigNumber.equals(BigInteger.ZERO)  ? new BigInteger(result) : isNegative ? bigNumber.min(new BigInteger(result)) : bigNumber.max(new BigInteger(result));
        }

        return isNegative ? "-"+bigNumber : bigNumber.toString();

    }
}
