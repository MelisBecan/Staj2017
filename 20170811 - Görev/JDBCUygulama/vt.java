import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class vt {

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

	public void ekle(String ad, String soyad, int gender, String mail) throws SQLException {
		mysqlbaglan vt = new mysqlbaglan();

		Statement stmt = vt.baglan().createStatement();
		int rs = stmt.executeUpdate("INSERT INTO persons VALUES(NULL,'" + ad + "','" + soyad + "'," + gender + ",'" + mail + "')");
		
		System.out.println("Eklendi.");
	}
	
	public void sil(int silinecekkayit) throws SQLException {
		mysqlbaglan vt = new mysqlbaglan();

		Statement stmt = vt.baglan().createStatement();
		stmt.executeUpdate("DELETE FROM persons WHERE Id='" + silinecekkayit + "'");

		System.out.println("Silindi.");
	}
	
	public void guncelle(String guncellenecekkayit, String sart) throws SQLException {
		mysqlbaglan vt = new mysqlbaglan();

		Statement stmt = vt.baglan().createStatement();
		stmt.executeUpdate("UPDATE persons SET name='"+ guncellenecekkayit +"' WHERE name='" + sart + "'");

		System.out.println("Güncellendi.");
	}

}
