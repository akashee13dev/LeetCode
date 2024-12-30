package easy.LC278;

import java.math.BigInteger;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        BigInteger min = BigInteger.ONE ;
        BigInteger max = new BigInteger(n+"") ;

        while (min.compareTo(max) == -1) {
            BigInteger mid = min.add(max.subtract(min).divide(BigInteger.TWO));
            System.out.println("Min & Max "+min.intValueExact() + " ------- " + max.intValueExact());
            if (isBadVersion(mid.intValueExact())) {
                System.out.println("Bad version "+mid.intValueExact());
                max = mid;
            } else {
                System.out.println("Good version "+mid.intValueExact());
                min = mid.add(BigInteger.ONE);
            }
        }
        return min.intValueExact();
    }
}