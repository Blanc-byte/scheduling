import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exp {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp info");
        int  three=3,four=4,five=5,six = 6,seven=7;
        
        for(int a=0;a<5;a++){
            int     b4=three,b6=five,c4=three,i4=three,c5=four,e6=five,f5=four,i6=five,j4=three,q4=three,j5=four,k6=five,l5=four,m6=five,
                    n5=four,o6=five,p5=four,q6=five,b7=six,c8=seven,d7=six,g8=seven,h7=six,j7=six,k7=six,k8=seven,l7=six,l8=seven,m7=six,m8=seven,
                    n7=six,n8=seven,o7=six,o8=seven,p7=six,p8=seven,q7=six,q8=seven;
            sheet.addMergedRegion(new CellRangeAddress(b4, b6, 1, 1)); // B4 to B6
            sheet.addMergedRegion(new CellRangeAddress(c4, i4, 2, 8)); // C4 to I4
            sheet.addMergedRegion(new CellRangeAddress(c5, e6, 2, 4)); // C5 to E6
            sheet.addMergedRegion(new CellRangeAddress(f5, i6, 5, 8)); // F5 to I6
            sheet.addMergedRegion(new CellRangeAddress(j4, q4, 9, 16)); // J4 to Q4
            sheet.addMergedRegion(new CellRangeAddress(j5, k6, 9, 10)); // J5 to K6/
            sheet.addMergedRegion(new CellRangeAddress(l5, m6, 11, 12)); // L5 to M6/
            sheet.addMergedRegion(new CellRangeAddress(n5, o6, 13, 14)); // N5 to O6/
            sheet.addMergedRegion(new CellRangeAddress(p5, q6, 15, 16)); // P5 to Q6/
            sheet.addMergedRegion(new CellRangeAddress(b7, c8, 1, 2)); // B7 to C8/
            sheet.addMergedRegion(new CellRangeAddress(d7, g8, 3, 6)); // D7 to G8/
            sheet.addMergedRegion(new CellRangeAddress(h7, j7, 7, 9)); // H7 to J7/
            sheet.addMergedRegion(new CellRangeAddress(k7, k8, 10, 10)); // K7 to K8/
            sheet.addMergedRegion(new CellRangeAddress(l7, l8, 11, 11)); // L7 to L8
            sheet.addMergedRegion(new CellRangeAddress(m7, m8, 12, 12)); // M7 to M8
            sheet.addMergedRegion(new CellRangeAddress(n7, n8, 13, 13)); // N7 to N8
            sheet.addMergedRegion(new CellRangeAddress(o7, o8, 14, 14)); // O7 to O8
            sheet.addMergedRegion(new CellRangeAddress(p7, p8, 15, 15)); // P7 to P8
            sheet.addMergedRegion(new CellRangeAddress(q7, q8, 16, 16)); // Q7 to Q8


            setCellValue(sheet, b4, 1, "Merged B4 to B6");
            setCellValue(sheet, c4, 2, "Merged C4 to I4");
            setCellValue(sheet, c5, 2, "Merged C5 to E6");
            setCellValue(sheet, f5, 5, "Merged F5 to I6");
            setCellValue(sheet, j4, 9, "Merged J4 to Q4");
            setCellValue(sheet, j5, 9, "Merged J5 to K6");
            setCellValue(sheet, l5, 11, "Merged L5 to M6");
            setCellValue(sheet, n5, 13, "Merged N5 to O6");
            setCellValue(sheet, p5, 15, "Merged P5 to Q6");
            setCellValue(sheet, b7, 1, "Merged B7 to C8");
            setCellValue(sheet, d7, 3, "Merged D7 to G8");
            setCellValue(sheet, h7, 7, "Merged H7 to J7");
            setCellValue(sheet, k7, 10, "Merged K7 to K8");
            setCellValue(sheet, l7, 11, "Merged L7 to L8");
            setCellValue(sheet, m7, 12, "Merged M7 to M8");
            setCellValue(sheet, n7, 13, "Merged N7 to N8");
            setCellValue(sheet, o7, 14, "Merged O7 to O8");
            setCellValue(sheet, p7, 15, "Merged P7 to P8");
            setCellValue(sheet, q7, 16, "Merged Q7 to Q8");

            setCellValue(sheet, 7, 7, "Lab");
            setCellValue(sheet, 7, 8, "Lec");
            setCellValue(sheet, 7, 9, "Total");
            
            
            
            three+=10;
            four+=10;
            five+=10;
            six+=10;
            seven+=10;
        }
        
        
        
        
        FileOutputStream outStream = new FileOutputStream("C:/HEHE/experiment.xlsx");
        workbook.write(outStream);
        outStream.close();
    }
    private static void setCellValue(XSSFSheet sheet, int rowNum, int cellNum, String value) {
        Row row = sheet.getRow(rowNum);
        if (row == null) {
            row = sheet.createRow(rowNum);
        }
        Cell cell = row.createCell(cellNum);
        cell.setCellValue(value);
    }
}
