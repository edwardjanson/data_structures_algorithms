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
        myDLL.append(6);
        myDLL.append(9);
        getDoublyLinkedListInfo(myDLL);

        myDLL.append(2);
        getDoublyLinkedListInfo(myDLL);

        myDLL.removeLast();
        getDoublyLinkedListInfo(myDLL);

        myDLL.prepend(1);
        getDoublyLinkedListInfo(myDLL);

        myDLL.removeFirst();

        myDLL.set(2, 3);
        getDoublyLinkedListInfo(myDLL);

        myDLL.insert(2, 5);
        getDoublyLinkedListInfo(myDLL);

        System.out.println(myDLL.get(2).value);

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
    }
}
