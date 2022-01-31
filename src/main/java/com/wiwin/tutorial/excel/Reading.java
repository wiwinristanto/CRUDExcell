package com.wiwin.tutorial.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;

public class Reading {
    //Main driver method
    public static void main(String []args){
        //Try block to check fo exceptions
        try{
            //Reading file fro local directory
            FileInputStream file = new FileInputStream(new File("gfgcontributr.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            //Till there is an element condition holds true
            while (rowIterator.hasNext()){
                Row row = rowIterator.next();

                //For each row, iterate through all the columms
                Iterator<Cell>cellIterator = row.cellIterator();

                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    String   = cell.get

                    //Chek the cell type and format according
                    switch (cell.getCellTypeEnum()){

                        case _NONE:
                           
                            break;
                        case NUMERIC:
                            break;
                        case STRING:
                            break;
                        case FORMULA:
                            break;
                        case BLANK:
                            break;
                        case BOOLEAN:
                            break;
                        case ERROR:
                            break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
