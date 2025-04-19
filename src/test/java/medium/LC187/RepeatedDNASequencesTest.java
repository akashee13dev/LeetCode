package medium.LC187;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RepeatedDNASequencesTest {

    RepeatedDNASequences obj = new RepeatedDNASequences();

    @Test
    @DisplayName("Test Case 2: Input: s = \"AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT\"")
    void example2(){
        Assertions.assertEquals(Arrays.asList("AAAAACCCCC","CCCCCAAAAA"), obj.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"AAAAAAAAAAAAA\"")
    void example3(){
        Assertions.assertEquals(Arrays.asList("AAAAAAAAAA"), obj.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }

    @Test
    @DisplayName("Test Case 1: s = \"AAAAAAAAAAA\"")
    void example(){
        Assertions.assertEquals(Arrays.asList("AAAAAAAAAA"), obj.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }



}
