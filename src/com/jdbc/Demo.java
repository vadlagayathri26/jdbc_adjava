package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {

		final String URL="jdbc:mysql://localhost:3306/mydata101r";
		String user="root";
		String password="1234@";
		
//		String query="insert into student values(104,'ram',30,45)";
		
		
		String query="update student set age=20 where id=104";
		
		
		
		
		try {
			// stage 1:-
	Connection connection=DriverManager.getConnection(URL,user,password);
	// stage2:
	Statement st=connection.createStatement();
	// stage 3-
	int rows=st.executeUpdate(query);
	System.out.println(rows+"inserted...");
		
		//stage5:
	connection.close();
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
