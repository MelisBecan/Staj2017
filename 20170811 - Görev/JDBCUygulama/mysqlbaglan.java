import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlbaglan {
    public static final String URL = "jdbc:mysql://localhost:3306/intern_dev";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
    
    
    public void baglan() throws SQLException {
        Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
        
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
     
        while (rs.next()) {
            String s = rs.getString("Name");
            System.out.println(s);
        }
    }
}


