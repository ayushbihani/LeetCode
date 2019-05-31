/**
 * Deletr node in a linked list
 *@link https://leetcode.com/problems/delete-node-in-a-linked-list/ 
 */

class Solution {
    public void deleteNode(ListNode node) {
        ListNode traversal = node;
        ListNode temp = null;
        while (traversal.next != null){
            if(traversal.next.next == null){
                temp = traversal;
            }
            node.val = traversal.next.val;
            traversal = traversal.next;
            node = node.next;
        }
        temp.next=null;
    }
}