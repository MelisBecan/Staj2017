import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class vtekle {

	public void ekle(String ad, String soyad, int gender, String mail) throws SQLException {
        mysqlbaglan vt = new mysqlbaglan();            
        
		Statement stmt = vt.baglan().createStatement();
		ResultSet rs = stmt.executeQuery("INSERT INTO persons VALUE(NULL,ad,soyad,gender,mail)");

		System.out.println("Eklendi.");
	}
}