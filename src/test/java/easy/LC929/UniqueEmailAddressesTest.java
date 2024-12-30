package easy.LC929;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressesTest {

    UniqueEmailAddresses obj = new UniqueEmailAddresses();

    @Test
    @DisplayName("Example 3: Input : emails = [\"test.email+alex@leetcode.com\",\"test.e.mail+bob.cathy@leetcode.com\",\"testemail+david@lee.tcode.com\"]")
    void example3(){
        Assertions.assertEquals(2,  obj.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    @Test
    @DisplayName("Example 4: Input : emails = [\"a@leetcode.com\",\"b@leetcode.com\",\"c@leetcode.com\"]")
    void example4(){
        Assertions.assertEquals(3 , obj.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
    }

}
