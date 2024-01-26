package com.jdbcPractice.in;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
	public static void main(String[] args) {
		try {

			Connection con = ConnectionProvider.getConnection();

			String q = "Select * from table1";

			Statement statement = con.createStatement();

			ResultSet set = statement.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);

				System.out.println(id + "   --   " + name + "   --   " + city);
			}





		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
