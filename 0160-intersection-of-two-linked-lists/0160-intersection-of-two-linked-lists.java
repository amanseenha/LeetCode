/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap();
        ListNode tempA = headA, tempB = headB;
        while(tempA != null){
            map.put(tempA, 1);
            tempA = tempA.next;
        }
        while(tempB != null){
            if(map.containsKey(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }
}