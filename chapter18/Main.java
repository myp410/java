import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Class.forName("org.h2.Driver");
    String dburl = "jdbc:h2:~/test";
    String sql = "INSERT INTO EMPROYEE(name) VALUES('aoki')";
    Connection conn = DriverManager.getConnection(dburl);
    conn.close();
  }
}