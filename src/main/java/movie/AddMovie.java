package movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movie.movie_har;
public class AddMovie {
	public static void insertmovie() throws ClassNotFoundException, SQLException 
		{
			Connection con = movie_har.connect();
			String sql = "insert into movies  (movie_nam,released_date,movie_id)  values ( 'Kabalai','2017-04-23',5)";
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
