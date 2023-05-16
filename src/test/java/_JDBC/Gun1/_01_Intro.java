package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    /*
    1- bağlantı bilgilerini girdik ve bağlandık
    2- sorguların çalıştırılacağı ortamı açtık
    3- sorguyu 2 nolu ortam üzerinde çalıştırdık
    4- sonuçları gördük
    Yapilma ashamasi
     String hostUrl="db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com";
            String username="root";
            String password="'\"-LhCB'.%k[4S]z";
    jdbc:mysql:// bu kisim hosturl bashina eklenir
    ve hostUrl sonunada portunu yaziyoruz:
    son hangisi ile calishirsak o ismi veriyotuz

    String hostUrl="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
     */
    @Test
    public void test1() throws SQLException {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        //connection aciliyor , fileImputStream e benzer
        Connection connection = DriverManager.getConnection(hostUrl, username, password); //baqlantiya click edildi ve icerisi acildi 1-ci madde

        //sql lerinn yazilacaqi ortam
        Statement statement = connection.createStatement();// sorqulari calishtirmak icin sorqu ortami
        // sorquyu yazdim ve calishtirdim
        ResultSet rs = statement.executeQuery("select*from customer"); //sorqu calishti sonuclari nerede onlari alicaz sonucu alib biur seye esitliycez sonuclar su an 'rs'de

        // ilk satirimi istiyorsun , son satirimi istiyorsun 5 ci N-ci satirimi istiyorsun?
        rs.next(); // siradakina gelir 1 ciye gelir ilk

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1- ci satirin musteri adi ve soyadi= " + firstName + ", " + lastName);

        rs.next();
        // 2 -ci satira gitdi

        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        System.out.println("2- ci satirin musteri adi ve soyadi= " + firstName + ", " + lastName);
        connection.close();
    }
}
