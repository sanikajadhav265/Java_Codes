package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class jdbcEx {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			String query = "insert into Student values(1,'Sanika'),(2,'Pooja'),(3,'Saloni')";
			java.sql.Statement smt = connection.createStatement();
			smt.execute(query);

			connection.close();
			System.out.println("Data Added Successfully !!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
