package movie;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class listMovie {
	public static void list() throws SQLException , ClassNotFoundException{
		Connection con = movie_har.connect();
		String sql2 = "select movie_id , movie_nam , released_date  from movies ";
		PreparedStatement pst2 = con.prepareStatement(sql2);
		ResultSet rs2 = pst2.executeQuery();
		while(rs2.next())
		{
			int mov_id = rs2.getInt("movie_id");
			String movi_nam = rs2.getString("movie_nam");
			Date dt = rs2.getDate("released_date");
			System.out.println("movieName  " + movi_nam + " movieId " + mov_id + " Release date " + dt);
			
		}
		
		
	}

}
