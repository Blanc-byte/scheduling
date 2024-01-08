
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class createRoomScheds {
    static DatabaseConnection dc = new DatabaseConnection();
    static ObservableList<roomModel> rooms = FXCollections.observableArrayList();
    public static void main(String[] args) throws Exception{
        dc.connect();
        getRooms();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp info");
        int frow = 0;
        int lrow = 1;
        int rowForTime = 2;
        int rowForRooms = 3;
        sheet.addMergedRegion(new CellRangeAddress(frow, lrow, 0, 57));
        setCellValue(sheet, frow, 0,"MONDAY");
        setCellValue(sheet, rowForTime, 0,"Time");
        setCellValue(sheet, rowForTime, 1,"7:00");
        setCellValue(sheet, rowForTime, 2,"7:30");
        setCellValue(sheet, rowForTime, 3,"8:00");
        setCellValue(sheet, rowForTime, 4,"8:30");
        setCellValue(sheet, rowForTime, 5,"9:00");
        setCellValue(sheet, rowForTime, 6,"9:30");
        setCellValue(sheet, rowForTime, 7,"10:00");
        setCellValue(sheet, rowForTime, 8,"10:30");
        setCellValue(sheet, rowForTime, 9,"11:00");
        setCellValue(sheet, rowForTime, 10,"11:30");
        setCellValue(sheet, rowForTime, 11,"12:00");
        
        setCellValue(sheet, rowForTime, 13,"1:00");
        setCellValue(sheet, rowForTime, 14,"1:30");
        setCellValue(sheet, rowForTime, 15,"2:00");
        setCellValue(sheet, rowForTime, 16,"2:30");
        setCellValue(sheet, rowForTime, 17,"3:00");
        setCellValue(sheet, rowForTime, 18,"3:30");
        setCellValue(sheet, rowForTime, 19,"4:00");
        setCellValue(sheet, rowForTime, 20,"4:30");
        setCellValue(sheet, rowForTime, 21,"5:00");
        setCellValue(sheet, rowForTime, 22,"5:30");
        setCellValue(sheet, rowForTime, 23,"6:00");
        setCellValue(sheet, rowForTime, 24,"6:30");
        setCellValue(sheet, rowForTime, 25,"7:00");
        
        String buildingNumber = "2";
        int i = 0;
        while(i<2){
            for(roomModel rm: rooms){
                if(rm.getroomBuilding().equals(buildingNumber)){
                    setCellValue(sheet, rowForRooms, 0,rm.getroomCODE()+"");
                    rowForRooms++;
                }
            }
            buildingNumber = "1";
            i++;
        }
        rowForRooms++;
        
        
        
        
        
        
        
        
        FileOutputStream outStream = new FileOutputStream("C:/HEHE/FacultyWorkload2.xlsx");
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
//        
//        CellStyle style = sheet.getWorkbook().createCellStyle();
//        style.setBorderTop(BorderStyle.THIN);
//        style.setBorderBottom(BorderStyle.THIN);
//        style.setBorderLeft(BorderStyle.THIN);
//        style.setBorderRight(BorderStyle.THIN);
//        // Apply the cell style to the cell
//        cell.setCellStyle(style);   
    }
    public static void getRooms()throws SQLException{
        rooms.clear();
        Statement statement = dc.con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT roomID, roomCode, roomType, buildingNo FROM room");
        while(resultSet.next()){
            String sI = resultSet.getString("roomID");
            String sII = resultSet.getString("roomCode");
            String sIII = resultSet.getString("roomType");
            String sIV = resultSet.getString("buildingNo");
            rooms.add(new roomModel(sI, sII,sIII,sIV));
            //System.out.println("Room"+sII);
        }
    }
}
