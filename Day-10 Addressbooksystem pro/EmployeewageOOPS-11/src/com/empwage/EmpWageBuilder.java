package com.empwage;

import java.util.ArrayList;
public class EmpWageBuilder {

interface collection{
	void showInfo(Company company);
	void addCompany(Company company);
}
public class EmpWageBuilder implements collection  {

 static ArrayList<Company> companyList=new ArrayList<Company>();

		@Override
		public void showInfo(Company company) {
			// TODO Auto-generated method stub
			 System.out.println("Company name: "+company.name);
			 System.out.println("Total Wage :"+company.monthlyWage);
		}

		@Override
		public void addCompany(Company company) {
			// TODO Auto-generated method stub
			 companyList.add(company);
}
 void showInfo(Company company) {
	 System.out.println("Company name: "+company.name);
	 System.out.println("Total Wage :"+company.monthlyWage);
 }

 void addCompany(Company company) {
	 companyList.add(company);
 }
}