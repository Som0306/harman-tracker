package com.harman.infotracker.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeInfo() {}
	
	public EmployeeInfo(long harmanId, long diamlerId, String firstName, String middleName, String lastName,
			String status, String resigned, String lwd, String gender, String dojHarman, String billStartdate,
			String engagementScore, String criticality, String comments, String intorext, String skills,
			String category, String coreornoncore, String skill, String mbrdiManager, String dept, String diamlerEmail,
			String harmanEmail, long billing, long experience, String harmanband, String notes, String bloodGroup,
			long adhaar, String dob, String placeofbirth, String contactNumber, String address, String emergencyCName,
			String emergencyCNumber, String passportNum, String passDateofissue, String passDateofexpiry,
			String educationalQualification, String university, String passingyear) {
		super();
		this.harmanId = harmanId;
		this.diamlerId = diamlerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.status = status;
		this.resigned = resigned;
		this.lwd = lwd;
		this.gender = gender;
		this.dojHarman = dojHarman;
		this.billStartdate = billStartdate;
		this.engagementScore = engagementScore;
		this.criticality = criticality;
		this.comments = comments;
		this.intorext = intorext;
		this.skills = skills;
		this.category = category;
		this.coreornoncore = coreornoncore;
		this.skill = skill;
		this.mbrdiManager = mbrdiManager;
		this.dept = dept;
		this.diamlerEmail = diamlerEmail;
		this.harmanEmail = harmanEmail;
		this.billing = billing;
		this.experience = experience;
		this.harmanband = harmanband;
		this.notes = notes;
		this.bloodGroup = bloodGroup;
		this.adhaar = adhaar;
		this.dob = dob;
		this.placeofbirth = placeofbirth;
		this.contactNumber = contactNumber;
		this.address = address;
		this.emergencyCName = emergencyCName;
		this.emergencyCNumber = emergencyCNumber;
		this.passportNum = passportNum;
		this.passDateofissue = passDateofissue;
		this.passDateofexpiry = passDateofexpiry;
		this.educationalQualification = educationalQualification;
		this.university = university;
		this.passingyear = passingyear;
	}

	@Id
	@Column(name = "harman_id", nullable = false)
	private long harmanId;
	
	@Column(name = "diamler_id", nullable = false)
	private long diamlerId;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", nullable = true)
	private String middleName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "resigned", nullable = true)
	private String resigned;
	
	@Column(name = "last_working_day", nullable = true)
	private String lwd;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "dateofjoining_harman", nullable = false)
	private String dojHarman;
	
	@Column(name = "billing_start_date", nullable = false)
	private String billStartdate;
	
	@Column(name = "engagement_store", nullable = false)
	private String engagementScore;
	
	@Column(name = "criticality", nullable = true)
	private String criticality;
	
	@Column(name = "comments", nullable = true)
	private String comments;
	
	@Column(name = "internal_extenal", nullable = false)
	private String intorext;
	
	@Column(name = "skills", nullable = false)
	private String skills;
	
	@Column(name = "category", nullable = true)
	private String category;
	
	@Column(name = "core_non_core", nullable = false)
	private String coreornoncore;
	
	@Column(name = "skill", nullable = false)
	private String skill;
	
	@Column(name = "MBRDIMgr", nullable = false)
	private String mbrdiManager;
	
	@Column(name = "department", nullable = false)
	private String dept;
	
	@Column(name = "diamler_email", nullable = false)
	private String diamlerEmail;
	
	@Column(name = "harman_email", nullable = false)
	private String harmanEmail;
	
	@Column(name = "billing", nullable = false)
	private long billing;
	
	@Column(name = "experience", nullable = false)
	private long experience;
	
	@Column(name = "harman_band", nullable = false)
	private String harmanband;
	
	@Column(name = "notes", nullable = true)
	private String notes;
	
	@Column(name = "blood_group", nullable = false)
	private String bloodGroup;
	
	@Column(name = "adhaar_number", nullable = false)
	private long adhaar;
	
	@Column(name = "date_of_birth", nullable = false)
	private String dob;
	
	@Column(name = "place_of_birth", nullable = false)
	private String placeofbirth;
	
	@Column(name = "contact_number", nullable = false)
	private String contactNumber;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "emergency_contact_name", nullable = false)
	private String emergencyCName;
	
	@Column(name = "emergency_contact_number", nullable = false)
	private String emergencyCNumber;
	
	@Column(name = "passport_number", nullable = false)
	private String passportNum;
	
	@Column(name = "passport_date_of_issue", nullable = false)
	private String passDateofissue;
	
	@Column(name = "passport_date_of_expiry", nullable = false)
	private String passDateofexpiry;
	
	@Column(name = "educational_qualification", nullable = false)
	private String educationalQualification;
	
	@Column(name = "university", nullable = false)
	private String university;
	
	@Column(name = "year_of_passing", nullable = false)
	private String passingyear;

	public long getHarmanId() {
		return harmanId;
	}

	public void setHarmanId(long harmanId) {
		this.harmanId = harmanId;
	}

	public long getDiamlerId() {
		return diamlerId;
	}

	public void setDiamlerId(long diamlerId) {
		this.diamlerId = diamlerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String isResigned() {
		return resigned;
	}

	public void setResigned(String resigned) {
		this.resigned = resigned;
	}

	public String getLwd() {
		return lwd;
	}

	public void setLwd(String lwd) {
		this.lwd = lwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDojHarman() {
		return dojHarman;
	}

	public void setDojHarman(String dojHarman) {
		this.dojHarman = dojHarman;
	}

	public String getBillStartdate() {
		return billStartdate;
	}

	public void setBillStartdate(String billStartdate) {
		this.billStartdate = billStartdate;
	}

	public String getEngagementScore() {
		return engagementScore;
	}

	public void setEngagementScore(String engagementScore) {
		this.engagementScore = engagementScore;
	}

	public String getCriticality() {
		return criticality;
	}

	public void setCriticality(String criticality) {
		this.criticality = criticality;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getIntorext() {
		return intorext;
	}

	public void setIntorext(String intorext) {
		this.intorext = intorext;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCoreornoncore() {
		return coreornoncore;
	}

	public void setCoreornoncore(String coreornoncore) {
		this.coreornoncore = coreornoncore;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getMbrdiManager() {
		return mbrdiManager;
	}

	public void setMbrdiManager(String mbrdiManager) {
		this.mbrdiManager = mbrdiManager;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDiamlerEmail() {
		return diamlerEmail;
	}

	public void setDiamlerEmail(String diamlerEmail) {
		this.diamlerEmail = diamlerEmail;
	}

	public String getHarmanEmail() {
		return harmanEmail;
	}

	public void setHarmanEmail(String harmanEmail) {
		this.harmanEmail = harmanEmail;
	}

	public long getBilling() {
		return billing;
	}

	public void setBilling(long billing) {
		this.billing = billing;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public String getHarmanband() {
		return harmanband;
	}

	public void setHarmanband(String harmanband) {
		this.harmanband = harmanband;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPlaceofbirth() {
		return placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyCName() {
		return emergencyCName;
	}

	public void setEmergencyCName(String emergencyCName) {
		this.emergencyCName = emergencyCName;
	}

	public String getEmergencyCNumber() {
		return emergencyCNumber;
	}

	public void setEmergencyCNumber(String emergencyCNumber) {
		this.emergencyCNumber = emergencyCNumber;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getPassDateofissue() {
		return passDateofissue;
	}

	public void setPassDateofissue(String passDateofissue) {
		this.passDateofissue = passDateofissue;
	}

	public String getPassDateofexpiry() {
		return passDateofexpiry;
	}

	public void setPassDateofexpiry(String passDateofexpiry) {
		this.passDateofexpiry = passDateofexpiry;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [harmanId=" + harmanId + ", diamlerId=" + diamlerId + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", status=" + status + ", resigned="
				+ resigned + ", lwd=" + lwd + ", gender=" + gender + ", dojHarman=" + dojHarman + ", billStartdate="
				+ billStartdate + ", engagementScore=" + engagementScore + ", criticality=" + criticality
				+ ", comments=" + comments + ", intorext=" + intorext + ", skills=" + skills + ", category=" + category
				+ ", coreornoncore=" + coreornoncore + ", skill=" + skill + ", mbrdiManager=" + mbrdiManager + ", dept="
				+ dept + ", diamlerEmail=" + diamlerEmail + ", harmanEmail=" + harmanEmail + ", billing=" + billing
				+ ", experience=" + experience + ", harmanband=" + harmanband + ", notes=" + notes + ", bloodGroup="
				+ bloodGroup + ", adhaar=" + adhaar + ", dob=" + dob + ", placeofbirth=" + placeofbirth
				+ ", contactNumber=" + contactNumber + ", address=" + address + ", emergencyCName=" + emergencyCName
				+ ", emergencyCNumber=" + emergencyCNumber + ", passportNum=" + passportNum + ", passDateofissue="
				+ passDateofissue + ", passDateofexpiry=" + passDateofexpiry + ", educationalQualification="
				+ educationalQualification + ", university=" + university + ", passingyear=" + passingyear + "]";
	}
	
	
	
	
}
