package com.wcx.algorithms;

/**
 * Created by wangchangxin on 15/3/3.
 * <p/>
 * You are given two linked lists representing two non-negative numbers.
 * <p/>
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * <p/>
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = newHead;

        while (p1 != null || p2 != null || carry != 0) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            int digit = carry % 10;
            p3.next = new ListNode(digit);
            p3 = p3.next;
            carry /= 10;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(6);

        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l3;
        l2.next = l4;

        AddTwoNumbers o = new AddTwoNumbers();

        ListNode rs = o.addTwoNumbers(l1, l2);


        System.out.println(rs.val);

    }


}
