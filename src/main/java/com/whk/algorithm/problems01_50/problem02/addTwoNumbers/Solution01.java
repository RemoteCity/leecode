package com.whk.algorithm.problems01_50.problem02.addTwoNumbers;

public class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double num1=0;
        double num2=0;
        int i=1;
        for (;;i++){
            double pow = Math.pow(10, -1 * i);
            num1+=l1.val* pow;
            num2+=l2.val* pow;
            if (l1.next==null){
                break;
            }
            l1=l1.next;
            l2=l2.next;
        }
        double v = num1 + num2;
        int pow = (int) Math.pow(10, i);
        double result1= v * pow;//二者的和
        int result= (int) result1;
        ListNode node=new ListNode();
        boolean flag=false;
        while (true){
            int e = result % 10;
            result = result / 10;
            if (!flag){
                node=new ListNode(e);;
                flag=true;
            }
            ListNode next=new ListNode(e);
            node=new ListNode(node.val,next);
            if(result==0){
                break;
            }
        }
        return node;
    }
}
