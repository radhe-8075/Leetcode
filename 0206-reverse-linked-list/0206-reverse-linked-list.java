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
        List<Integer>l=new ArrayList<>();
        ListNode tmp=head;
        while(tmp!=null){
            l.add(tmp.val);
            tmp=tmp.next;

        }
int in=l.size()-1;

tmp=head;
while(tmp != null){
    tmp.val=l.get(in);
    in--;
    tmp=tmp.next;
}
return head;

    }
}