class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = findMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;
        ListNode leftHead = head;
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        return merge(leftHead, rightHead);
    }
    public ListNode merge(ListNode l, ListNode r){
        ListNode dummy = new ListNode(-1), temp = dummy;
        ListNode t1 = l, t2 = r;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 == null) temp.next = t2;
        else temp.next = t1;
        return dummy.next;
    }
    public ListNode findMiddle(ListNode head){
        ListNode fast = head.next.next, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}