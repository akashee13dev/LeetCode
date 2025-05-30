package easy.LC19;


/**
 * Taken hint from ChatGPT .. Seen Code sample but implemented on my own logic after understand
 *
 * SKipping for nowww
 */
public class RemoveNodeFromList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

//        ListNode temp = new ListNode();
//        temp = head.next;
//        ListNode end = temp;
//        ListNode start = temp;
//
//        for (int i = 0 ; i<n ; i++){
//            end = end.next;
//        }
//
//        while (end != null){
//            start = start.next;
//            end = end.next;
//        }
//
//        start = start.next.next;
//
//        return temp.next;

        //Find Lenth of the node to calculate the removable nodes position
//        ListNode node = head;
//        int len = 0;
//        while (node != null){
//            len++;
//            node = node.next;
//        }
//        if (n == len) {
//            return head.next;
//        }
//
//        ListNode current = head;
//        for (int i = 1; i < len - n; i++) {
//            current = current.next;
//        }
//        current.next = current.next.next;
//        return head;
//
//
//
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i=0 ; i<=n ; i++){
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }

}
