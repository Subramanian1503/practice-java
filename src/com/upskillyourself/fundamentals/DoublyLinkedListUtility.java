package com.upskillyourself.fundamentals;

public class DoublyLinkedListUtility {

    public static void main(String args[]) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.createLinkedList("one");
        linkedList.createLinkedList("two");
        linkedList.createLinkedList("three");

        linkedList.printLinkedList();

        linkedList.deleteParticularLinkedListNode("three");

        System.out.println("Updated linked list");
        linkedList.printLinkedList();
    }
}
