package LC7;

import LC07.ReverseInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    ReverseInteger obj = new ReverseInteger();



    @Test
    @DisplayName("Test Case 2: Input: x = 123")
    void example2(){
        Assertions.assertEquals(321, obj.reverse(123));
    }

    @Test
    @DisplayName("Test Case 3: Input: x = -123")
    void example3(){
        Assertions.assertEquals(-321, obj.reverse(-123));
    }

    @Test
    @DisplayName("Test Case 4: Inpur : x = 120")
    void example4(){
        Assertions.assertEquals(21, obj.reverse(120));
    }



}

