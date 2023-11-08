package InitilizeRunConfiguration;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.SystemVariables;

public class ExcelData {
	public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    public ExcelData(String xlFilePath) throws Exception
    {
    	fis  = new FileInputStream(SystemVariables.Excel_data+"TestDataSheet.xlsx");
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }
 
    public String getColumndata(String sheetName, String colName, int rowNum)
    {
        try
        {
            int col_Num = -1;
            sheet = workbook.getSheet(sheetName);
            row = sheet.getRow(0);
            for(int i = 0; i < row.getLastCellNum(); i++)
            {
                if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    col_Num = i;
            }
 
            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(col_Num);
 
            if(cell.getCellType() == CellType.STRING)
                return cell.getStringCellValue();
            else if(cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA)
            {
                String cellValue = String.valueOf(cell.getNumericCellValue());
                
                return cellValue;
            }
            else if(cell.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return "column "+colName +" does not exist  in Excel";
        }
    }
    public String GetTestData(String sheetName, String colName, int rowNum) throws Exception
	{
		
		String Value=getColumndata(sheetName,colName,rowNum);
		return Value;
	}
}
