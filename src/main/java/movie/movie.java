package m;
package movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.lang.*;

//package movie;

public class movie  {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		finalmovies();
		insertmovies();
		deletemovies();

	}

	/*public static Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		return (con);
	}*/
	public static void finalmovies() throws ClassNotFoundException, SQLException {

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

	public static void insertmovies() throws ClassNotFoundException, SQLException {
		Connection con = movie_har.connect();
		String sql = "insert into movies  (movie_nam,released_date,movie_id)  values ( 'Puli','2017-05-23',4)";
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
	public static void deletemovies() throws ClassNotFoundException, SQLException {

		Connection con = movie_har.connect();
		
		
			String moviename  = "Theri";
			String sql = "delete from  movies where movie_nam = ? ";
		PreparedStatement pst1 = con.prepareStatement(sql);
		pst1.setString(1, moviename);
		
		int rows = pst1.executeUpdate();
		
	
		System.out.println("no of rows deleted" + rows);
		
				
		}
	}


}
