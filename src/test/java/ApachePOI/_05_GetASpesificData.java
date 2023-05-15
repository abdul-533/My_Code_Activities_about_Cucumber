package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpesificData {
    public static void main(String[] args) throws IOException {
        /**
         * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
         * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
         * yani metoda "password" kelimesi gönderilecek, dönen değer password un değeri olacak.
         * bulup ve sonucun döndürülmesi için metod kullanınız.
         * src/test/java/ApachePOI/resources/LoginData.xlsx
         */

//        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
//        FileInputStream inputStream = new FileInputStream(path);
//
//        girileniVer(inputStream);

        Scanner sc = new Scanner(System.in);
        System.out.println("Kelime gir?=");
        String aranan = sc.nextLine();

        String donenSounuc = exceldenBull(aranan);
        System.out.println("donenSounuc = " + donenSounuc);


    }

//    public static String girileniVer(FileInputStream inputStream) throws IOException {
//
//        Workbook workBook = WorkbookFactory.create(inputStream);
//        Scanner scan = new Scanner(System.in);
//        Sheet sheet = workBook.getSheetAt(0);
//        System.out.println("Veri giriniz=");
//        String veri = scan.nextLine();
//
//        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
//                if (sheet.getRow(i).getCell(j).equals(veri.toLowerCase()))
//                    return sheet.getRow(i).getCell(j).toString();
//            }
//
//        }
//
//        return null;
//    }

    public static String exceldenBull(String aranan) {

        String donecek = "";

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workBook = WorkbookFactory.create(inputStream);
            sheet = workBook.getSheetAt(0);

        }
        catch (Exception e) {
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    donecek += sheet.getRow(i).getCell(j) + " ";

                }

            }


        }

        return donecek;
    }
}
