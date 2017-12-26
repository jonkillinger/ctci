package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Node {
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    public void appendToTail(int d){
        Node end = new Node(d);
        Node temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = end;

    }

    public void print(){
        Node toPrint = this;
        while(toPrint != null){
            System.out.println(toPrint.data);
            toPrint = toPrint.next;
        }
        System.out.println("----");
    }

    public void removeDuplicates(){
        Node cur;
        Node curFollow;
        Node prev = this;

        while(prev != null){
            cur = prev.next;
            curFollow = prev;
            while(cur != null){
                if(cur.data == prev.data){
                    curFollow.next = cur.next;
                }
                curFollow = cur;
                cur = cur.next;
            }
            prev = prev.next;
        }
    }

    public void removeDuplicatesHashMethod(){
        HashSet<Integer> intMap = new HashSet<Integer>();
        Node cur = this;
        Node prev = this;

        while(cur != null){
            if(intMap.contains(cur.data)){
                prev.next = cur.next;
            } else {
                intMap.add(cur.data);
                prev = cur;
            }
            cur = cur.next;
        }
    }

    //Reimplement with iterative version
    public Integer printNthFromLast(Integer d, Node cur){
        Integer kth;
        if (cur.next == null){
            return 1;
        } else {
            kth = printNthFromLast(d, cur.next);
        }

        if(kth.equals(d)){
            System.out.println(cur.data);
        } else {
            return kth + 1;
        }
        return -1;
    }

    public void removeNode(Node toRemove){
        if(toRemove == null || toRemove.next == null){
            System.out.println("Cannot remove null or last element of list.");
        } else {
            toRemove.data = toRemove.next.data;
                toRemove.next = toRemove.next.next;
        }


    }

    // No bounds checking
    public Node returnNthNode(int n){
        Node cur = this;
        while(n > 0){
            cur = cur.next;
            n--;
        }
        return cur;
    }

    
}
