package com.bl.generics;

import java.util.Scanner;
public class MainMaximum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Maximum max;

		while (true) {
			System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
			int option = scan.nextInt();
			System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
			int ch = scan.nextInt();

			switch (option) {
			}
			switch (ch) {
			case 1: {
				System.out.println("Enter First Number: ");
				System.out.print("Enter First Value: ");
				Integer first = scan.nextInt();

				System.out.println("Enter Second Number: ");
				System.out.print("Enter Second Value: ");
				Integer second = scan.nextInt();

				System.out.println("Enter Third Number: ");
				System.out.print("Enter Third Value: ");
				Integer third = scan.nextInt();

				System.out.println("Enter Fourth Number: ");
				System.out.print("Enter Fourth Value: ");
				Integer fourth = scan.nextInt();

				System.out.println("Enter Fifth Number: ");
				System.out.print("Enter Fifth Value: ");
				Integer fifth = scan.nextInt();

				max = new Maximum<Integer>(first, second, third, fourth, fifth);
				max.findMax();
				break;
			}
			case 2: {
				System.out.println("Enter First Number: ");
				System.out.print("Enter First Value: ");
				Float first = scan.nextFloat();

				System.out.println("Enter Second Number: ");
				System.out.print("Enter Second Value: ");
				Float second = scan.nextFloat();

				System.out.println("Enter Third Number: ");
				System.out.print("Enter Third Value: ");
				Float third = scan.nextFloat();

				System.out.println("Enter Fourth Number: ");
				System.out.print("Enter Fourth Value: ");
				Float fourth = scan.nextFloat();

				System.out.println("Enter Fifth Number: ");
				System.out.print("Enter Fifth Value: ");
				Float fifth = scan.nextFloat();

				max = new Maximum<Float>(first, second, third, fourth, fifth);


				max.findMax();
				break;
			}
			case 3: {
				System.out.println("Enter First Value: ");
				System.out.print("Enter First Value: ");
				String first = scan.next();

				System.out.println("Enter Second Value: ");
				System.out.print("Enter Second Value: ");
				String second = scan.next();

				System.out.println("Enter Third Value: ");
				System.out.print("Enter Third value ");
				String third = scan.next();


				System.out.println("Enter fourth Value: ");
				System.out.print("Enter Fourth Value: ");
				String fourth = scan.next();

				System.out.println("Enter fifth Value: ");
				System.out.print("Enter Fifth value ");
				String fifth = scan.next();

				max = new Maximum<String>(first, second, third, fourth, fifth);

				max.findMax();
				break;
			}
			default:
				System.out.println("Enter Choice between 1 to 3");
				System.out.println("Enter Choice Between 1 And 3");
			}

			}
		}
	}

