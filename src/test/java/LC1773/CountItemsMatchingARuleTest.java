package LC1773;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CountItemsMatchingARuleTest {

    CountItemsMatchingARule obj = new CountItemsMatchingARule();

    @Test
    @DisplayName("Example 1: items = [[\"phone\",\"blue\",\"pixel\"],[\"computer\",\"silver\",\"lenovo\"],[\"phone\",\"gold\",\"iphone\"]], ruleKey = \"color\", ruleValue = \"silver\"")
    void example1(){
        Assertions.assertEquals(1,obj.countMatches(
                Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone")), "color" , "silver"
        ));
    }

    @Test
    @DisplayName("Example 2: Input: items = [[\"phone\",\"blue\",\"pixel\"],[\"computer\",\"silver\",\"phone\"],[\"phone\",\"gold\",\"iphone\"]], ruleKey = \"type\", ruleValue = \"phone\"")
    void example2(){
        Assertions.assertEquals(2,obj.countMatches(
                Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone")), "type" , "phone"
        ));
    }

}
