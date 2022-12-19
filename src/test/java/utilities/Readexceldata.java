package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;



public class Readexceldata  {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    Readexceldata red = new Readexceldata ();
	         red.getExcelData("Sheet1");
}
	@DataProvider(name="Book1")
	
	public String[][] getExcelData(String Book1) throws EncryptedDocumentException, IOException {
		
		      File  f = new File (System.getProperty("user.dir")+"/src/test/resources/testdata/Book1.xlsx");
		         FileInputStream fis = new FileInputStream (f);
		         Workbook wb = WorkbookFactory.create(fis);
		         Sheet sheetname  = wb.getSheet(Book1);
		  // up to here we get the sheet from wb now we'll get the coloumb and row
		         
		         int totalrow = sheetname.getLastRowNum();
		         System.out.print(totalrow);
		      Row totalcell     =  sheetname.getRow(0);
		         int totalclm =  totalcell.getLastCellNum();
		               System.out.print(" | "); 
		         System.out.println(totalclm);
		                 
		        DataFormatter format = new DataFormatter();
		 // dataformatter used to format the data in all forms    
		        
		        String testdata [][] = new String [totalrow][totalclm];
		      // use nested loop to iterate through row and clm.
		        for(int i = 1; i<=totalrow;i++) {
		    	  
		    	for(int j =0; j<totalclm;j++) {
		    		
		    		testdata [i-1][j]= format.formatCellValue(sheetname.getRow(i).getCell(j));
		    		
		    		System.out.println(testdata [i-1][j]);
		  
		    		
		    		
		    	}
		    	  
		      }
		     
		      
		      return testdata;
		      
	}
	
	
	
	
	
	
	
	
	
	
	

	
}



	

