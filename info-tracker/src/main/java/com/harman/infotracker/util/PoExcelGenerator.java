package com.harman.infotracker.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.harman.infotracker.model.PoiDetail;

public class PoExcelGenerator {

	public static ByteArrayInputStream poExcel(List<PoiDetail> podetail) throws IOException {

		String[] columns = { "Harman ID", "PO Number", "PO Start date", "PO End date", "PO value" };

		
		Workbook workbook = new XSSFWorkbook();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

			CreationHelper createHelper = workbook.getCreationHelper();
			   
		      Sheet sheet = workbook.createSheet("PO");
		   
		      Font headerFont = workbook.createFont();
		      headerFont.setColor(IndexedColors.BLUE.getIndex());
		   
		      CellStyle headerCellStyle = workbook.createCellStyle();
		      headerCellStyle.setFont(headerFont);
		      
		   // Row for Header
		      Row headerRow = sheet.createRow(0);
		   
		      // Header
		      for (int col = 0; col < columns.length; col++) {
		        Cell cell = headerRow.createCell(col);
		        cell.setCellValue(columns[col]);
		        cell.setCellStyle(headerCellStyle);
		      }
		      
		      int rowIdx = 1;
		   
			for (PoiDetail poiDetail : podetail) {
		        Row row = sheet.createRow(rowIdx++);
		   
		        row.createCell(0).setCellValue(poiDetail.getHarmanId());
		        row.createCell(1).setCellValue(poiDetail.getPoiNumber());
		        row.createCell(2).setCellValue(poiDetail.getPoiStartDate());
		        row.createCell(3).setCellValue(poiDetail.getPoiEndDate());
		        row.createCell(4).setCellValue(poiDetail.getPoiValue());
		      }
			workbook.write(out);
	        return new ByteArrayInputStream(out.toByteArray());
		}
}
