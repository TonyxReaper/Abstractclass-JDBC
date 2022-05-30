package AbstractClass;

import java.sql.Connection;
import java.sql.DriverManager;

public  class GetConnection implements AbstractClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AbstractClass.select("hi");

	}
	,
	public  Connection getConnection() 
	{
		Class.forName("org.postgresql.Driver"); // load driver 
		 Connection c = DriverManager
	       		 .getConnection("jdbc:postgresql://localhost:5432/postgres",  // connect database 
	       				        "postgres", "admin"); 
		
		return c;
	}

}
