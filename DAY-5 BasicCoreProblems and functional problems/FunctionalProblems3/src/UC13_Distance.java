import java.util.*;
public class UC13_Distance {
 float distanceFormula(int x, int y) {
	 return (float)Math.sqrt(x*x+y*y);

 }
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		UC13_Distance rv=new UC13_Distance();
		System.out.println("Enter the  Value of x:");
		int x=inp.nextInt();
		System.out.println("Enter the value of y:");
		int y=inp.nextInt();
		System.out.println("Euclidian Distance is "+rv.distanceFormula(x,y));
	}

}