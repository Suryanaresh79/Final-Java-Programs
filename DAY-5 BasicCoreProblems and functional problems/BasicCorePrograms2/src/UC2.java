import java.util.*;
public class UC2 {
	void leapYear(int year) {
		if(year%400==0) {
			System.out.println("Year is leap year");

		}
		else if(year%100==0){
			System.out.println("Year is Not leap Year");
		}
		else if(year%4==0){
			System.out.println("Year is Leap Year");


			}
		else {
			System.out.println("Year is not Leap year");
		}
	}



	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		UC2 rv=new UC2();
		System.out.println("Enter a Year for Checking leap year:");
		int year=inp.nextInt();
		if(year>999 && year<10000) {
			rv.leapYear(year);
		}
		else {
			//rv.leapYear(year);
			System.out.println("Enter 4 Digit year");
		}
	}
}