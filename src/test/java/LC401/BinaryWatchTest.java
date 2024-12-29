package LC401;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryWatchTest {

    BinaryWatch obj = new BinaryWatch();

    @Test
    @DisplayName("Example 7: Input : turnedOn = 1")
    void example7(){
        Assertions.assertEquals(Arrays.asList("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"),  obj.readBinaryWatch(1));
    }


    @Test
    @DisplayName("Example 8: Input : turnedOn = 9")
    void example8(){
        Assertions.assertEquals(Arrays.asList() ,  obj.readBinaryWatch(9));
    }

}
