package com.bl.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();

		singleLinkedList.insertFirst(56);
		singleLinkedList.insertAt (1,30);
		singleLinkedList.insertLast(70);

		singleLinkedList.insertInBetween(56,30, null);
		singleLinkedList.printNodeElement();
		singleLinkedList.findNode(30);


		singleLinkedList.insertInBetween(30, 40, null);
		singleLinkedList.printNodeElement();
	}

}
