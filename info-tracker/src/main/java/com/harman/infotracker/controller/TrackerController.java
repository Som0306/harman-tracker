package com.harman.infotracker.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harman.infotracker.exception.ResourceNotFoundException;
import com.harman.infotracker.model.EmployeeInfo;
import com.harman.infotracker.model.PoiDetail;
import com.harman.infotracker.respository.PoiRepository;
import com.harman.infotracker.respository.TrackerRepository;
import com.harman.infotracker.util.EmployeeExcelGenerator;
import com.harman.infotracker.util.PoExcelGenerator;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:8080" })
@RestController
@RequestMapping("/api")
public class TrackerController {

	@Autowired
	private TrackerRepository trackerRepository;

	@Autowired
	private PoiRepository poirepository;

	@GetMapping("/info")
	public List<EmployeeInfo> getAllInfo() {
		return trackerRepository.findAll();
	}

	@GetMapping("/info/{id}")
	public ResponseEntity<EmployeeInfo> getInfoById(@PathVariable(value = "id") Long harmanId) {
		EmployeeInfo employee = trackerRepository.findById(harmanId)
				.orElseThrow(() -> new ResourceNotFoundException(harmanId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/info")
	public EmployeeInfo createInfo(@Valid @RequestBody EmployeeInfo employeeInfo) {
		return trackerRepository.save(employeeInfo);
	}

	@PutMapping("/info/{id}")
	public ResponseEntity<EmployeeInfo> updateinfo(@PathVariable(value = "id") Long harmanId,
			@Valid @RequestBody EmployeeInfo employeeInfo) {
		EmployeeInfo employee = trackerRepository.findById(harmanId)
				.orElseThrow(() -> new ResourceNotFoundException(harmanId));
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
		final EmployeeInfo updatedInfo = trackerRepository.save(employee);
		return ResponseEntity.ok().body(updatedInfo);
	}

	/*@DeleteMapping("/info/{id}")
	public Map<String, Boolean> deletInfo(@PathVariable(value = "id") Long harmanId) {
		trackerRepository.deleteById(harmanId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}*/

	@GetMapping("/info/poi")
	public List<PoiDetail> getAllPoiInfo() {
		return poirepository.findAll();
	}
	
	@GetMapping("/info/poi/{id}")
	public List<PoiDetail> getAllPoiInfo(@PathVariable(value = "id") Long harmanId) {
		return poirepository.findAllByharmanId(harmanId);
	}
	
	
	@PostMapping("info/poi")
	public PoiDetail createPoi(@Valid @RequestBody PoiDetail poiDetail) {
		return poirepository.save(poiDetail);
	}
	
	@GetMapping("/info/download/employee.xlsx")
	public ResponseEntity<InputStreamResource> employeeReport() throws IOException {
        List<EmployeeInfo> employee = (List<EmployeeInfo>) trackerRepository.findAll();
    
    ByteArrayInputStream in = EmployeeExcelGenerator.employeeExcel(employee);
    
    HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=employee.xlsx");
    
     return ResponseEntity
                  .ok()
                  .headers(headers)
                  .body(new InputStreamResource(in));
    }
	
	
	@GetMapping("/info/poi/download/po.xlsx")
	public ResponseEntity<InputStreamResource> excelCustomersReport() throws IOException {
        List<PoiDetail> poDetail = (List<PoiDetail>) poirepository.findAll();
    
    ByteArrayInputStream in = PoExcelGenerator.poExcel(poDetail);
    
    HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=po.xlsx");
    
     return ResponseEntity
                  .ok()
                  .headers(headers)
                  .body(new InputStreamResource(in));
    }
	


}
