import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test0 {
	@Test
	public void demo() throws SQLException {
		//Step: Register to database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//Step:2 connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustestapi","root","root");
		
		//Step:3 create sql query statement
		Statement statement = con.createStatement();
		String query="select * from ustable";
		
		//Step:4 execute the query
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		}
	
	//Step:5 close the connection
	con.close();
	}

}
