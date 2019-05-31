/**
 * Swap Nodes in pairs
 * @link https://leetcode.com/problems/swap-nodes-in-pairs/
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        
        return node;
    }
}