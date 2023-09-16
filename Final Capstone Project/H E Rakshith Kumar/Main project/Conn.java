
package proj;
import java.sql.*;
public class Conn {
Connection c;
Statement s;
public Conn () {

try {

c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "rakshi");
s=c.createStatement ();

} catch (SQLException e) {
e.printStackTrace();
}
}
}