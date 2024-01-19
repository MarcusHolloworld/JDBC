package com.jdbcPractice.in;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    try{
	    	Class.forName("com.mysql.cj.jdbc.Driver");

	    	String url = "jdbc:mysql://localhost:3306/jdbc";
	    	String username = "root";
	    	String password = "rohit";

	    	Connection con = DriverManager.getConnection(url,username,password);

	    	if(con.isClosed()) {
			    System.out.println("Connection is closed....");
		    } else {
			    System.out.println("Database connected....");
		    }
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    }
    }
}
