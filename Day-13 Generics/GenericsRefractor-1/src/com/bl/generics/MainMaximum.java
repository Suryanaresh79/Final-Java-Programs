package com.bl.generics;

import java.util.Scanner;
public class MainMaximum {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Value: ");
		String first = scan.next();
		while (true) {
			System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
			int option = scan.nextInt();

			System.out.println("Enter Second Value: ");
			String second = scan.next();
			switch (option) {
			case 1: {
				System.out.println("Enter First Number: ");
				int first1 = scan.nextInt();

				System.out.println("Enter Third Value: ");
				String third = scan.next();
				System.out.println("Enter Second Number: ");
				int second1 = scan.nextInt();

				max.maxString(first1, second1, third);
				System.out.println("Enter Third Number: ");
				int third1 = scan.nextInt();

				max.maxInt(first1, second1, third1);
				break;
			}
			case 2: {
				System.out.println("Enter First Number: ");
				float first1 = scan.nextFloat();

				System.out.println("Enter Second Number: ");
				float second1 = scan.nextFloat();

				System.out.println("Enter Third Number: ");
				float third = scan.nextFloat();

				max.maxFloat(first1, second1, third);
				break;
			}
			case 3: {
				System.out.println("Enter First Value: ");
				String first1 = scan.next();

				System.out.println("Enter Second Value: ");
				String second1 = scan.next();

				System.out.println("Enter Third Value: ");
				String third = scan.next();
				max.maxString(first1, second1, third);
				break;
			}
			default:
				System.out.println("Enter Choice between 1 to 3");
			}
		}
	}
}