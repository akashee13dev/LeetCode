package easy.LC1071;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest {

    GreatestCommonDivisor obj = new GreatestCommonDivisor();

    @Test
    @DisplayName("Test Case 1: Input : str1 = \"ABCABC\", str2 = \"ABC\"")
    void example1(){
        Assertions.assertEquals("ABC", obj.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    @DisplayName("Test Case 2: Input : str1 =  \"ABABAB\", str2 = \"ABAB\"")
    void example2(){
        Assertions.assertEquals("AB", obj.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    @DisplayName("Test Case 3: Input : str1 = \"LEET\", str2 = \"CODE\"")
    void example3(){
        Assertions.assertEquals("", obj.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    @DisplayName("Test Case 4: Input : str1 = \"AAAA\", str2 = \"AA\"")
    void example4(){
        Assertions.assertEquals("AA", obj.gcdOfStrings("AAAA", "AA"));
    }

    @Test
    @DisplayName("Test Case 5: Input : str1 = \"XYZ\", str2 = \"XYZXYZXYZ\"")
    void example5(){
        Assertions.assertEquals("XYZ", obj.gcdOfStrings("XYZ", "XYZXYZXYZ"));
    }

    @Test
    @DisplayName("Test Case 6: Input : str1 = \"A\", str2 = \"B\"")
    void example6(){
        Assertions.assertEquals("", obj.gcdOfStrings("A", "B"));
    }

    @Test
    @DisplayName("Test Case 7: Input : str1 = \"ABCDEF\", str2 = \"ABC\"")
    void example7(){
        Assertions.assertEquals("", obj.gcdOfStrings("ABCDEF", "ABC"));
    }

    @Test
    @DisplayName("Test Case 8: Input : str1 = \"ABABABAB\", str2 = \"ABAB\"")
    void example8(){
        Assertions.assertEquals("ABAB", obj.gcdOfStrings("ABABABAB", "ABAB"));
    }

    @Test
    @DisplayName("Test Case 9: Input : str1 = \"XYZXYZ\", str2 = \"XYZ\"")
    void example9(){
        Assertions.assertEquals("XYZ", obj.gcdOfStrings("XYZXYZ", "XYZ"));
    }

    @Test
    @DisplayName("Test Case 10: Input : str1 = \"\", str2 = \"ABC\"")
    void example10(){
        Assertions.assertEquals("", obj.gcdOfStrings("", "ABC"));
    }

    @Test
    @DisplayName("Test Case 11: Input : str1 = \"AAAAAA\", str2 = \"AA\"")
    void example11(){
        Assertions.assertEquals("AA", obj.gcdOfStrings("AAAAAA", "AA"));
    }

    @Test
    @DisplayName("Test Case 12: Input : str1 = \"PQR\", str2 = \"PQRPQR\"")
    void example12(){
        Assertions.assertEquals("PQR", obj.gcdOfStrings("PQR", "PQRPQR"));
    }

    @Test
    @DisplayName("Test Case 13: Input : str1 = \"TAUXXTAUXXTAUXXTAUXXTAUXX\", str2 = \"TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX\"")
    void example13(){
        Assertions.assertEquals("TAUXX", obj.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    @Test
    @DisplayName("Test Case 14: Input : str1 = \"ABABAB\", str2 = \"ABA\"")
    void example14(){
        Assertions.assertEquals("", obj.gcdOfStrings("ABABAB", "ABA"));
    }




}
