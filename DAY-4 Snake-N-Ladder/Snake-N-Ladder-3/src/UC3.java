public class UC3{
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
	}

	int option() {
		int option=(int)(Math.random()*10%3+1);
		return option;

		}
	public static void main(String[] args) {
		int position=0;
		UC3 rv=new UC3();
		System.out.println("Welcome To Snake And Ladder Game");
		System.out.println("Player 1 is at position "+position);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(rv.dice());
		int option=rv.option();
		if(option==1) {
			System.out.println("NO PLAY | Player stay at position where he was");
		}
		else if (option==2) {
			System.out.println("LADDER |Player Move ahead by Number "+rv.dice());
			position=position+rv.dice();
		}
		else if (option==3) {
			System.out.println("SNAKE |Player Bitten by snake go back by Number  "+rv.dice());
			position=position-rv.dice();
		}

	}

}