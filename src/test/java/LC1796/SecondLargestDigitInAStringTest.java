package LC1796;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SecondLargestDigitInAStringTest {

    SecondLargestDigitInAString obj = new SecondLargestDigitInAString();


    @Test
    @DisplayName("Example 2: Input: s = \"dfa12321afd\"")
    void example2(){
        Assertions.assertEquals(2,obj.secondHighest("dfa12321afd"));
    }

    @Test
    @DisplayName("Example 3: Input: s = \"abc1111\"")
    void example3(){
        Assertions.assertEquals(-1,obj.secondHighest("abc1111"));
    }

    @Test
    @DisplayName("Example 3: Input: s = \"ck077\"")
    void example1(){
        Assertions.assertEquals(0,obj.secondHighest("ck077"));
    }

}
