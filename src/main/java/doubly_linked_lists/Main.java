package doubly_linked_lists;

import linked_list.LinkedList;

public class Main {

    public static void getDoublyLinkedListInfo(DoublyLinkedList doublyLinkedList) {
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        getDoublyLinkedListInfo(myDLL);

        myDLL.append(2);
        getDoublyLinkedListInfo(myDLL);

        myDLL.removeLast();
        getDoublyLinkedListInfo(myDLL);

        myDLL.prepend(1);
        getDoublyLinkedListInfo(myDLL);

        myDLL.removeFirst();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
    }
}