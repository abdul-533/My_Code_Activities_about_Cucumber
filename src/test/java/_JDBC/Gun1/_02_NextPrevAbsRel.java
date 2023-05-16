package _JDBC.Gun1;

import _JDBC.GDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends GDBCParent {

    @Test
    public void textNextPrev() throws SQLException {
        ResultSet rs = statement.executeQuery("select*from language");
        rs.next(); // ilk satir 1 ci ni aldi

        System.out.println("1. satir dilAdi=" + rs.getString(2)); // burdaki 2 column sirasi yani name:
        //rs.getString("name"); //English
        rs.next(); // 2. satir
        System.out.println("2. satir dilAdi=" + rs.getString(2)); //Italian

        rs.next(); // 3. satir
        System.out.println("3. satir dilAdi=" + rs.getString(2)); //Japanese

        rs.previous(); // 2 ciye tekrara donduk bir geri gitdik
        System.out.println("1 geri satir dil adi=" + rs.getString(2)); //Italyan
    }

    @Test
    public void AbsoluteRelative() throws SQLException {
        ResultSet rs = statement.executeQuery("select *from film");
        //rs.next(); sonraki satir
        // rs.previous(); onceki satir
        // rs.absolute(10); bashdan itibaren 10 cu satira gider
        //rs.relative(10); bulunduqu yerden 10 cu satira gider


        rs.absolute(10); // 10.cu satira git
        System.out.println("10-cu satir title=" + rs.getString("title"));

        rs.relative(5); // boyle dersem 15 ci satra gider cunki en son bulunduqu yerden 5 satir gitdi enm son 10 da idi

        System.out.println("15. satir -title=" + rs.getString(2));

        // eksi rakam da kullanila bilir

        rs.absolute(-10); // - kelimesi sondan demek sondan 10 cuya gider
        System.out.println("sondan 10 cu yu ver- title= = " + rs.getString(2));

    }

}
