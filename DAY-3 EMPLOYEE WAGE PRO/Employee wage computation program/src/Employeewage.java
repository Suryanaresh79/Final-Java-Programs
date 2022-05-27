public class Employeewage {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PARTIAL_DAY_HOUR=4;
	static final int MAX_WORKING_DAYS=20;
	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation program.");

	int monthlyWage=0;
    int days=1;
	while(days<=20) {

    int days=0;
    int hours=0;
	while(days<20 && hours<100) {
		days++;
		int a= (int)Math.floor(Math.random()*10)%3;
		int remaining_Hours=100-hours;
		if(remaining_Hours%8<1) {
			System.out.println(" Employee is present for part time");
			int partialDailyWage=PARTIAL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Daily Wage :Rs."+partialDailyWage);
			monthlyWage=monthlyWage+partialDailyWage;
			hours=hours+PARTIAL_DAY_HOUR;
		}

		switch(a) {

@@ -21,13 +30,15 @@ public static void main(String[] args) {
			int dailyWage=FULL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Daily Wage :Rs."+dailyWage);
			monthlyWage=monthlyWage+dailyWage;
			hours=hours+FULL_DAY_HOUR;
			break;

		case 2:
			System.out.println("Part Time Employee is present");
			System.out.println(" Employee is present for part time");
			int partialDailyWage=PARTIAL_DAY_HOUR * WAGE_PER_HOUR;
			System.out.println("Daily Wage :Rs."+partialDailyWage);
			monthlyWage=monthlyWage+partialDailyWage;
			hours=hours+PARTIAL_DAY_HOUR;
			break;


@@ -37,10 +48,14 @@ public static void main(String[] args) {
			break;

		}
		days++;



	}
	System.out.println("Total monthly wage :Rs."+monthlyWage);
	System.out.println("Total Hours Worked : "+hours);
	System.out.println("Total days Worked : "+ days);



}




