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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        Stack<ListNode> st = new Stack<>();
        while(head!=null){
            st.push(head);
            head = head.next;
        }
        ListNode newHead = st.pop();
        ListNode heads = newHead;
        while(!st.isEmpty()){
            newHead.next = st.pop();
            newHead = newHead.next;
        }
        newHead.next=null;
        return heads;
    }
}
