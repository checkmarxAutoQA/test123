import java.sql.*;   // Use 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import ScalaJdbcConnectSelect;
 
// JDK 1.7 and above
public class JdbcSelectTest extends ScalaJdbcConnectSelect {   // Save as "JdbcSelectTest.java"
   public static void main(String[] args) {
      String strSelect = args[0];// "select title, price, qty from books";
	  sql(strSelect);
	  sql1(strSelect);
	  //ScalaJdbcConnectSelect scalaClass=new ScalaJdbcConnectSelect();
	  //scalaClass.sql(strSelect);
	  
   }
   
   public void sql(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
   
    public void sql1(String strSelect) {
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "myuser", "xxxx");
         Statement stmt = conn.createStatement();
         ResultSet rset = stmt.executeQuery(strSelect);
   }
}