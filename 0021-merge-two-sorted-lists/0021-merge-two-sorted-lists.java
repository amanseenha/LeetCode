class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        ListNode t1 = list1, t2 = list2, dummy = new ListNode(-1), temp = dummy;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        if(t1 == null){
            temp.next = t2;
            return dummy.next;
        }
        temp.next = t1;
        return dummy.next;
    }
}