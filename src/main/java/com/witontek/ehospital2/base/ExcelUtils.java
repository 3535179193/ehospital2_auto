package com.witontek.ehospital2.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils extends BasePage {

	public ExcelUtils(WebDriver driver) {
		super(driver);
	}

	private static List<Object[]> testCase;

	private static Map<String, String> testData;

	private static Log log = new Log(ExcelUtils.class);

	/**
	 * 读取Excel文件
	 * @param excelFileName
	 * @param sheetName
	 * @return
	 */
	public static Iterator<Object[]> readTestDataExcel(String excelFileName, String sheetName) {
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(new File(System.getProperty("user.dir") + "/testCase/" + Global.USER_NAME + "/"
					+ excelFileName + ".xlsx"));
		} catch (Exception e) {
			log.error("读取" + excelFileName + ".xlsx文件中" + sheetName + "表单失败,报错信息：" + e.getMessage());
		}
		Sheet sheet = workbook.getSheet(sheetName);
		try {
			workbook.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Row firstRow = sheet.getRow(0);
		testCase = new ArrayList<Object[]>();

		try {
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (i == 0 || row.getCell(1) == null) {
					continue;
				}

				String caseName = switchCellType(row.getCell(0));
				String expectedResult = switchCellType(row.getCell(2));
				testData = new HashMap<String, String>();
				for (int j = 0; j < firstRow.getLastCellNum(); j++) {
					if (j < 3) {
						continue;
					}
					if (row.getCell(j) == null) {
						testData.put(switchCellType(firstRow.getCell(j)), "");
					} else
						testData.put(switchCellType(firstRow.getCell(j)), switchCellType(row.getCell(j)));
				}
				testCase.add(new Object[] { caseName, expectedResult, testData });
			}
			log.info("读取" + excelFileName + ".xlsx文件中" + sheetName + "表单成功");
		} catch (Exception e) {
			log.error("读取" + excelFileName + ".xlsx文件中" + sheetName + "表单失败,报错信息：" + e.getMessage());
		}
		return testCase.iterator();

	}
	
	/**
	 * 读取下载的Excel文件中某行某列
	 * @param execlFileName
	 * @param line
	 * @param column
	 * @return
	 */
	public static String readDownloadExecl(String execlFileName, String line, String column) {
		Workbook workbook = null;
		File fileName = new File(System.getProperty("user.dir") + "/downloadPath/" + execlFileName);
		FileInputStream excelFile = null;
		try {
			excelFile = new FileInputStream(System.getProperty("user.dir") + "/downloadPath/" + execlFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (execlFileName.endsWith("xls") && fileName.exists()) {
			try {
				workbook = new HSSFWorkbook(excelFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (execlFileName.endsWith("xlsx") && fileName.exists()) {
			try {
				workbook = new XSSFWorkbook(excelFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else
			log.error("下载的Excel文件(" + execlFileName + ")不存在");
		Cell cell=null;
		try {
			Sheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(Integer.parseInt(line) - 1);
			cell = row.getCell(Integer.parseInt(column) - 1);
		} catch (Exception e) {
			log.error("读取下载的Excel文件(" + execlFileName + ")失败");
		}
		try {
			excelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return switchCellType(cell);

	}

	/**
	 * 将Excel文件中单元格类型转换为String类型
	 * 
	 * @param cell
	 * @return
	 */
	public static String switchCellType(Cell cell) {

		String cellValue = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		try {
			switch (cell.getCellTypeEnum()) {
			case STRING:
				cellValue = cell.getStringCellValue();
				break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					cellValue = (dateFormat.format(cell.getDateCellValue())).toString();
					break;
				} else {
					cell.setCellType(CellType.STRING);
					cellValue = String.valueOf(cell.getRichStringCellValue());
					break;
				}
			case BOOLEAN:
				cellValue = String.valueOf(cell.getBooleanCellValue());
				break;
			case ERROR:
				cellValue = String.valueOf(cell.getErrorCellValue());
				break;
			case BLANK:
				cellValue = cell.getStringCellValue();
				break;
			default:
				cellValue = cell.getStringCellValue();
			}
		} catch (Exception e) {
			log.error("excel转换数据类型出错,报错信息：" + e.getMessage());
		}

		return cellValue;
	}
}
