
/**
 * Remove Nth Node From End of List
 * @link https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
            len++;
        }
        temp = head;
        if(n==len)
            return head.next;
        for(int j = 0;j<len-n-1;j++){
            temp = temp.next;
        }
        if(temp.next == null){
            return null;
        }
        temp.next = temp.next.next;
        return head;
    }
}