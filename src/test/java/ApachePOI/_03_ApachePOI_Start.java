package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOI_Start {
    public static void main(String[] args) throws IOException {

        //dosyanin yolunu deyishkene atin
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // java okuma ishlemgisine doya yolunu verdik
        //boylece dosya ile program arasinda baqlanti kurduk
        FileInputStream dosyaokumaBaqlantisi = new FileInputStream(path);

        //calishma kitabini aliyorum
        Workbook calishmaKitabi = WorkbookFactory.create(dosyaokumaBaqlantisi);

        //istediyim isimdeki calishma sayfasina ulashdim
        Sheet calishmaSayfasi = calishmaKitabi.getSheet("Sheet1"); //getSheetAt(0);

        //istediyim satiri aldim
        Row satir = calishmaSayfasi.getRow(0);

        Cell hucre = satir.getCell(0);

        System.out.println("hucre = " + hucre);

    }
}
