package com.company;

import java.nio.charset.MalformedInputException;

public class Main {

    public static void main(String[] args) {

        Node mine = new Node(11);
        mine.appendToTail(20);
        mine.appendToTail(20);
        mine.appendToTail(21);
        mine.appendToTail(30);
        mine.appendToTail(30);
        mine.appendToTail(69);
        mine.appendToTail(70);
        //final Node b = mine;
        mine.print();
        mine.removeDuplicatesHashMethod();
        mine.print();
        //mine.printNthFromLast(3,mine);

        Node aNode = mine.returnNthNode(4);
        mine.removeNode(aNode);
        mine.print();









    }
}
