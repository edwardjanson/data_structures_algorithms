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

        myLinkedList.set(1, 9);
        getLinkedListInfo(myLinkedList);

        myLinkedList.insert(1, 7);

        System.out.println("get returns " + myLinkedList.get(1).value);

        myLinkedList.remove(1);

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}

