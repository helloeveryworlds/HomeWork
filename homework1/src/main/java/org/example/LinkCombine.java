package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 5.	Write a function that combines two lists by alternatingly taking elements,
// e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3] and test it in your program.
class ListNode{
    public char key;
    public ListNode next;
    public ListNode(char key){
        this.key = key;
    }
}
public class LinkCombine {
    public ListNode mergeList(ListNode l1, ListNode l2){
        ListNode start = new ListNode('n');
        if(l1 == null && l2 == null) return start.next;
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        ListNode dummy = start;
        while(l1 != null && l2 != null){
            start.next = l1;
            ListNode next1 = l1.next;
            l1.next = null;
            l1 = next1;
            start = start.next;

            start.next = l2;
            ListNode next2 = l2.next;
            l2.next = null;
            l2 = next2;
            start = start.next;
        }
        start.next = l1 == null? l2 : l1;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode a0 = new ListNode('1');
        ListNode a1 = new ListNode('2');
        ListNode a2 = new ListNode('3');
        ListNode b0 = new ListNode('a');
        ListNode b1 = new ListNode('b');
        ListNode b2 = new ListNode('c');
        a0.next = a1;
        a1.next = a2;
        a2.next = null;
        b0.next = b1;
        b1.next=  b2;
        b2.next = null;
        //System.out.print(b0.key);
        //System.out.print(b0.next.key);
        //System.out.print(b0.next.next.key);
        LinkCombine test = new LinkCombine();
        ListNode res = test.mergeList(a0, b0);
        while(res != null){
            System.out.print(res.key);
            res = res.next;
        }
    }
}
