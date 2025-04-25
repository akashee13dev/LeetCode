package easy.LC141;

import easy.LC19.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class LinkedListCycleTest {

    LinkedListCycle obj = new LinkedListCycle();

    @Test
    @DisplayName("Example 1: Input: head = [3,2,0,-4], pos = 1")
    void example1() {
        int[] values = {3, 2, 0, -4};
        easy.LC141.ListNode head = LinkedListHelper.createCyclicList(values, 1);
        Assertions.assertTrue(obj.hasCycle(head));
    }

    @Test
    @DisplayName("Example 2: Input: head = [1,2], pos = 0")
    void example2() {
        int[] values = {1, 2};
        easy.LC141.ListNode head = LinkedListHelper.createCyclicList(values, 0);
        Assertions.assertTrue(obj.hasCycle(head));
    }

    @Test
    @DisplayName("Example 3: Input: head = [1], pos = -1")
    void example3() {
        int[] values = {1};
        easy.LC141.ListNode head = LinkedListHelper.createCyclicList(values, -1);
        Assertions.assertFalse(obj.hasCycle(head));
    }
}
