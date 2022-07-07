package com.whk.algorithm.problems01_50.problem02.addTwoNumbers;

public class Main {
    public static void main(String[] args) {
        ListNode node1=new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode node2=new ListNode(5,new ListNode(6,new ListNode(4)));
        Solution01 demo01=new Solution01();
        demo01.addTwoNumbers(node1,node2);
    }
}
