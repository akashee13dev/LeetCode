package LC415;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddStringsTest {

    AddStrings obj = new AddStrings();

    @Test
    @DisplayName("Example 2: Input : num1 = \"11\", num2 = \"123\"")
    void example2(){
        Assertions.assertEquals("134" ,  obj.addStrings("11","123"));
    }

    @Test
    @DisplayName("Example 2: Input : num1 = \"456\", num2 = \"77\"")
    void example1(){
        Assertions.assertEquals("533",  obj.addStrings("456","77"));
    }

    @Test
    @DisplayName("Example 3: Input : num1 = \"0\", num2 = \"0\"")
    void example3(){
        Assertions.assertEquals("0",  obj.addStrings("0","0"));
    }

    @Test
    @DisplayName("Example 4: Input : num1 = \"498828660196\", num2 = \"840477629533\"")
    void example4(){
        Assertions.assertEquals("1339306289729",  obj.addStrings("498828660196","840477629533"));
    }


}
