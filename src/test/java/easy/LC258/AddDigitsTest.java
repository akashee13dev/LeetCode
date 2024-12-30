package easy.LC258;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddDigitsTest {

    AddDigits obj = new AddDigits();

    @Test
    @DisplayName("Example 3: Input : num = 38")
    void example3(){
        Assertions.assertEquals(2, obj.addDigits(38));
    }

    @Test
    @DisplayName("Example 5: Input : num = 0")
    void example5(){
        Assertions.assertEquals(0, obj.addDigits(0));
    }

}
