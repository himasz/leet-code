package com.leet.code.examples;
import java.math.BigInteger;
public class AddTwoNumbers {
    /*
        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.



        Example 1:

        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.

        Example 2:

        Input: l1 = [0], l2 = [0]
        Output: [0]

        Example 3:

        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]



        Constraints:

            The number of nodes in each linked list is in the range [1, 100].
            0 <= Node.val <= 9
            It is guaranteed that the list represents a number that does not have leading zeros.

    */
    class Solution {
        // Add Two Numbers (Java improved)
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (l1 != null)
                    l1 = l1.next;
                if (l2 != null)
                    l2 = l2.next;
            }
            return dummyHead.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder firstString = new StringBuilder(String.valueOf(l1.val));
        StringBuilder secondString = new StringBuilder(String.valueOf(l2.val));
        while (l1.next != null) {
            l1 = l1.next;
            firstString.insert(0, l1.val);
        }
        while (l2.next != null) {
            l2 = l2.next;
            secondString.insert(0, l2.val);
        }
        String sum = String.valueOf(new BigInteger(firstString.toString()).add(new BigInteger(secondString.toString())));
        if (sum.length() == 0)
            return null;
        ListNode last = new ListNode(Integer.parseInt(sum.charAt(0) + ""));
        ListNode root = last;
        for (int i = 1; i < sum.length(); i++) {
            ListNode node = new ListNode(Integer.parseInt(sum.charAt(i) + ""));
            node.next = root;
            root = node;
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(2);
        ListNode n11 = new ListNode(4);
        ListNode n12 = new ListNode(3);
        n11.next = n12;
        root1.next = n11;
        ListNode root2 = new ListNode(5);
        ListNode n21 = new ListNode(6);
        ListNode n22 = new ListNode(4);
        n21.next = n22;
        root2.next = n21;
        System.out.println(new AddTwoNumbers().addTwoNumbers(root1, root2));

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
