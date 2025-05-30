package easy.LC206;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(Objects.isNull(head)){
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        while (current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

}




class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
