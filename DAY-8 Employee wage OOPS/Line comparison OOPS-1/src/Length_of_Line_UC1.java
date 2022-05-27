import java.util.Scanner;
import java.lang.Math;

public class Length_of_Line_UC1 {

    static double length(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point of line");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 point of line");
        int x2 = sc.nextInt();
        System.out.println("Enter x2 point of line");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 point of line");
        int y2 = sc.nextInt();

        double length= Math.sqrt(Math.pow((x2-x1),2)-Math.pow((y2-y1),2));

        return length;

    }

    public static void main(String[] args){

        System.out.println("The length of the line is "+length());


    }
}