package LC819;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MostCommonWordTest {


    MostCommonWord obj = new MostCommonWord();

    @Test
    @DisplayName("Example 1: Input :  paragraph = \"Bob hit a ball, the hit BALL flew far after it was hit.\", banned = [\"hit\"]")
    void example1(){
        Assertions.assertEquals("ball" , obj.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));
    }
    @Test
    @DisplayName("Example 2: Input : \"Bob. hIt, baLl\", [\"bob\", \"hit\"]")
    void example2(){
        Assertions.assertEquals( "ball" , obj.mostCommonWord("Bob. hIt, baLl",new String[]{"bob", "hit"}));
    }


    @Test
    @DisplayName("Example 3: Input : paragraph = \"a.\", banned = []")
    void example3(){
        Assertions.assertEquals( "a" , obj.mostCommonWord("a.",new String[]{}));
    }



}
