package easy.LC263;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber {

    /**
     * Need to find factor like for 8 - (2 * 2 * 2 ),( 2 * 4 ) not divided by 2 , 4 ..
     * @param n
     * @return
     */
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }
        for (int factor : new int[]{2, 3, 5}) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

}
