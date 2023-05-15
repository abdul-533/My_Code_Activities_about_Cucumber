package ApachePOI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {

        //once exceli acarim, sheete ulahirim
        //ishlemleirimi eklerim (hafizada)
        //yazma modunda acib, hfiadaki ishlemleri kayd ederim

        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workBook = WorkbookFactory.create(inputStream);
        Sheet sheet = workBook.getSheetAt(0);

        //Hafizada ishlemlere devam ediyorum
        Row yeniSatir = sheet.createRow(sheet.getPhysicalNumberOfRows());  // 0 yerine bu yazilacak sheet.getPhysicalNumberOfRows()
        Cell yeniHucre = yeniSatir.createCell(0);
        yeniHucre.setCellValue("Hello Excell");

        //sira kayd etmeye geldi amm once okuma modundan cikib yazma moduna geciyoruz
        //Yazma Modu
        inputStream.close(); // okuma modu kapatildi

        FileOutputStream outputStream = new FileOutputStream(path);
        workBook.write(outputStream); // SAVE ishlemi yapildi
        workBook.close(); // hafizayi boshlatmak iscin yapilan ishlemler
        outputStream.close(); //hafizayi boshalt genelde otomotik boshaltar

        System.out.println("Yazma ishlemi yapildi");
    }
}
