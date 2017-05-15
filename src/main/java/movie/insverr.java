package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insverr {

	public static void mvex() throws Exception { 
Connection con = movie_har.connect();
		
		try {
						con = movie_har.connect();
						String sql = "insert into movies  (movie_name,released_date,movie_id)  values ( 'Kali','2007-04-23',6)";
						PreparedStatement pst = con.prepareStatement(sql);
						int rows = pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new Exception("not able to connect database");
		} catch (SQLException e) {
			throw new Exception("Unable to add movie ");
		} finally {
			if (con != null)
				con.close();

		}
	}
}

