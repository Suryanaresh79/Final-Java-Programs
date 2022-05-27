import java.util.*;
public class UC12_SumOfThreeNumber {
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the Size of array");
	  int size=inp.nextInt();
	  int[] Array=new int[size];
	  System.out.println("Enter the Element of array:-");
	  for(int i=0;i<size;i++) {
		  Array[i]=inp.nextInt();
		  }



      for (int i = 0; i < Array.length; i++) {
          for (int j = i + 1; j < Array.length; j++) {
              for (int k = j + 1; k < Array.length; k++) {
                  if (Array[i] + Array[j] + Array[k] == 0) {
                      System.out.println("Numbers found : " + Array[i] + "," + Array[j] + " and " + Array[k]);
                  }
              }
          }
      }
}

}