package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//package movie;

public class testing {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/prod_movies_db";
		String username ="root";
		String password ="root";
		Connection con=DriverManager.getConnection(url,username,password);
		
	}

}
