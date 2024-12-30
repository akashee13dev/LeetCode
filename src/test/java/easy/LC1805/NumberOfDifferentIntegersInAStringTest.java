package easy.LC1805;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfDifferentIntegersInAStringTest {

    NumberOfDifferentIntegersInAString obj = new NumberOfDifferentIntegersInAString();


    @Test
    @DisplayName("Example 1: word = \"a123bc34d8ef34\"")
    void example1(){
        Assertions.assertEquals(3,obj.numDifferentIntegers("a123bc34d8ef34"));
    }

    @Test
    @DisplayName("Example 2: Input: word = \"leet1234code234\"")
    void example2(){
        Assertions.assertEquals(2,obj.numDifferentIntegers("leet1234code234"));
    }

    @Test
    @DisplayName("Example 3: Input: word = \"a1b01c001\"")
    void example3(){
        Assertions.assertEquals(1,obj.numDifferentIntegers("a1b01c001"));
    }

}
