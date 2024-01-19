package com.jdbcPractice.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			String userName = "root";
			String password = "rohit";

			Connection con = DriverManager.getConnection(url,userName,password);

			String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null,tCity varchar(400));";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);

			System.out.println("Table created..");

			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
