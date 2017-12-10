package com.witontek.ehospital2.base;

import java.io.File;

public class FileUtils {
	
	private static Log log = new Log(ExcelUtils.class);
	
	/**
	 * 删除下载的Excel文件
	 * @param execlFileName
	 */
	public static void deleteDownloadExcel(String execlFileName){
		File excelFile=new File(System.getProperty("user.dir") + "/downloadPath/" + execlFileName);
		if(excelFile.exists()){
			if(excelFile.delete()){
				log.info("删除Excel文件(" + execlFileName + ")");
			}else{
				log.error("删除Excel文件(" + execlFileName + ")失败");
			}
		}else{
			log.info("Excel文件(" + execlFileName + ")不存在");
		}
	}

}
