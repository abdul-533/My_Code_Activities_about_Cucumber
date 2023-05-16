package _JDBC.Gun1;

import _JDBC.GDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowType extends GDBCParent {


    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city from city");

        rs.last(); // son satira gider
        System.out.println("Son Satir= = " + rs.getString(1));

        rs.first(); // ilk satira guder direk
        System.out.println("Ilk satir = " + rs.getString(1));

        rs.last();
        int kacinciSatirdayim = rs.getRow(); // kacinci satirda olduqumu bana vericek
        System.out.println("kacinci Satirdayim = " + kacinciSatirdayim);
        
    }
}
