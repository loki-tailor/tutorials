package com.logics.collection;

import com.logics.collection.TU_a_LinkedList.Node;

public class TU_a_ReverseLL {

    public static void recursionReverse(Node head) {

	if (head == null)
	    return;
	else {
	    recursionReverse(head.next);

	    System.out.print(head.data + " ");
	}
    }

    public static Node reverseList(Node node) {
	Node prev = null;
	Node curr = node;
	Node next = null;
	while (curr != null) {
	    next = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = next;
	}
	node = prev;
	return node;
    }

    public static void printList(Node node) {
	Node n = node;
	while (n != null) {
	    System.out.print(n.data + " ");
	    n = n.next;
	}
	// System.out.println("NULL");
    }

    public static void main(String[] args) {
	TU_a_LinkedList llist = new TU_a_LinkedList();

	llist.insertFirst(1);

	llist.insertFirst(2);

	llist.insertFirst(3);

	llist.insertFirst(4);

	llist.insertFirst(5);
	llist.printList();
	TU_a_ReverseLL.recursionReverse(llist.head);
	// Node n = reverseList(llist.head);
	System.out.println("After reversing List :");
	llist.printList();
    }
}