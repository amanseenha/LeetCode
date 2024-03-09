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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp1 = head, temp2 = temp1.next;
        while(temp1 != null){
            if(temp2 != null && temp1.val == temp2.val){
                temp2 = temp2.next;
            }
            else{
                temp1.next = temp2;
                temp1 = temp2;
                if(temp1 != null) temp2 = temp1.next;
            }
        }
        return head;
    }
}