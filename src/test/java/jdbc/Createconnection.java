package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Createconnection {

	     public static void main(String[] args) throws SQLException {
			   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");
			  Statement st  = con.createStatement();
			  ResultSet rs =  st.executeQuery("select * from employees");
			  
			  while(rs.next()) {
				  
				System.out.println(rs.getInt(1) + rs.getString(1));
				  
				   }
			  rs.close();
			  
		}
	
	
}
