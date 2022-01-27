package com.wiwin.tutorial.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ReadExcel {
    private static final String Name = "D:\\#testApp.xlsx";

    public static void main(String []args){
        try{
            FileInputStream file = new FileInputStream(new File(Name));
            Workbook workbook = new XSSFWorkbook(file);
            DataFormatter dataformatter = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();
            while (sheets.hasNext()){
                Sheet sh = sheets.next();
                System.out.println("Sheet name is "+ sh.getSheetName());
                System.out.println("-----------");
                Iterator<Row> iterator = sh.iterator();
                while (iterator.hasNext()){
                    Row row = iterator.next();
                    Iterator<Cell>cellIterator = row.iterator();
                    while (cellIterator.hasNext()){
                        Cell cell = cellIterator.next();
                        String cellValue =dataformatter.formatCellValue(cell);
                        //if(
                        System.out.println(cellValue+"\t");
                    }
                    System.out.println();
                }
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
