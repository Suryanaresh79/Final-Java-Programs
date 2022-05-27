package com.bl.linkedlist;

public class SingleLinkedList {
	Node head;

	public void insertFirst(int data) {
		Node node = new Node();
		Node node1 = new Node(data);
		node1.setData(data);
		node1.setNext(head);
		head = node1;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
	}
	public void insertLast1(int data, int index, Node node) {
		Node currentNode = head;

		if (index == 0) {
			insertFirst(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			Node node1 = new Node(data);
			node1.setData(data);
			currentNode.setNext(node1);
		}
	}

	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;
	}
	public void insertInBetween(int before,int data, Node node) {
		Node currentNode = head;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			while(currentNode.data != before) {
				currentNode = currentNode.next;
			}
			Node node1 = new Node(data);
			node1.next = currentNode.next;
			currentNode.next = node1;
		}
	}
	public void deleteAt(int index) {
		Node n = head;
		Node n1 = null;
		for(int i = 0; i < index -1 ; i++)
		{
			n = n.next;
		}
	}

	public Node deleteFirst() {
		Node currentNode = head;
		head = head.next;
		return currentNode;
	}

	public void deleteLast() {
		Node currentNode = head;
		Node secondLast = null;
		while(currentNode.next != null) {
			secondLast = currentNode;
			currentNode = currentNode.next;
		}
		secondLast.next = null;
	}

	public Node findNode(int data) {
		Node node = head;
		Node currentNode = head;

		while (node.next != null) {
			if (node.data == data) {
				System.out.println("Element Found " + data);
				return node;
			}
		}
		return currentNode;
	}
	public void printNodeElement() {
		Node node = head;

		System.out.println(" Linked List Element ");

		while (node != null) {
			node.display();
			node = node.next;
			Node currentNode = head;
			System.out.println("------Linked List Element------");
			while(currentNode != null) {
				currentNode.display();
				currentNode = currentNode.next;
			}
		}
	}
}