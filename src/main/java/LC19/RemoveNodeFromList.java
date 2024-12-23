package LC19;


/**
 * Taken hint from ChatGPT .. Seen Code sample but implemented on my own logic after understand
 *
 * SKipping for nowww
 */
public class RemoveNodeFromList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode();
        temp = head.next;
        ListNode end = temp;
        ListNode start = temp;

        for (int i = 0 ; i<n ; i++){
            end = end.next;
        }

        while (end != null){
            start = start.next;
            end = end.next;
        }

        start = start.next.next;

        return temp.next;
    }

}
