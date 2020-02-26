package com.stud.dbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	//declare the connection variable
	static Connection connection=null;
	
	public static Connection getconnection()throws Exception
	{   //try catch block
		try
		{    //loading the connection
			Properties prop=loadPropertiesFile();
			//storing properties to variables 
			String driverClass=prop.getProperty("ORACLEJDBC.JDBC_DRIVER");
			String url=prop.getProperty("ORACLEJDBC.DB_URL");
			String username=prop.getProperty("ORACLEJDBC.USER");
			String password=prop.getProperty("ORACLEJDBC.PASS");
			//pass driverclass to all classes
			Class.forName(driverClass);
			return DriverManager.getConnection(url,username,password);
			
		}catch(SQLException e)
		{
			throw new RuntimeException("Error in connection"+e);
		}
		
	}
	
	 private static Properties loadPropertiesFile()throws Exception{
		//creating object for properties
			Properties prop=new Properties();
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
			return prop;
		
	}

	public static void main(String[] args) throws Exception {
		connection=ConnectionFactory.getconnection();
		System.out.println("connected to database");
		

	}
}
