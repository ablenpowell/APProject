package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
    private static Connection con = null;
	
	
	public Connection getConnection() 
	{
		if(con == null) 
		{
			String url =  "jdbc:mysql://localhost:3306/grizzlydb";
			
			try 
			{
				con = DriverManager.getConnection(url, "root", "");
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		return con;
		
	}

}
