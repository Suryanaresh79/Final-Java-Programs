import java.util.Random;

	class Employee_wage_Company1 {
		/*
    Creating random function to check Whether employee is present or not
		 */
		static int random(){
			Random ran = new Random();
			int i = ran.nextInt(3)+1;
			return i;
		}
		/*
		 * Creating hours() method to calculate how many hours and days employee work and return
		 * how many hours employee works
		 * */
		static int days(){
			int emphrs=0;
			int days =0;
			while (emphrs<=no_of_hours-1 && days<=no_of_day-1) {
				switch (random()) {
				case 1:
					emphrs = emphrs + no_of_dayhours;
					days= days +1;
					break;
				case 2:
					emphrs = emphrs + no_of_part_time_hours;
					break;
				default:
					break;
				}
			}
			return days;
		}
		/*
		 * Calculate Total Wage of Employee
		 * */
		static int total_wage(){
			int total_wage=no_of_hours*wage_per_hour;
			return total_wage;
		}
		public static final int random = random();
		public static final int wage_per_hour =20;
		public static final int no_of_hours=100;
		public static final int no_of_day=20;
		public static final int no_of_dayhours=8;
		public static final int no_of_part_time_hours=4;
		public static void main(String[] args){
			/*
			 * Printing How many hours,days employee Worked and Total Wage of a Employee
			 * */

			System.out.println("Company 1 Wage Calucultions");
			System.out.println();
			System.out.println("How many hours employee Worked :"+no_of_hours);
			System.out.println("The total wage of employee is "+total_wage());
			System.out.println("No of days Employee Worked : "+days());

			Employee_wage_Company2 obj = new Employee_wage_Company2();
			System.out.println();

			System.out.println("Company 2 Wage Calucultions");
			System.out.println();
			System.out.println("How many hours employee Worked :"+obj.no_of_hours);
			System.out.println("The total wage of employee is "+obj.total_wage());
			System.out.println("No of days Employee Worked : "+obj.days());

		}
	}

	/*
	 * Creating Sub  class in order Calculate Employee Wage of Different Company assuming
	 * wage_per_hour =30;
   no_of_hours=125;
   no_of_day=25;
   no_of_dayhours=7;
   no_of_part_time_hours=4;
	 *
	 * */

	class Employee_wage_Company2 extends Employee_wage_Company1{
		/*
Creating random function to check Whether employee is present or not
		 */
		static int random(){
			Random ran = new Random();
			int i = ran.nextInt(3)+1;
			return i;
		}
		/*
		 * Creating hours() method to caluculate how many hours and days employee work and return
		 * how many hours employee works
		 * */
		static int days(){
			int emphrs=1;
			int days =1;
			while (emphrs<=no_of_hours && days<=no_of_day) {
				switch (random()) {
				case 1:
					emphrs = emphrs + no_of_dayhours;
					days= days +1;
					break;
				case 2:
					emphrs = emphrs + no_of_part_time_hours;
					break;
				default:
					break;
				}
			}
			return days;
		}
		/*
		 * Calculate Total Wage of Employee
		 * */
		static int total_wage(){
			int total_wage=no_of_hours*wage_per_hour;
			return total_wage;
		}

		public static final int random = random();
		public static int wage_per_hour =30;
		public static final int no_of_hours=125;
		public static final int no_of_day=25;
		public static final int no_of_dayhours=7;
		public static final int no_of_part_time_hours=4;
	} 
