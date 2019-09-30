package com.harman.infotracker.util;

import com.harman.infotracker.model.EmployeeInfo;

public class TrackerUtil {

	public EmployeeInfo mappingObjects(EmployeeInfo employeeInfo, EmployeeInfo employee) {
		employee.setAddress(employeeInfo.getAddress());
		employee.setAdhaar(employeeInfo.getAdhaar());
		employee.setBilling(employeeInfo.getBilling());
		employee.setBillStartdate(employeeInfo.getBillStartdate());
		employee.setBloodGroup(employeeInfo.getBloodGroup());
		employee.setCategory(employeeInfo.getCategory());
		employee.setComments(employeeInfo.getComments());
		employee.setContactNumber(employeeInfo.getContactNumber());
		employee.setCoreornoncore(employeeInfo.getCoreornoncore());
		employee.setCriticality(employeeInfo.getCriticality());
		employee.setDept(employeeInfo.getDept());
		employee.setDiamlerEmail(employeeInfo.getDiamlerEmail());
		employee.setDiamlerId(employeeInfo.getDiamlerId());
		employee.setDob(employeeInfo.getDob());
		employee.setDojHarman(employeeInfo.getDojHarman());
		employee.setEducationalQualification(employeeInfo.getEducationalQualification());
		employee.setEmergencyCName(employeeInfo.getEmergencyCName());
		employee.setEmergencyCNumber(employeeInfo.getEmergencyCNumber());
		employee.setEngagementScore(employeeInfo.getEngagementScore());
		employee.setExperience(employeeInfo.getExperience());
		employee.setFirstName(employeeInfo.getFirstName());
		employee.setGender(employeeInfo.getGender());
		employee.setHarmanband(employeeInfo.getHarmanband());
		employee.setHarmanEmail(employeeInfo.getHarmanEmail());
		employee.setHarmanId(employeeInfo.getHarmanId());
		employee.setIntorext(employeeInfo.getIntorext());
		employee.setLastName(employeeInfo.getLastName());
		employee.setLwd(employeeInfo.getLwd());
		employee.setMbrdiManager(employeeInfo.getMbrdiManager());
		employee.setMiddleName(employeeInfo.getMiddleName());
		employee.setNotes(employeeInfo.getNotes());
		employee.setPassDateofexpiry(employeeInfo.getPassDateofexpiry());
		employee.setPassDateofissue(employeeInfo.getPassDateofissue());
		employee.setPassingyear(employeeInfo.getPassingyear());
		employee.setPassportNum(employeeInfo.getPassportNum());
		employee.setPlaceofbirth(employeeInfo.getPlaceofbirth());
		employee.setResigned(employeeInfo.isResigned());
		employee.setSkill(employeeInfo.getSkill());
		employee.setSkills(employeeInfo.getSkills());
		employee.setStatus(employeeInfo.getStatus());
		employee.setUniversity(employeeInfo.getUniversity());
		return employee;
	}

}
