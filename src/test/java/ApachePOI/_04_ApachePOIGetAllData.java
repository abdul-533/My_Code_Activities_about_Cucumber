package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workBook = WorkbookFactory.create(inputStream);
        Sheet sheet = workBook.getSheetAt(0);

        //1. yol
        int rowCount = sheet.getPhysicalNumberOfRows();// zoo daki lenge (zoo.length) karshilik gelir kac satir olduqunun verir


        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells(); //zoo[1].lemgth
            for (int j = 0; j < cellCount; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + "\t");

            }
            System.out.println();
        }

        System.out.println("*****************************************88");

        //2. yol

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { //zoo.length
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { //zoo[i].length
                System.out.print(sheet.getRow(i).getCell(j) + "\t");  //zoo[i][j], get(i).get(j)
            }
            System.out.println();

        }
    }
}
