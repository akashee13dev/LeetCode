package LC771;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JwellStoneTest {

    JewelsStones obj = new JewelsStones();

    @Test
    @DisplayName("Example 1: Input :  jewels = \"aA\", stones = \"aAAbbbb\"")
    void example1(){
        Assertions.assertEquals( 3, obj.numJewelsInStones("aA","aAAbbbb"));
    }

    @Test
    @DisplayName("Example 3: Input : jewels = \"z\", stones = \"ZZ\"")
    void example3(){
        Assertions.assertEquals( 0, obj.numJewelsInStones("z","ZZ"));
    }

}
