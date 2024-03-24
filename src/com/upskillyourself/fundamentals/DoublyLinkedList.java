package com.upskillyourself.fundamentals;

public class DoublyLinkedList {

    LinkedListNode head;

    public LinkedListNode createLinkedList(String data) {
        LinkedListNode newNode = new LinkedListNode(data);

        if (head == null) {
            this.head = newNode;
            return newNode;
        } else {
            LinkedListNode lastNode = head;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
            newNode.previous = lastNode;

            return head;
        }
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        LinkedListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void deleteParticularLinkedListNode(String data) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        LinkedListNode nodeToBeDeleted = head;
        while (nodeToBeDeleted != null) {
            if (nodeToBeDeleted.data == data) {
                deleteNode(nodeToBeDeleted);
            }
            nodeToBeDeleted = nodeToBeDeleted.next;
        }

    }

    private void deleteNode(LinkedListNode nodeToBeDeleted) {
        LinkedListNode previousNode = nodeToBeDeleted.previous;
        LinkedListNode nextNode = nodeToBeDeleted.next;

        if (previousNode == null && nextNode == null) {
            head = null;
        } else if (previousNode == null) {
            head = nextNode;
        } else if (nextNode == null) {
            previousNode.next = null;
        } else {
            previousNode.next = nextNode;
            nextNode.previous = previousNode;
        }
    }


}
