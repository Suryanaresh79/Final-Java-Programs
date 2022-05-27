import java.util.*;
public class UC7_SwapWithoutTemp {
	void swapNumber(int num1 , int num2) {
		num1=num1+num2;
		num2=num1-num2;	
		num1=num1-num2;
		System.out.println("The number after Swap is number 1= "+num1+" number 2 is "+num2);

	}

	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in) ;
	UC7_SwapWithoutTemp rv=new UC7_SwapWithoutTemp();
	System.out.println("Enter First Number");
	int num1=inp.nextInt();
	System.out.println("Enter Secound Number");
	int num2=inp.nextInt();
	System.out.println("Number Before Swap is number 1= "+num1+" number 2 is "+num2);

	rv.swapNumber(num1, num2);

}
}