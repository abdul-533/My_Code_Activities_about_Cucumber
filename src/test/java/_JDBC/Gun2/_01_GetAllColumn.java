package _JDBC.Gun2;

import Utilities.GWD;
import _JDBC.GDBCParent;
import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _01_GetAllColumn extends GDBCParent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select*from language"); //data+metaData
        ResultSetMetaData rsmd = rs.getMetaData();  //sadece meta data   //kolon sayisi , isimleri tipleri.
        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            System.out.print("Column name=" + rsmd.getColumnName(i));
            System.out.println("\tColumn type=" + rsmd.getColumnType(i));
        }


    }

    @Test
    public void test2() throws SQLException {
        //language tablosundaki tim satirlari ve tum sutunlari yazdiriniz,
        //aynu MYSQ-lede gibi yazdirin ekraninda olan tablo gibi
        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");

        }
        System.out.println();
        while (rs.next()) {

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }


    }

    @Test
    public void test3() throws SQLException {
        // bir metoda sorguyu("select * from language") gönderiniz,
        // metod size sorgunun datasını bir ArrayList olarak döndürsün

        String sql = "select*from city";

        ArrayList<ArrayList<String>> donenSonuc = getListData(sql);
        System.out.println("Donen Sonuc = " + donenSonuc);
    }

    public ArrayList<ArrayList<String>> getListData(String sql) {

        ArrayList<ArrayList<String>> tablo = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();

            while (rs.next()) {
                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <=rsmd.getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);


            }
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());

        }

        return tablo;
    }
}
