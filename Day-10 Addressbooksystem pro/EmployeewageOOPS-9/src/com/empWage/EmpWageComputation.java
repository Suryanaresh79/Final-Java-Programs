package com.empWage;

public class EmpWageComputation {
	//Class constants
	int WAGE;
	int MAX_WORKING_DAYS;
	int MAX_WORKING_HRS;
	//class Variables
	int totalHrs = 0;
	int totalDays = 1;

	//Parameterized - Constructor
	EmpWageComputation(int workDays, int workHours, int wage){
		this.WAGE= wage;
		this.MAX_WORKING_DAYS = workDays;
		this.MAX_WORKING_HRS = workHours;
	}
	//update employee work hours
	void setTotalHrs(int x){
		switch (x) {
		case 1 -> {
			if (this.totalHrs <= this.MAX_WORKING_HRS) {
				this.totalHrs += 8;
			}
		}
		case 2 -> {
			if (this.totalHrs <= this.MAX_WORKING_HRS) {
				this.totalHrs += 4;
			}
		}
		default -> { }
		}
	}
	//Calculate employee salary
	int calSalary(){
		return WAGE * this.totalHrs;
	}
	//Random employee choice
	static int empChoice(){
		return (int) Math.floor((Math.random() * 100) % 3);
	}

	//Driver method
	public static void main(String[] args) {
		//Employee 1 object whose wages need to be calculated.
		EmpWageComputation company1 = new EmpWageComputation(25, 110,23);

		//Looping for a month
		while (company1.totalDays != company1.MAX_WORKING_DAYS && company1.totalHrs < company1.MAX_WORKING_HRS) {
			company1.totalDays++;
			//Performing check
			int empCheck = empChoice();
			//Operations
			company1.setTotalHrs(empCheck);
		}

		//Outputs
		System.out.println("Total Working Days are " +company1.totalDays);
		System.out.println("Total Working Hours are " + company1.totalHrs);
		System.out.println("The total salary is " + company1.calSalary());
	}
}