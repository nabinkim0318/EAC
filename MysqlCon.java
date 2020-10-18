package database;

import java.sql.*;

public class MysqlCon {
	public static void main(String[] args) {
		try {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
	Statement stmt = con.createStatement();
	
	String queryStr = "";
	String deleteStr = "";
	ResultSet rs = stmt.executeQuery(queryStr);
	int delnum = stmt.executeUpdate(deleteStr);
		}
	}
}