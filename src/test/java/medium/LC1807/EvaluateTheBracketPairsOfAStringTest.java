package medium.LC1807;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EvaluateTheBracketPairsOfAStringTest {

    EvaluateTheBracketPairsOfAString obj = new EvaluateTheBracketPairsOfAString();


    @Test
    @DisplayName("Test Case 2: s = \"(name)is(age)yearsold\", knowledge = [[\"name\",\"bob\"],[\"age\",\"two\"]]")
    void example2(){
        Assertions.assertEquals("bobistwoyearsold", obj.evaluate("(name)is(age)yearsold", Arrays.asList(Arrays.asList("name","bob"),Arrays.asList("age","two"))));
    }

    @Test
    @DisplayName("Test Case 3: s = \"hi(name)\", knowledge = [[\"a\",\"b\"]]")
    void example3(){
        Assertions.assertEquals("hi?", obj.evaluate("hi(name)",Arrays.asList(Arrays.asList("a","b"))));
    }

    @Test
    @DisplayName("Test Case 4: s = \"(a)(a)(a)aaa\", knowledge = [[\"a\",\"yes\"]]")
    void example4(){
        Assertions.assertEquals("yesyesyesaaa", obj.evaluate("(a)(a)(a)aaa",Arrays.asList(Arrays.asList("a","yes"))));
    }

    @Test
    @DisplayName("Test Case 4: s = \"(z)h\", knowledge = [[]]")
    void example5(){
        Assertions.assertEquals("?h", obj.evaluate("(z)h",Arrays.asList()));
    }



}
