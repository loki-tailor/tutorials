package com.logics.collection;

public class TU_a_ReversLL {

    Node head;
    static int count = 0;

    class Node {
	int data;
	Node next;

	Node(int d) {
	    data = d;
	    next = null;
	}
    }

    public void insertLast(int d) {
	Node new_node = new Node(d);
	if (head == null) {
	    head = new_node;
	} else {
	    Node temp = head;
	    while (temp.next != null) {
		temp = temp.next;
	    }
	    temp.next = new_node;
	}
    }

    public void printList(Node n) {

	if (n == null) {
	    System.out.println("LL is emplty");
	} else {
	    while (n != null) {
		System.out.print(n.data + "->");
		n = n.next;
	    }
	    System.out.println("NULL");
	}
    }

    public Node reverseLL(Node node) {
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

    public void deleteNode(Node n) {
	Node temp = n.next;
	n.data = temp.data;
	n.next = temp.next;
	System.gc();
    }

    public void printKnodesreverse(Node n, int k, int count) {
	if (n == null) {
	    return;
	} else {

	    printKnodesreverse(n.next, k, TU_a_ReversLL.count);
	    TU_a_ReversLL.count++;

	    if (TU_a_ReversLL.count <= k) {
		System.out.print(n.data + " ");
	    }

	}
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

    void printAternateNodes(Node n) {
	if (n == null) {
	    System.out.println("LL is empty");
	} else {
	    int c = 0;
	    while (n != null)

	    {
		if (c % 2 == 0) {
		    System.out.print(n.data + " ");
		}
		n = n.next;
		c++;
	    }
	}
    }

    void printAlternateRecursion(Node n, boolean f) {
	if (n == null)
	    return;
	if (f)
	    System.out.print(n.data + " ");
	printAlternateRecursion(n.next, !f);
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
		fast = fast.next.next;
		prev = slow;
		slow = slow.next;
	    }
	    System.out.println("Deleted Element Value :" + slow.data);
	    prev.next = slow.next;

	}
    }

    void insertMiddle(int i) {
	Node new_node = new Node(i);
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
	TU_a_ReversLL rL = new TU_a_ReversLL();
	rL.insertLast(1);
	rL.insertLast(2);
	rL.printList(rL.head);
	rL.deleteMiddle();
	rL.printList(rL.head);
	rL.insertLast(3);
	rL.insertLast(4);
	rL.insertLast(5);
	rL.insertLast(6);
	rL.printList(rL.head);
	rL.findMiddle();
	rL.insertMiddle(10);
	rL.printList(rL.head);
	rL.deleteMiddle();
	rL.printAlternateRecursion(rL.head, true);
	System.out.println();
	rL.printKnodesreverse(rL.head, 2, rL.count);

	// rL.deleteNode(rL.head);
	// rL.printList(rL.head);
	// Node h = rL.reverseLL(rL.head);
	//
	// rL.printList(h);

    }

}
