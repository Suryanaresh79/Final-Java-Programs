package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class EmployeePayroll {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
		String userName = "root";
		String password = "Naresh@1008"; // your password
		Connection connection;

		// Loading Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver couldn't load.");
			throw new IllegalStateException("Cannot find driver", e);
		}

		listDrivers();
		try {
			System.out.println("Connecting to database: " + jdbcURL);
			connection = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection successful: " + connection);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void listDrivers() {

		/**
		 * Retrieving the list of all the Drivers
		 */
		Enumeration<Driver> driverList = DriverManager.getDrivers();

		/**
		 * Printing the list
		 */
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println("   " + driverClass.getClass().getName());
		}
	}

}