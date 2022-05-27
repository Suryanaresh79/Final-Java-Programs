import java.util.*;
public class UC3 {
	void power(int num){
		int pow;
		for(int i=1;i<=num;i++) {
			pow=(int)Math.pow(2, i);
			System.out.println("2 power "+i+" is "+pow);
		}

	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		UC3 rv=new UC3();
		System.out.println("Enter a Number :-");
		int num=inp.nextInt();
		if(num<32 && num>0)
		rv.power(num);
	}

}