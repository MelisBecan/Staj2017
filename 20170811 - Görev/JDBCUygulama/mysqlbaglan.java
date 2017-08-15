import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import com.mysql.jdbc.SQLError;

public class mysqlbaglan {
	
	Connection con;
	
	public static final String URL = "jdbc:mysql://localhost:3306/intern_dev?verifyServerCertificate=false&useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	public Connection baglan() {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException sqle) {
			sqle.getMessage();
		}
		return con;
	}
}
