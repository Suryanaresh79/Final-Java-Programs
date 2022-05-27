package com.bl.generics;

import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {
        Maximum max = new Maximum();
        Scanner scan = new Scanner(System.in);
        Maximum max;

        while (true) {
            System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
            int option = scan.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter First Number: ");
                    int first = scan.nextInt();
                    Integer first = scan.nextInt();

                    System.out.println("Enter Second Number: ");
                    int second = scan.nextInt();
                    Integer second = scan.nextInt();

                    System.out.println("Enter Third Number: ");
                    int third = scan.nextInt();
                    Integer third = scan.nextInt();

                    max.maxInt(first, second, third);
                    max = new Maximum<Integer>(first, second, third);
                    max.findMax();
                    break;
                }
                case 2: {
                    System.out.println("Enter First Number: ");
                    float first = scan.nextFloat();
                    Float first = scan.nextFloat();

                    System.out.println("Enter Second Number: ");
                    float second = scan.nextFloat();
                    Float second = scan.nextFloat();

                    System.out.println("Enter Third Number: ");
                    float third = scan.nextFloat();
                    Float third = scan.nextFloat();

                    max.maxFloat(first, second, third);
                    max = new Maximum<Float>(first, second, third);
                    max.findMax();
                    break;
                }
                case 3: {
                    System.out.println("Enter First Value: ");
                    String first = scan.next();
                    System.out.println("Enter Second Value: ");
                    String second = scan.next();

                    System.out.println("Enter Third Value: ");
                    String third = scan.next();
                    max.maxString(first, second, third);

                    max = new Maximum<String>(first, second, third);
                    max.findMax();
                    break;
                }
                default:
                    System.out.println("Enter Choice between 1 to 3");
            }
        }
    }
}