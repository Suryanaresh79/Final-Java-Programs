public class UC2{
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
	}
	public static void main(String[] args) {
		int position=0;
		UC2 rv=new UC2();
		System.out.println("Welcome To Snake And Ladder Game");
		System.out.println("Player 1 is at position "+position);
		int dice=(int)(Math.random()*10%6+1);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(dice);
		System.out.println(rv.dice());
	}

}

