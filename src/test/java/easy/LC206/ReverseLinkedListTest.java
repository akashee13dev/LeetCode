package easy.LC206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedListTest {

    ReverseLinkedList solution = new ReverseLinkedList();

    // Helper method to create a linked list from an array
    private ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert linked list to list of values
    private List<Integer> listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    @Test
    public void testExample1() {
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode reversed = solution.reverseList(head);
        Assertions.assertEquals(Arrays.asList(5, 4, 3, 2, 1), listToArray(reversed));
    }

    @Test
    public void testExample2() {
        ListNode head = buildList(new int[]{1, 2});
        ListNode reversed = solution.reverseList(head);
        Assertions.assertEquals(Arrays.asList(2, 1), listToArray(reversed));
    }

    @Test
    public void testExample3() {
        ListNode head = buildList(new int[]{});
        ListNode reversed = solution.reverseList(head);
        Assertions.assertEquals(Arrays.asList(), listToArray(reversed));
    }

}
