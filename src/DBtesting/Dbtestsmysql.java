/**
 * 
 */
package DBtesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author umutx
 *
 */
public class Dbtestsmysql {
	
	// build DB connection
	static Connection conn = null;
	
	// statement obj
	private static Statement stmt; 
	// result set
	private static ResultSet results = null;
	
	
	// Result Set
	public static String DB_URL = "jdbc:mysql://localhost:3306/users"; 
	// Oracle DB: jdbc:oracle:thin:localhost:1521/sid
	
	// DB username 
	public static String DB_user = "root";
	
	// DB User password 
	public static String DB_password = "root";
	
	// Driver 
	public static String driver = "com.mysql.jdbc.driver"; // "oracle.jdbc.driver.OracleDriver"
	
	
	
	@BeforeClass
	public void beforeClass() {
		
	Properties props = new Properties(); 
	props.setProperty("user", "root");
	props.setProperty("password", "root");
	
	try 
	{
		// Step1:Register JDBC driver
		Class.forName(driver).newInstance();
		
		// Step2: Get connection to DB
		System.out.println("Connecting to Selected DataBase........");
		
		conn = DriverManager.getConnection(DB_URL, DB_user, DB_password);
		
		// optional connect 
		//conn = DriverManager.getConnection(DB_URL, props);
		
		System.out.println("Connceted DataBase successfully.......");
		
		
		// Step3: Statement object to send the SQL statement to the database
		System.out.println("Creating statement........");
		stmt = conn.createStatement(); 
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
		
		
	}
	
	
	
	@Test
	public void test() throws SQLException
	{
		
		String query = "select * from user_info";
		
		try
		
		{
			// Step4:Extract data from results set
			results = stmt.executeQuery(query);
			while (results.next()) {
				int id = results.getInt("user_id");
				String last = results.getString("last_name");
				String first = results.getString("first_name");
				String city = results.getString("city");
				
				
				// display all the data
				System.out.println("ID" + id);
				System.out.println("last name" + last);
				System.out.println("first name" + first);
				System.out.println("city" + city);
				
				
				
			}
			
		
		
		
			// after test we are closing the results 
		   results.close();
		} catch(SQLException se) {
			// Handle erroes for JDBC
			se.printStackTrace();
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	@AfterClass
	public void afterClass() {
		
		try {
			
			if(results != null)
				results.close();
			if(stmt != null)
				stmt.close();
			if(conn !=null)
				conn.close();
			
			
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		
		
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
