import java.util.Scanner;
import java.lang.Math;

public class Length_of_Line_UC2 {

    static final double lengthl1 =  lengthl1();              //storing lengths of line in variables
    static final double lengthl2 =  lengthl2();

    public static void main(String[] args){


        System.out.println("The length of the line l1 is "+lengthl1);
        System.out.println("The length of the line l2 is "+lengthl2);
        Length_of_Line_UC2.equalTo();
    }

    static void  equalTo(){                             //creating equalto function to check to lines are equal are not
        if (lengthl1==lengthl2)
        {
            System.out.println("The two lines are equal");
        }
        else {
            System.out.println("The two lines are not equal");
        }
    }
    static double lengthl1() {                                                  //caluculating length of first line
        System.out.println("Enter Details of first line ");
        System.out.println();



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point of First line");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point of First line");
        int x2 = sc.nextInt();
        System.out.println("Enter x2 point of First line");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 point of First line");
        int y2 = sc.nextInt();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2));

        return length;
    }
    static double lengthl2() {                                      //caluculating length of second line
        System.out.println("Enter Details of second line ");
        System.out.println();



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point of second line");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point of second line");
        int x2 = sc.nextInt();
        System.out.println("Enter x2 point of second line");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 point of second line");
        int y2 = sc.nextInt();

        double length = Math.sqrt(((x2 - x1)*(x2-x1)) + ((y2 - y1)*(y2-y1)));

        return length;
    }
} 