package com.jdbcPractice.in;
import java.sql.*;
import java.io.*;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			String userName = "root";
			String password = "rohit";

			Connection con = DriverManager.getConnection(url,userName,password);

			String q = "insert into table1 (tName,tCity) values (?,?);";
			PreparedStatement pstmt = con.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter name: ");
			String name = br.readLine();

			System.out.print("Enter City: ");
			String city = br.readLine();

			pstmt.setString(1,name);
			pstmt.setString(2,city);

			pstmt.executeUpdate();
			System.out.println("Inserted....");
			con.close();


		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
