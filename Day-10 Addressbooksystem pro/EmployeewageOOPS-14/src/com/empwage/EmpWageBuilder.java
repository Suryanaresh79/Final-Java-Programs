package com.empwage;

import java.util.ArrayList;
interface collection{
	void showInfo(EmployeeWage company);
	void addCompany(EmployeeWage company);
}
public class EmpWageBuilder implements collection  {

	static ArrayList<EmployeeWage> companyList=new ArrayList<EmployeeWage>();
	@Override
	public void showInfo(EmployeeWage company) {
		// TODO Auto-generated method stub
		System.out.println("Company name: "+company.name);
		System.out.println("Total Wage :"+company.monthlyWage);
	}

	@Override
	public void addCompany(EmployeeWage company) {
		// TODO Auto-generated method stub
		for(EmployeeWage element:companyList) {
			if(element.name.equals(company.name)){
				companyList.remove(element);
				break;
			}
		}
		companyList.add(company);

	}
	void showMonthlyWage(String name) {
		int condition=0;
		for(EmployeeWage elements:companyList) {
			if(elements.name.equals(name)) {
				System.out.println("The total monthly wage of the company is Rs."+elements.monthlyWage);
				for(EmployeeWage element:companyList) {
					if(element.name.equals(name)) {
						System.out.println("The total monthly wage of the company is Rs."+element.monthlyWage);
						condition=1;
						break;
					}

				}
				if(condition==0) {
					System.out.println("Company is not listed in the database");
				}
			}	 
		}
	}
}