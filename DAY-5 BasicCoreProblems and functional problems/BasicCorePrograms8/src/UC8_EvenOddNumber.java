import java.util.*;
public class UC8_EvenOddNumber {
	void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	UC8_EvenOddNumber rv=new UC8_EvenOddNumber();
	System.out.println("Enter the Number ");
	int number=inp.nextInt();
	rv.evenOrOdd(number);

	}

}