import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) throws SQLException {
		mysqlbaglan vt = new mysqlbaglan();
		vt.baglan();
		vt islem = new vt();
		vt ekle = new vt();

//		islem.liste();
//		islem.ekle("Ugur", "Ucar", 2, "ugur@ugur.com");
		System.out.println("---------");
		islem.liste();
//		System.out.println("---------");
//		islem.sil(5);
//		System.out.println("---------");
//		islem.liste();
//		System.out.println("---------");
//		islem.guncelle("Samet2","Samet");
		System.out.println("---------");
		islem.liste();
	}
}