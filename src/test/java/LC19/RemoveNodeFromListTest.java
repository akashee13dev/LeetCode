package LC19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveNodeFromListTest {

    RemoveNodeFromList obj = new RemoveNodeFromList();

    private boolean areEqual(ListNode a, ListNode b) {
        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null; // Both should be null at the end
    }


    @Test
    @DisplayName("Test Case 3: Input: head = [1,2,3,4,5], n = 2")
    void example3(){

        // [1 , 2 , 3 , 4 , 5]
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode root = new ListNode(1, node2);

        // [1 , 2 , 3 , 5]
        ListNode outputNode5 = new ListNode(5);
        ListNode outputNode3 = new ListNode(3, outputNode5);
        ListNode outputNode2 = new ListNode(2, outputNode3);
        ListNode outputRoot = new ListNode(1, outputNode2);

        Assertions.assertTrue(areEqual(outputRoot, obj.removeNthFromEnd(root,2)));
    }

    @Test
    @DisplayName("Test Case 4: Input : head = [1], n = 1")
    void example4(){


        // [1]
        ListNode root = new ListNode(1);
        // []
        ListNode outputRoot = new ListNode();
        Assertions.assertTrue(areEqual(outputRoot, obj.removeNthFromEnd(root,1)));
    }

    @Test
    @DisplayName("Test Case 2 : Input : head = [1,2], n = 1")
    void example2(){
        // [1,2]
        ListNode two = new ListNode(2);
        ListNode root = new ListNode(1,two);
        // []

        ListNode outputRoot = new ListNode(1);

        Assertions.assertTrue(areEqual(outputRoot, obj.removeNthFromEnd(root,1)));
    }

}
