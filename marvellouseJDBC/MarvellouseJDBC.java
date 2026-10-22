import java.sql.*;

public class MarvellouseJDBC {

  public static void main(String A[]) {
    try {

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa55", "root", "");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from student");
      while (rs.next()) {

        System.out.println("roll no:" + rs.getInt("rno"));
        System.out.println("name:" + rs.getString("name"));
        System.out.println("city:" + rs.getString("city"));
        System.out.println("marks:" + rs.getInt("marks"));
        System.out.println("===================================");

      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}