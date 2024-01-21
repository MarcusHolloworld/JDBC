package com.jdbcPractice.in;
import java.sql.*;
import java.io.*;

public class InsertImg {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","rohit");

			String q = "insert into images (pic) values(?);";

			PreparedStatement pstmt = con.prepareStatement(q);

			FileInputStream fis = new FileInputStream("C:\\Users\\ROHIT\\Desktop\\jdbc\\src\\com\\jdbcPractice\\in\\img.jpg");


			pstmt.setBinaryStream(1,fis,fis.available());
			pstmt.executeUpdate();

			System.out.println("done...");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
