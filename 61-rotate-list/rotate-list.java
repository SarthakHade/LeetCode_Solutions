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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k < 0) {
            return head;
        }

        int len = 1;
        ListNode a = head;
        while(a != null && a.next != null){
            a = a.next;
            len++;
        }
        k = k%len;
        if(k==0) return head;

        a.next = head;
        
        int steps = len-k-1;
        ListNode newa = head;
        for(int i = 0;i<steps;i++){
            newa = newa.next;
        }
        ListNode newhead = newa.next;
        newa.next = null;

        return newhead;
    }
}