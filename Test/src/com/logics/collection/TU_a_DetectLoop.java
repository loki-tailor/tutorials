package com.logics.collection;

import com.logics.collection.TU_a_LinkedList.Node;

public class TU_a_DetectLoop {

    public static Boolean detectLoop(Node node) {
	Node fast = node;
	Node slow = node;
	while (slow != null && fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	    if (slow == fast) {
		return true;
	    }
	}

	return false;

    }

    public static void main(String[] args) {
	TU_a_LinkedList llist = new TU_a_LinkedList();
	llist.head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);
	llist.head.next = second;
	second.next = third;
	llist.insertFirst(4);
	llist.insertFirst(6);
	llist.head.next.next.next.next.next = llist.head.next.next;
	llist.printList();
	if (detectLoop(llist.head)) {
	    System.out.println("Loop Detected");
	} else {
	    System.out.println("Loop is not present");
	}

    }

}
