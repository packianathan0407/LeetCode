/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // A dummy head helps us easily return the start of the result list
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // Loop until both lists are exhausted AND there's no remaining carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from nodes, or 0 if the list has ended
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum and the new carry
            int sum = carry + x + y;
            carry = sum / 10;
            
            // Create a new node for the result digit
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Advance the input list pointers
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the node following the dummy head
        return dummyHead.next;
    }
}