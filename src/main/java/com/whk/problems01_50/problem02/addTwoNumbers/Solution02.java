package com.whk.problems01_50.problem02.addTwoNumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        List<Integer> list=new LinkedList<>();
        boolean flag=false;
        boolean flag21=true;
        boolean flag22=true;
        while (true){
            int sum=0;
            if (flag21&&flag22){//都不为空
                sum = l1.val + l2.val;
                l1=l1.next;
                l2=l2.next;
            }else{
                if (flag21){//l2是空
                    sum = l1.val;
                    l1=l1.next;
                }else {//l1是空
                    sum = l2.val;
                    l2=l2.next;
                }
            }
            //判断是否需要进位
            if (flag){//需要进位
                sum++;
            }
            //将结果存到list中
            if (sum <10){
                list.add(sum);
                flag=false;
            }else {
                int retainder = sum - 10;
                list.add(retainder);
                flag=true;
            }
            if (l1==null){
                flag21=false;
            }
            if (l2==null){
                flag22=false;
            }
            if (l1==null&&l2==null){
                if (flag){
                    list.add(1);
                }
                break;
            }
        }
        ListNode temp=null;
        ListIterator<Integer> iterator=list.listIterator(list.size());
        while (iterator.hasPrevious()){
            int n=iterator.previous();
            temp=new ListNode(n,temp);
        }
        return temp;
    }
}
