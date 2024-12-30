package easy.LC509;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {

    FibonacciNumber obj = new FibonacciNumber();

    @Test
    @DisplayName("Example 3: Input : n = 2")
    void example3(){
        Assertions.assertEquals(1,  obj.fib(2));
    }

    @Test
    @DisplayName("Example 4: Input : n = 3")
    void example4(){
        Assertions.assertEquals(2,  obj.fib(3));
    }

    @Test
    @DisplayName("Example 5: Input : n = 4")
    void example5(){
        Assertions.assertEquals(3,  obj.fib(4));
    }

}
