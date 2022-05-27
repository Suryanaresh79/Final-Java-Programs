package com.bl.generics;

import java.util.Scanner;
public class MainMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maximum max;
        while (true) {
            System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
            int option = scan.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter First Number: ");
                    Integer first = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    Integer second = scan.nextInt();
                    System.out.println("Enter Third Number: ");
                    Integer third = scan.nextInt();
                    System.out.println("Enter Fourth Number: ");
                    Integer fourth = scan.nextInt();
                    System.out.println("Enter Fifth Number: ");
                    Integer fifth = scan.nextInt();

                    max = new Maximum<Integer>(first, second, third, fourth, fifth);
                    max.findMax();
                    break;
                }
                case 2: {
                    System.out.println("Enter First Number: ");
                    Float first = scan.nextFloat();
                    System.out.println("Enter Second Number: ");
                    Float second = scan.nextFloat();
                    System.out.println("Enter Third Number: ");
                    Float third = scan.nextFloat();
                    System.out.println("Enter Fourth Number: ");
                    Float fourth = scan.nextFloat();
                    System.out.println("Enter Fifth Number: ");
                    Float fifth = scan.nextFloat();

                    max = new Maximum<Float>(first, second, third, fourth, fifth);
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


                    System.out.println("Enter fourth Value: ");
                    String fourth = scan.next();

                    System.out.println("Enter fifth Value: ");
                    String fifth = scan.next();

                    max = new Maximum<String>(first, second, third, fourth, fifth);
                    max.findMax();
                    break;

                }
                default:
                    System.out.println("Enter Choice between 1 to 3");
            }
        }
    }
}