import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
            mysqlbaglan demo = new mysqlbaglan();
            System.out.println(demo); 
            
            demo.baglan();
	}
}