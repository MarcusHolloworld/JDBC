package com.jdbcPractice.in;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {
	public static void main(String[] args) {
		try {

			Connection con = ConnectionProvider.getConnection();

			String q = "update table1 set tName = ? , tCity = ? where tID = ?";

			PreparedStatement pstmt = con.prepareStatement(q);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter new name: ");
			String name = br.readLine();

			System.out.print("Enter new city: ");
			String city = br.readLine();

			System.out.print("Enter ID: ");
			int id = Integer.parseInt(br.readLine());

			pstmt.setString(1,name);

			pstmt.setString(2,city);

			pstmt.setInt(3,id);

			pstmt.executeUpdate();

			System.out.println("Done.....");
			con.close();




		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
