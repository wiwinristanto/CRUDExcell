//https://www.geeksforgeeks.org/reading-writing-data-excel-file-using-apache-poi/
//Java program to Illustrate Writing
//Data to Excel File using Apache POI
package com.wiwin.tutorial.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Create {
    public static void main(String[] args){
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Creating a blank Excell Sheet
        XSSFSheet sheet = workbook.createSheet("student Details");
        //Creating an empty TreeMap of string and Object[}
        //type
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        //Writing data to Object[]
        //using put() method
        data.put("1", new Object[]{"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[]{1,"Amar", "Asa"});
        data.put("3", new Object[]{2,"Angel", "Ana"});
        data.put("4", new Object[]{3,"Deni", "Hen"});
        data.put("5", new Object[]{4,"Bob", "Al"});

        //Iterating over data and writing it to sheet
        Set<String> keyset = data.keySet();

        int rownum = 0;
        for (String key : keyset){
            //Creating a new row in sheet
            Row row = sheet.createRow(rownum++);

            Object[] objArr = data.get(key);

            int cellnum = 0;

            for (Object obj : objArr){
                //This line creates a cell in the next
                //column of that row
                Cell cell = row.createCell(cellnum++);

                if(obj instanceof  String)cell.setCellValue((String)obj);
                else if (obj instanceof  Integer)cell.setCellValue((Integer)obj);
            }
        }
        //Try block to check for exceptions
        try{
            //Writing the workbook
            FileOutputStream out = new FileOutputStream(new File("gfgcontribute.xlsx"));
            workbook.write(out);

            //Closing file output connections
            out.close();

            //Console message for succesful execution of program
            System.out.println("gfgcontribute.xslx written Ssuccesfully on disk.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Catch block to handle exeptions
        catch (IOException e) {
            //Display exceptions along with line number
            //using printStackTrace() method
            e.printStackTrace();
        }
    }
}
