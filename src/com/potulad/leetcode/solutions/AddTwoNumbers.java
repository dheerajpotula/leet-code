package com.potulad.leetcode.solutions;

/**
 * Problem - 2
 *
 *  * Submitted date: 2019-04-27.
 *  * Runtime - 96.06%
 *  * Space - 52.06%
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode = null;
        ListNode nextNode = null;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0) {
            int numberFromL1 = l1 == null ? 0 : l1.val;
            int numberFromL2 = l2 == null ? 0 : l2.val;

            int sum = numberFromL1 + numberFromL2 + carry;
            ListNode newNode = new ListNode(sum % 10);

            // Uses less memory than carry = sum / 10;
            carry = sum >= 10 ? 1 : 0;

            if(startNode == null) {
                startNode = nextNode = newNode;
            } else {
                nextNode.next = newNode;
                nextNode = newNode;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return startNode;
    }
}
