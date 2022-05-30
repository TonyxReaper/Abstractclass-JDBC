package AbstractClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class AbstractClass 
{
	public abstract Connection getConnection();
	
	public void select(String str) throws Exception
	{
		Connection c = getConnection();
		Statement stmt = c.createStatement();
		
		stmt.execute(str);
		
	}
	
}
