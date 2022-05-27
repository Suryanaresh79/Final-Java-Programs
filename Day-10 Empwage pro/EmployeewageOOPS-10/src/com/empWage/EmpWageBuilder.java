package com.empWage;
import java.util.ArrayList;
public class EmpWageBuilder {
 String name;
 int monthlyWage;

 void totalWage(String name,int monthlyWage) {
	 this.name=name;
	 this.monthlyWage=monthlyWage;
 }
 static ArrayList<CompanyEmpWage> companyList=new ArrayList<CompanyEmpWage>();

 void showInfo(CompanyEmpWage company) {
	 System.out.println("Company name: "+company.name);
	 System.out.println("Total Wage :"+company.monthlyWage);
 }
 void showInfo() {
	 System.out.println("Company name: "+name);
	 System.out.println("Total Wage :"+monthlyWage);
 }
 void addCompany(CompanyEmpWage company) {
	 companyList.add(company);
 }
}