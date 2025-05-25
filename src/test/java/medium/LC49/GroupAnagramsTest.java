package medium.LC49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GroupAnagramsTest {

    GroupAnagrams obj = new GroupAnagrams();

    @Test
    public void testGroupAnagrams() {
        // Test case 1:
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        );
        List<List<String>> actual1 = obj.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertAnagramGroupsEqual(expected1, actual1);

        // Test case 2:
        List<List<String>> expected2 = Collections.singletonList(
                Collections.singletonList("")
        );
        List<List<String>> actual2 = obj.groupAnagrams(new String[]{""});
        assertAnagramGroupsEqual(expected2, actual2);

        // Test case 3:
        List<List<String>> expected3 = Collections.singletonList(
                Collections.singletonList("a")
        );
        List<List<String>> actual3 = obj.groupAnagrams(new String[]{"a"});
        assertAnagramGroupsEqual(expected3, actual3);
    }

    // Helper method to compare unordered anagram groups
    private void assertAnagramGroupsEqual(List<List<String>> expected, List<List<String>> actual) {
        List<List<String>> sortedExpected = sortGroup(expected);
        List<List<String>> sortedActual = sortGroup(actual);
        Assertions.assertEquals(sortedExpected, sortedActual);
    }

    private List<List<String>> sortGroup(List<List<String>> groups) {
        List<List<String>> sorted = new ArrayList<>();
        for (List<String> group : groups) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            sorted.add(sortedGroup);
        }
        sorted.sort(Comparator.comparing(a -> a.get(0)));
        return sorted;
    }

}
