package bank.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	//System.out.println("hello from maven");
		Connection connection=null;
	try {
		//load the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("driver load successfully");
		//Step-2 open connection(url,username,password)
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password ="Sophie1998";
		connection=DriverManager.getConnection(url, username, password);
		System.out.println("Connection success");
		//Step-3
		Statement statement=connection.createStatement();
		String sql="select * from bank.customer";
		//Step-4
		ResultSet resultSet=statement.executeQuery(sql);
		System.out.println("Query executed");
		//Step-5
		while(resultSet.next()) {
			System.out.print("Id:"+ resultSet.getInt("customerid"));
			System.out.println(" "+"Ssn:"+ resultSet.getString("customerssn"));
			System.out.println(" "+"Address:"+ resultSet.getString("customeraddress"));
			System.out.println(" "+"Gender:"+ resultSet.getString("customergender"));
			System.out.println(" "+"Transaction:"+ resultSet.getDouble("customertransaction"));
			System.out.println(" "+"First:"+ resultSet.getString("customerfirst"));
			System.out.println(" "+"Last:"+ resultSet.getString("customerlast"));
			System.out.println(" "+"Employee:"+ resultSet.getInt("employeeid"));
		}
	} catch (ClassNotFoundException e) {
		
		System.out.println(e);
	} catch (SQLException e) {
		System.out.println(e);
	}finally {
		try {
			//Step-6
			connection.close();
			System.out.println("Connection Close");
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}

	}

}
