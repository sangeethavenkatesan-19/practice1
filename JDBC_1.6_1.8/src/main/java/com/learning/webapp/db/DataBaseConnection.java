package com.learning.webapp.db;
import java.sql.*;
public class DataBaseConnection {

	// data source properties
	private final String DB_URL = "jdbc:mysql://localhost:3306/estore_zone_db";
	private final String DB_USR = "newdevuser";
	private final String DB_PAS = "DevUser!74";

	Connection connection = null;
	Statement statement = null;
	ResultSet rst = null;
	
	public void initConnection(){
		try {
			// step1 : Register Driver (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Register Driver Class");

			// step2 : Create a connection
			Connection connection = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
            System.out.println("Connection is created");
            
			//step 3 : Create Statement
			Statement statement = connection.createStatement();
			System.out.println("Statement is created");
			
			//step 4 : Execute query
			String query = "select * from eproduct;";
			ResultSet rst = statement.executeQuery(query);
			System.out.println("Query is executed");
			
			//step 5 : close connection
			rst.close();
			statement.close();
			connection.close();
			System.out.println("Closing the connection");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception Occured ::: " + e.getClass());
		} catch (SQLException e) {
			System.out.println("Exception Occured ::: " + e.getClass());
			// e.printStackTrace();
		}
	}	
	}