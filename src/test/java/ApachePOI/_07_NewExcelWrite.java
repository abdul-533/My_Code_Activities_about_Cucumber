package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;

public class _07_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //Hafizada workbook ve sheet olushturcam gerisi ayni ioshlem

        XSSFWorkbook workbook = new XSSFWorkbook(); // hafizadaki hali
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        //hafizada ishlemlere devam

        Row yeniSatir = sheet.createRow(0);
        Cell yeniHucre = yeniSatir.createCell(1);

        yeniHucre.setCellValue("Hello World");

        //Save ishlemlerine bashliyorum pathini verib yazdirma

        String path = "src/test/java/ApachePOI/resource/YeniExcel.xlsx";

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("IShlem Tamamlandi");


    }
}
