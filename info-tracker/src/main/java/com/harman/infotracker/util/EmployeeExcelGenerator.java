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

import com.harman.infotracker.model.EmployeeInfo;

public class EmployeeExcelGenerator {
	
	public static ByteArrayInputStream employeeExcel(List<EmployeeInfo> employeeInfo) throws IOException {

	String[] columns = { "HarmanID", "DiamlerID", "First Name", "Mddle Name", "Last Name", "Status", "resigned", "LWD",
			"Gender", "Harman Date of Joining", "Billing Start Date", "Engagement Score", "Criticality", "Comments",
			"Internal/External", "Skills", "Category", "Core/Non-Core", "Skill", "MBRDI Manager", "Department",
			"Diamler Email", "Harman Email", "Billing", "Experience", "Harman band", "Notes", "Blood Group", "Adhaar",
			"DOB", "Place of Birth", "Contact Number", "Address", "Emergency Contact Name", "Emergency Contact Number",
			"Passport Number", "Passport date of Issue", "Passport date of expiry", "Educational Qualification",
			"University", "Passing Year" };

	
	Workbook workbook = new XSSFWorkbook();
	ByteArrayOutputStream out = new ByteArrayOutputStream();

		CreationHelper createHelper = workbook.getCreationHelper();
		   
	      Sheet sheet = workbook.createSheet("Employees");
	   
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
	   
		for (EmployeeInfo employee : employeeInfo) {
	        Row row = sheet.createRow(rowIdx++);
	   
	        row.createCell(0).setCellValue(employee.getHarmanId());
	        row.createCell(1).setCellValue(employee.getDiamlerId());
	        row.createCell(2).setCellValue(employee.getFirstName());
	        row.createCell(3).setCellValue(employee.getMiddleName());
	        row.createCell(4).setCellValue(employee.getLastName());
	        row.createCell(5).setCellValue(employee.getStatus());
	        row.createCell(6).setCellValue(employee.isResigned());
	        row.createCell(7).setCellValue(employee.getLwd());
	        row.createCell(8).setCellValue(employee.getGender());
	        row.createCell(9).setCellValue(employee.getDojHarman());
	        row.createCell(10).setCellValue(employee.getBillStartdate());
	        row.createCell(11).setCellValue(employee.getEngagementScore());
	        row.createCell(12).setCellValue(employee.getCriticality());
	        row.createCell(13).setCellValue(employee.getComments());
	        row.createCell(14).setCellValue(employee.getIntorext());
	        
	        row.createCell(15).setCellValue(employee.getSkills());
	        row.createCell(16).setCellValue(employee.getCategory());
	        row.createCell(17).setCellValue(employee.getCoreornoncore());
	        row.createCell(18).setCellValue(employee.getSkill());
	        row.createCell(19).setCellValue(employee.getMbrdiManager());
	        row.createCell(20).setCellValue(employee.getDept());
	        row.createCell(21).setCellValue(employee.getDiamlerEmail());
	        row.createCell(22).setCellValue(employee.getHarmanEmail());
	        row.createCell(23).setCellValue(employee.getBilling());
	        row.createCell(24).setCellValue(employee.getExperience());
	        row.createCell(25).setCellValue(employee.getHarmanband());
	        row.createCell(26).setCellValue(employee.getNotes());
	        row.createCell(27).setCellValue(employee.getBloodGroup());
	        row.createCell(28).setCellValue(employee.getAdhaar());
	        row.createCell(29).setCellValue(employee.getDob());
	   
	        row.createCell(30).setCellValue(employee.getPlaceofbirth());
	        row.createCell(31).setCellValue(employee.getContactNumber());
	        row.createCell(32).setCellValue(employee.getAddress());
	        row.createCell(33).setCellValue(employee.getEmergencyCName());
	        row.createCell(34).setCellValue(employee.getEmergencyCNumber());
	        row.createCell(35).setCellValue(employee.getPassportNum());
	        row.createCell(36).setCellValue(employee.getPassDateofissue());
	        row.createCell(37).setCellValue(employee.getPassDateofexpiry());
	        row.createCell(38).setCellValue(employee.getEducationalQualification());
	        row.createCell(39).setCellValue(employee.getUniversity());
	        row.createCell(40).setCellValue(employee.getPassingyear());
	        
	        
	      }
		workbook.write(out);
        return new ByteArrayInputStream(out.toByteArray());
	}
}
	


