package _JDBC.Gun1;

import _JDBC.GDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Question extends GDBCParent {
// city tablosundaki tüm kayıtlardaki isimleri next ile yazdırınız

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city from city");

        int rowCount = 0;
        while (rs.next()) {               //city
            System.out.println(rs.getString(1));
            rowCount++;
        }
        System.out.println("Row Count = " + rowCount);

    }
}
// TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
// TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
