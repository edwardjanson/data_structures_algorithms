package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = this.head;
        Node pre = this.head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        length--;
        if (length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (this.length == 0) return null;
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        length--;
        if (length == 0) this.tail = null;
        return temp;
    }
}