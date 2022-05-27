import java.util.Scanner;


public class UC11_2DArray {
	static Scanner inp=new Scanner(System.in);
	void Array2D(int row, int column) {

	    int[][] intgerArray=new int[row][column];
	      for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				intgerArray[i][j]=inp.nextInt();
			}
		}
			for(int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
					System.out.print(" "+intgerArray[i][j]);
					}
				System.out.println();
			}
		}


	public static void main(String[] args) {
		UC11_2DArray rv=new UC11_2DArray();

		System.out.println("Enter the Number of rows");
		int row=inp.nextInt();
		System.out.println("Enter the Number of Column");
		int column=inp.nextInt();
		rv.Array2D(row,column);

}
}