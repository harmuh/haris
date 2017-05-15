package movie;

//ackage movie;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
public class arra {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<MovieModel> list = findAllMovies();
		for (MovieModel m : list) {
			System.out.println(m.movie_id + " " + m.moviename + " " +m.releaseDate);

		}

	}

	private static ArrayList<MovieModel> findAllMovies() throws ClassNotFoundException, SQLException {
		Connection con = movie_har.connect();
		ArrayList<MovieModel> movienamelist = new ArrayList<MovieModel>();
		String sql1 = "select movie_id,movie_nam,released_date from movies ";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		ResultSet rs = pst1.executeQuery();
		while (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String moviename = rs.getString("movie_nam");
			Date dt = rs.getDate("released_date");
			MovieModel m = new MovieModel();

			m.movie_id = movieId;
			m.moviename = moviename;
			m.releaseDate = dt.toLocalDate();

			movienamelist.add(m);
			System.out.println("MovieId= " + movieId + " MovieName  " + moviename + " Local Date " + dt);
		}

		return movienamelist;
	}

}
