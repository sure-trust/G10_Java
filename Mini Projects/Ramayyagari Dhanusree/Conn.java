package Sourcecode;
import java.sql.*;
	public class Conn {
		Connection c;
		Statement s;
		public Conn () {

		try {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		s=c.createStatement ();

		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}
