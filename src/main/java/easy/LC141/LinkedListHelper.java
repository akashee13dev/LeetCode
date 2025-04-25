package easy.LC141;

public class LinkedListHelper {
    public static ListNode createCyclicList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
            if (i == pos) {
                cycleEntry = curr;
            }
        }

        if (pos == 0) {
            cycleEntry = head;
        }

        if (pos != -1) {
            curr.next = cycleEntry;
        }

        return head;
    }
}
