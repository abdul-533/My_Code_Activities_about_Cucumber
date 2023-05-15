package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Kullanıcıdan istediği kolon sayısını aldıktan sonra
 * aşağıdaki excelin 2.Sheet inden istediği kadar kolon miktarını alarak
 * bir fonksyonda ArrayListe çevirerek mainden yazdırınız
 * src/test/java/ApachePOI/resources/ApacheExcel2.xlsx
 */


public class _09_Task {
    public static void main(String[] args) {
        System.out.println("IStediyiniz sayi giriniz=");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName = "testCitizen";

        ArrayList<ArrayList<String>> donenSonuc = getData(path, sheetName, count);  // String[][]
        //  System.out.println("donenSonuc = " + donenSonuc);

        for (int i = 0; i < donenSonuc.size(); i++) {
            for (int j = 0; j < donenSonuc.get(i).size(); j++) {
                System.out.print(donenSonuc.get(i).get(j) + "   ");

            }
            System.out.println();
        }
    }


    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int colCnt) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();


        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);       //getSheetAt(1); //getSheet(testCitizen);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage()); // hatayi okuma kismi
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satir = new ArrayList<>();
            for (int j = 0; j < colCnt; j++) {
                satir.add(sheet.getRow(i).getCell(j).toString());
            }

            tablo.add(satir);
        }

        return tablo;
    }

//MY esquel
    //Microsoft  DB : SQL Server
    //Oracle     DB : Oracle
    //opensource DB : MySql
    //Mongo
    //DB2
    //Google DB
    //Amazon DB
    //
    //iddası : hızlı, güvenilir ve az yer kaplar.
    //
    //DB lerin ortak : SQL
    //
    //DB ye sorgu yapıyor, çıkan sonucu ekrana gönderiyor :
    //
    //
    //Bilgilerden analiz yapanlar : Data Scientist : Bilgi Analizci
    //
    //DB yle uğraşan : DB Admin :
    //
    //DevSecOps     : Development Securty Operations
    //InfraStructue : donanım altyapısını
    //
    //
    //Bankalar : DB lerini
    //
    //
    //
    //
    //DB  : bilgilerin tutulduğu program
    //SQL : DB dili
    //
    //
    //DB lerle uzaktan konuşmaya imkan veren programla vardır.
    //bağlantı noktan: ip, adresin, DB nin olduğu makinanın adresi
    //username
    //password
    //
    //DataBase Management Sistem : DBMS
    //Sql Server Management
    //Oracle Management
    //MySql Management : MySql WorkBench
    //
    //
    //---------Tester ın DB ye nedne ihtiyacı var
    //Loginden username password yazdın, doğru fakat login olamıyorsun
    //country ekrandan kaydettin, gözükmüyor.
    //gözükmemesinin sebebi ne:
//db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com
//Password: '"-LhCB'.%k[4S]z


}
