package com.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.*;
import com.microsoft.sqlserver.jdbc.*;

public class ConnectTest {


	public static String connStr = "jdbc:sqlserver://lwn0o0exea.database.windows.net:1433;database=TestManagerDB;user=axkhan2@lwn0o0exea;password=@ndheri788;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
	public static void main(String[] args) throws SQLException  {
		Connection con = null;
		Statement stmt = null;
		ResultSet rst = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection(connStr);
		String query = "select * from dbo.TM_TestUsers";
		stmt = con.createStatement();
		rst = stmt.executeQuery(query);
		while(rst.next()){
			System.out.println(rst.getString("Username"));
			System.out.println(rst.getString("Password"));
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
