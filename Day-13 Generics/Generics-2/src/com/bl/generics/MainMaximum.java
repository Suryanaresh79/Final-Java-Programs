package com.bl.generics;

import java.util.Scanner;
public class MainMaximum {
	public static void main(String[] args) {
		Maximum max = new Maximum();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int first = scan.nextInt();
		float first1 = scan.nextFloat();

		System.out.println("Enter Second Number: ");
		int second = scan.nextInt();
		float second1 = scan.nextFloat();

		System.out.println("Enter Third Number: ");
		int third = scan.nextInt();
		float third1 = scan.nextFloat();

		max.maxInt(first1, second1, third1);
		max.maxFloat(first1, second1, third1);
	}
}