package easy.LC278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {


    FirstBadVersion obj = new FirstBadVersion();


    @Test
    @DisplayName("Example 5: Input : n = 5, bad = 4")
    void example5(){
        Assertions.assertEquals(4,obj.firstBadVersion(5));
    }

    @Test
    @DisplayName("Example 4: Input : n = 1, bad = 1")
    void example4(){
        Assertions.assertEquals(1,obj.firstBadVersion(1));
    }

    @Test
    @DisplayName("Example 3: Input : n = 2, bad = 2")
    void example3(){
        Assertions.assertEquals(2,obj.firstBadVersion(2));
    }

    @Test
    @DisplayName("Example 2: Input : n = 2126753390, bad = 1702766719")
    void example2(){
        Assertions.assertEquals(1702766719,obj.firstBadVersion(2126753390));
    }


}
