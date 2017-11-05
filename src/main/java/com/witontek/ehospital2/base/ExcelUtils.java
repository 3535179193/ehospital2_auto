package com.witontek.ehospital2.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils extends BasePage{
	
	public ExcelUtils(WebDriver driver) {
		super(driver);
	}

	private static List<Object[]> testCase;
	
	private static Map<String,String> testData;
	
	private static Log log=new Log(ExcelUtils.class);

	public static Iterator<Object[]> readExcel(String excelFileName){
		Workbook workbook = null;
		try {
			workbook=new XSSFWorkbook(new File(System.getProperty("user.dir")+"/testCase/"+Global.USER_NAME+"/"+excelFileName+".xlsx"));
		} catch (Exception e) {
			log.error("读取"+excelFileName+".xlsx文件失败");
		}
		
		Sheet firstSheet=workbook.getSheetAt(0);
		try {
			workbook.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Row firstRow=firstSheet.getRow(0);
		testCase=new ArrayList<Object[]>();
		
		try{
		for(int i=0;i<=firstSheet.getLastRowNum();i++){
			Row row=firstSheet.getRow(i);
			if(i==0||row.getCell(1)==null){
				continue;
			}
			
			String caseName=switchCellType(row.getCell(0));
			String expectedResult=switchCellType(row.getCell(2));
			testData=new HashMap<String,String>();
			for(int j=0;j<firstRow.getLastCellNum();j++){
				if(j<3){
					continue;
				}
				if(row.getCell(j)==null){
					testData.put(switchCellType(firstRow.getCell(j)), "");
				}
				else
					testData.put(switchCellType(firstRow.getCell(j)), switchCellType(row.getCell(j)));
			}
			testCase.add(new Object[]{caseName, expectedResult, testData});
		}
		log.info("读取"+excelFileName+".xlsx文件");
		}catch(Exception e){
			log.error("读取"+excelFileName+".xlsx文件失败");
		}
		return testCase.iterator();
		
	}
	
	public static String switchCellType(Cell cell) {
		
		String cellValue=null;
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
		
		try{
			switch(cell.getCellTypeEnum()){
			case STRING:
					cellValue=cell.getStringCellValue();break;
					
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)){
					cellValue=(dateFormat.format(cell.getDateCellValue())).toString();break;
					}
				else{
					cell.setCellType(CellType.STRING);
					cellValue=String.valueOf(cell.getRichStringCellValue());break;
					}
			case BOOLEAN:
				cellValue=String.valueOf(cell.getBooleanCellValue());break;
			case ERROR:
				cellValue=String.valueOf(cell.getErrorCellValue());break;
			case BLANK:
				cellValue=cell.getStringCellValue();break;
			default:
				cellValue=cell.getStringCellValue();
			}
		}catch(Exception e){
			log.error("excel转换数据类型出错");
		}
		
		return cellValue;
	}
}











