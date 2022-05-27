import java.util.*;

public class UC1 {
	void flipCoin(int num) {
		float head=0;
		float tail=0;
		float percentOfHead;
		float percentOfTail;
		Random random=new Random();

		for(int i=0;i<num;i++) {
			int randomNum=random.nextInt(2);
			if(randomNum==0) {
				head++;

			}
			else if(randomNum==1) {
				tail++;
			}
		}
		float total=head+tail;
		percentOfHead=head/total*100;
		percentOfTail=tail/total*100;
		System.out.println("Percentage of head= "+percentOfHead+"%");
		System.out.println("Percentage of tails= "+percentOfTail+"%");



		}



	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		UC1 rv=new UC1();
		System.out.println("Enter the number of Flip you want");
		int num=inp.nextInt();
	    rv.flipCoin(num);

	}

}