import java.util.*;
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
public class Lc83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curt = head;
        while(curt!=null&&curt.next!=null){
            if(curt.val==curt.next.val){
                curt.next=curt.next.next;
            }else{
                curt=curt.next;
            }
        }
        return head;
    }
}
