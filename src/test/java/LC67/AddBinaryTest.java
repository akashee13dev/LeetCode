package LC67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    AddBinary obj = new AddBinary();

    @Test
    @DisplayName("Test Case 1: Input: a = \"11\", b = \"1\"")
    void example1(){
        Assertions.assertEquals("100",obj.addBinary("11","1"));
    }

    @Test
    @DisplayName("Test Case 2: Input:  a = \"1010\", b = \"1011\"")
    void example2(){
        Assertions.assertEquals("10101",obj.addBinary("1010","1011"));
    }


}
