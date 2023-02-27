package linkedlist;

public class Main {

    public static void getLinkedListInfo(LinkedList linkedList) {
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(3);
        getLinkedListInfo(myLinkedList);

        myLinkedList.removeLast();
        getLinkedListInfo(myLinkedList);

        myLinkedList.prepend(6);
        getLinkedListInfo(myLinkedList);

        myLinkedList.removeFirst();
        getLinkedListInfo(myLinkedList);

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}

