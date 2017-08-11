import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class vtlistele {

	public void liste() throws SQLException {
        mysqlbaglan vt = new mysqlbaglan();            
        
		Statement stmt = vt.baglan().createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM persons");

		while (rs.next()) {
			String ad = rs.getString("Name");
			String soyad = rs.getString("Surname");
			String mail = rs.getString("Email");
			System.out.println(ad + "\t" + soyad + "\t" + mail);
		}
	}
}