public class UC3 
{
	public static void equal(){
	    System.out.println("Welcome to Line Comparsion program");

    	int x1,x2,y1,y2,x3,y3;
		int  l1,l2;
		x1=2; y1=2;
		x2=4;y2=4;
		x3=5;y3=1;
		l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		String s2=String.valueOf(l2);
		String s1=String.valueOf(l1);
		System.out.println(s1.equals(s2));
    }

	public static void compare() {
		 System.out.println("Welcome to Line Comparsion program");

			int x1,x2,y1,y2,x3,y3;
			int  l1,l2;
			x1=2; y1=2;
			x2=4;y2=4;
			x3=5;y3=1;
			l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			l2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
			System.out.println(l1);
			System.out.println(l2);

			Integer a=new Integer(l1);
		    Integer b=new Integer(l2);
		    int compare=a.compareTo(b);

		    if(compare>0) {
		  	  System.out.println("l1 is greater than y");
		    }else if(compare<0) {
		  	  System.out.println("l1 is less than y");
		    }else {
		  	  System.out.println("l1 is equal to l2");
		    }
	}

	public static void main( String[] args )
{
   compare();
   equal();
}
} 
