package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class moviedb {

	public static void movDb() throws Exception {
		Connection con = movie_har.connect();
		
		try {
			Class.forName("");
			con = DriverManager.getConnection("");
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
