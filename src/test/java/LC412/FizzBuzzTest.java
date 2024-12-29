package LC412;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FizzBuzzTest {


    FizzBuzz obj = new FizzBuzz();



    @Test
    @DisplayName("Example 2: Input : n = 3")
    void example2(){
        Assertions.assertEquals(Arrays.asList("1","2","Fizz") ,  obj.fizzBuzz(3));
    }

    @Test
    @DisplayName("Example 1: Input : n = 3")
    void example1(){
        Assertions.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz"),  obj.fizzBuzz(5));
    }


    @Test
    @DisplayName("Example 3: Input : n = 15")
    void example3(){
        Assertions.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz") ,  obj.fizzBuzz(15));
    }


}
