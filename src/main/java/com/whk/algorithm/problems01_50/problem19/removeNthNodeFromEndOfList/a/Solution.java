package com.whk.algorithm.problems01_50.problem19.removeNthNodeFromEndOfList.a;

/**
 * @author wangkun
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null){
            return null;
        }
        ListNode temp = head;
        int size = 0;
        while (true) {
            size++;
            ListNode next = temp.next;
            if (next == null) {
                break;
            }
            temp = next;
        }

        int[] resultArray = new int[size - 1];
        for (int i = 0; i < size; i++) {
            int val = head.val;
            if (i < size - n) {
                resultArray[i] = val;
            }
            if (i > size - n) {
                resultArray[i - 1] = val;
            }
            head = head.next;
        }
        if (resultArray.length == 0){
            return null;
        }
        ListNode result = new ListNode(resultArray[size-2]);

        for (int i = resultArray.length - 2; i >= 0; i--) {
            result = new ListNode(resultArray[i],result);
        }
        return result;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            ListNode temp = this;
            StringBuilder to = new StringBuilder("[");
            while (true) {
                int val = temp.val;
                to.append(val);
                ListNode next = temp.next;
                if (next == null) {
                    break;
                }
                temp = next;
            }
            return to.append("]").toString();
        }
    }
}
