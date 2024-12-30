package easy.LC844;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BackspaceStringCompareTest {

    BackspaceStringCompare obj = new BackspaceStringCompare();



    @Test
    @DisplayName("Example 2: Input : s = \"ab#c\", t = \"ad#c\"")
    void example2(){
        Assertions.assertTrue( obj.backspaceCompare("ab#c","ad#c"));
    }

    @Test
    @DisplayName("Example 1: Input :  s = \"ab##\", t = \"c#d#\"")
    void example1(){
        Assertions.assertTrue( obj.backspaceCompare("ab##","c#d#"));
    }

    @Test
    @DisplayName("Example 3: Input :  s = \"a#c\", t = \"b\"")
    void example3(){
        Assertions.assertFalse( obj.backspaceCompare("a#c","b"));
    }

    @Test
    @DisplayName("Example 4: Input :  s = \"\"a##c\", t = \"#a#c\"")
    void example4(){
        Assertions.assertTrue( obj.backspaceCompare("a##c","#a#c"));
    }


}
