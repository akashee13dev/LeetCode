package easy.LC205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsomorphicStringTest {

    IsomorphicString obj = new IsomorphicString();



    @Test
    @DisplayName("Example 2: Input : s = \"egg\", t = \"add\"")
    void example2(){
        Assertions.assertTrue( obj.isIsomorphic("egg","add"));
    }

    @Test
    @DisplayName("Example 4: Input : s = \"foo\", t = \"bar\"")
    void example4(){
        Assertions.assertFalse( obj.isIsomorphic("foo","bar"));
    }


    @Test
    @DisplayName("Example 3: Input : \"paper\", t = \"title\"")
    void example3(){
        Assertions.assertTrue( obj.isIsomorphic("paper","title"));
    }

    @Test
    @DisplayName("Example 5: Input : \"badc\", t = \"baba\"")
    void example5(){
        Assertions.assertFalse( obj.isIsomorphic("badc","baba"));
    }

}
