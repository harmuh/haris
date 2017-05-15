package movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelMovie {
	public static void deletemovie(String moviename) throws ClassNotFoundException, SQLException {
		Connection con = movie_har.connect();

		
		String sql = "delete from  movies where movie_nam = ? ";
		PreparedStatement pst1 = con.prepareStatement(sql);
		pst1.setString(1, moviename);

		int rows = pst1.executeUpdate();

		System.out.println("no of rows deleted" + rows);

	}

}
