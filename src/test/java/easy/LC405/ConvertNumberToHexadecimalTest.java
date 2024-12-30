package easy.LC405;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConvertNumberToHexadecimalTest {

    ConvertNumberToHexadecimal obj = new ConvertNumberToHexadecimal();


    @Test
    @DisplayName("Example 7: Input : num = 26")
    void example7(){
        Assertions.assertEquals("1a",  obj.toHex(26));
    }


    @Test
    @DisplayName("Example 8: Input : num = -1")
    void example8(){
        Assertions.assertEquals(  "ffffffff" ,  obj.toHex(-1));
    }

}
