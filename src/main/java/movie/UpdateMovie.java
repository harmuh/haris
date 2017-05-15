package movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateMovie {
	public static void Finalmovie() throws SQLException , ClassNotFoundException
	{

		Connection con = movie_har.connect();
		String sql = "update movies set movie_nam = 'Theri' where movie_id = 2 ";
		PreparedStatement pst = con.prepareStatement(sql);
		int rows = pst.executeUpdate();
		System.out.println("no of rows updated" + rows);

		String sql1 = "select movie_id,movie_nam from movies ";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		ResultSet rs = pst1.executeQuery();
		while (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String moviename = rs.getString("movie_nam");
			System.out.println("MovieId= " + movieId + " MovieName  " + moviename);
		}
	}
	
	}
	


