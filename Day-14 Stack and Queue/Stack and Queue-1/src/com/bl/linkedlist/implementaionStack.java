package com.bl.linkedlist;

import java.util.Scanner;

public class implementaionStack {
	public static void main(String[] args) {
		SingleyLinkedList stack=new SingleyLinkedList();
		int choice;
		Scanner inp=new Scanner(System.in);
		do{

			System.out.println("Welcome to Menu of Stack");

			System.out.println("1)Push");
			System.out.println("2)Display Linked List");
			System.out.println("3)Exit");



			choice=inp.nextInt();


			if (choice==1) {
				System.out.println("Enter The Element to append");
				int num=inp.nextInt();
				stack.push(num);

			}
			if (choice ==2 )
			{
				stack.display();
			}

			System.out.println();

		}while(choice!=3);

	}
}