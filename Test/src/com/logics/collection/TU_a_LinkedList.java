package com.logics.collection;

public class TU_a_LinkedList {
    Node head;

    public static class Node {
	int data;
	Node next;

	Node(int d) {
	    data = d;
	    next = null;
	}

    }

    public void insertFirst(int newdata) {
	Node new_node = new Node(newdata);
	new_node.next = head;
	head = new_node;
    }

    public void insertLast(int newdata) {
	Node new_node = new Node(newdata);
	if (head == null) {
	    head = new_node;

	}
	Node n = head;

	while (n.next != null) {

	    n = n.next;
	}
	n.next = new_node;

    }

    public void insertMiddle(Node prev, int newdata) {
	Node new_node = new Node(newdata);

	new_node.next = prev.next;
	prev.next = new_node;
    }

    public void printList() {
	Node n = head;
	while (n != null) {
	    System.out.print(n.data + "->");
	    n = n.next;
	}
	System.out.println("NULL");
    }

    public void findMiddle() {
	Node fast = head;
	Node slow = head;
	while (fast != null && fast.next != null) {
	    fast = fast.next.next;
	    slow = slow.next;
	}
	System.out.println("Middle Element Value :" + slow.data);

    }

    public void deleteMiddle() {

	if (head == null) {
	    System.out.println("LinkedList is empty");

	} else if (head.next == null) {
	    System.out.println("Delete element value :" + head.data);
	    head = null;
	} else {
	    Node fast = head;
	    Node slow = head;
	    Node prev = null;
	    while (fast != null && fast.next != null) {
		fast = fast.next;
		fast = fast.next;
		prev = slow;
		slow = slow.next;
	    }
	    System.out.println("Deleted Element Value :" + slow.data);
	    prev.next = slow.next;

	}
    }

    public void insertMidNode(int newdata) {
	Node new_node = new Node(newdata);
	if (head == null) {
	    head = new_node;

	} else if (head.next == null) {
	    head.next = new_node;

	} else {
	    Node fast = head.next;
	    Node slow = head;

	    while (fast != null && fast.next != null) {
		fast = fast.next.next;
		slow = slow.next;
	    }

	    new_node.next = slow.next;
	    slow.next = new_node;

	}
    }

    public static void main(String[] args) {
	TU_a_LinkedList llist = new TU_a_LinkedList();

	llist.head = new Node(1);

	Node second = new Node(2);
	Node third = new Node(3);
	// llist.insertFirst(1);
	// llist.insertFirst(2);
	// llist.insertFirst(3);
	llist.head.next = second;
	second.next = third;
	llist.printList();
	llist.insertFirst(4);
	llist.printList();
	llist.insertLast(5);
	llist.insertLast(6);
	llist.printList();
	llist.insertMidNode(100);
	llist.printList();
	llist.insertMiddle(third, 16);
	llist.printList();
	llist.findMiddle();
	llist.deleteMiddle();
	llist.insertMidNode(100);
	llist.printList();

    }

}
