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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode split = slow.next;
        slow.next = null;

        ListNode prev = null;

        while(split != null){
            ListNode next = split.next;
            split.next = prev;
            prev = split;
            split = next;
        }
        split = prev;

        ListNode first = head;
        while(split!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = split.next;

            first.next = split;
            split.next = temp1;

            first = temp1;
            split = temp2;
        }

    }
}