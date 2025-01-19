/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? reverseList(ListNode? head) {
    ListNode? node = null ; 

    while (head!=null)
    {
        ListNode ? temp = head.next;

        head.next=node;

        node =head; 
        head=temp;
    }
    return node; 
  }
}