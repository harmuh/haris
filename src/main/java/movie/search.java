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
	public class search {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			MovieModel m = null;
			//searchByMovieName("appa");		
		}

		

		public static ArrayList<MovieModel> searchByMovieName(String InputMovieName) throws ClassNotFoundException, SQLException {
			
			ArrayList<MovieModel> movienamelist = new ArrayList<MovieModel>();
			Connection con = movie_har.connect();
			String sql1 = "select movie_id,movie_nam,released_date from movies where movie_nam = ?";
			PreparedStatement pst1 = con.prepareStatement(sql1);
			pst1.setString(1, InputMovieName);
			ResultSet rs = pst1.executeQuery();
			if  (rs.next()) {
				int movieId = rs.getInt(1);
				String moviename = rs.getString("movie_nam");
				Date dt = rs.getDate("released_date");
				MovieModel m = new MovieModel();
				m.movie_id = movieId;
				m.moviename = moviename;
				m.releaseDate = dt.toLocalDate();

				movienamelist.add(m);
				System.out.println("MovieId= " + movieId + " MovieName  " + moviename + " Local Date " + dt);
			}

			return  movienamelist;
		}

	}


