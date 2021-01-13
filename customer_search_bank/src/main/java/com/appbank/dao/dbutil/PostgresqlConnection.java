package com.appbank.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {
	private static Connection connection;
	private PostgresqlConnection() {
		
	}
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("org.postgresql.Driver");
	System.out.println("driver load successfully");
	//Step-2 open connection(url,username,password)
	String url="jdbc:postgresql://localhost:5432/postgres";
	String username="postgres";
	String password ="Sophie1998";
	connection=DriverManager.getConnection(url, username, password);
	return connection;
	
}
}
