package test.puc.pdf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applications")
public class Application {

	private String admissionNumber;
	private String satsNumber="";
	private String languages="";
	private String medium="";
	private String section="";
	private String category="";

	private String applicantName="";

	private String dobDay="";
	private String dobMonth="";
	private String dobYear="";
	private String gender="";
	private String placeofBirth="";
	private String stateofBirth="";
	private String districtofBirth="";
	private String talukofBirth="";
	private String nationality="";
	private String religion="";
	private String caste="";
	private String subCaste="";
	private String permanentddress="";
	private String localAddress="";

	private String mobileno="";
	private String aadharno="";
	private String email="";

	private String nameoffather="";
	private String nameofmother="";

	private String addressofguardian="";
	
	/* page 2 */
	private String annualIncome="";
	private String isIncomeCertificateEnclosed="";

	private String nameofschoolstudied="";
	
	private String regNumber="";
	private String monthofExamPassed="";
	private String yearofExamPassed="";
	
	private String physicallyChallenged="";
	
	private String lanugage1st="";
	private String lanugage2nd="";
	private String lanugage3rd="";
	private String science="";
	private String maths="";
	private String social="";
	
	private String marksLanugage1st="";
	private String marksLanugage2nd="";
	private String marksLanugage3rd="";
	private String marksScience="";
	private String marksMaths="";
	private String marksSocial="";
	
	
	private String result="";
	private String percentage="";
	
	private String extracurricular="";
	private String expectedpulanguage1="";
	private String expectedpulanguage2="";
	private String expectedpusubject1="";
	private String expectedpusubject2="";
	private String expectedpusubject3="";
	private String expectedpusubject4="";
	private String expectedmedium="";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getSatsNumber() {
		return satsNumber;
	}

	public void setSatsNumber(String satsNumber) {
		this.satsNumber = satsNumber;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlaceofBirth() {
		return placeofBirth;
	}

	public void setPlaceofBirth(String placeofBirth) {
		this.placeofBirth = placeofBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getPermanentddress() {
		return permanentddress;
	}

	public void setPermanentddress(String permanentddress) {
		this.permanentddress = permanentddress;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameoffather() {
		return nameoffather;
	}

	public void setNameoffather(String nameoffather) {
		this.nameoffather = nameoffather;
	}

	public String getNameofmother() {
		return nameofmother;
	}

	public void setNameofmother(String nameofmother) {
		this.nameofmother = nameofmother;
	}

	public String getAddressofguardian() {
		return addressofguardian;
	}

	public void setAddressofguardian(String addressofguardian) {
		this.addressofguardian = addressofguardian;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getNameofschoolstudied() {
		return nameofschoolstudied;
	}

	public void setNameofschoolstudied(String nameofschoolstudied) {
		this.nameofschoolstudied = nameofschoolstudied;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getLanugage1st() {
		return lanugage1st;
	}

	public void setLanugage1st(String lanugage1st) {
		this.lanugage1st = lanugage1st;
	}

	public String getLanugage2nd() {
		return lanugage2nd;
	}

	public void setLanugage2nd(String lanugage2nd) {
		this.lanugage2nd = lanugage2nd;
	}

	public String getLanugage3rd() {
		return lanugage3rd;
	}

	public void setLanugage3rd(String lanugage3rd) {
		this.lanugage3rd = lanugage3rd;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getDobDay() {
		return dobDay;
	}

	public void setDobDay(String dobDay) {
		this.dobDay = dobDay;
	}

	public String getDobMonth() {
		return dobMonth;
	}

	public void setDobMonth(String dobMonth) {
		this.dobMonth = dobMonth;
	}

	public String getDobYear() {
		return dobYear;
	}

	public void setDobYear(String dobYear) {
		this.dobYear = dobYear;
	}

	public String getStateofBirth() {
		return stateofBirth;
	}

	public void setStateofBirth(String stateofBirth) {
		this.stateofBirth = stateofBirth;
	}

	public String getDistrictofBirth() {
		return districtofBirth;
	}

	public void setDistrictofBirth(String districtofBirth) {
		this.districtofBirth = districtofBirth;
	}

	public String getTalukofBirth() {
		return talukofBirth;
	}

	public void setTalukofBirth(String talukofBirth) {
		this.talukofBirth = talukofBirth;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getIsIncomeCertificateEnclosed() {
		return isIncomeCertificateEnclosed;
	}

	public void setIsIncomeCertificateEnclosed(String isIncomeCertificateEnclosed) {
		this.isIncomeCertificateEnclosed = isIncomeCertificateEnclosed;
	}

	public String getMonthofExamPassed() {
		return monthofExamPassed;
	}

	public void setMonthofExamPassed(String monthofExamPassed) {
		this.monthofExamPassed = monthofExamPassed;
	}

	public String getYearofExamPassed() {
		return yearofExamPassed;
	}

	public void setYearofExamPassed(String yeaofofExamPassed) {
		this.yearofExamPassed = yeaofofExamPassed;
	}

	public String getPhysicallyChallenged() {
		return physicallyChallenged;
	}

	public void setPhysicallyChallenged(String physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}

	public String getMarksLanugage1st() {
		return marksLanugage1st;
	}

	public void setMarksLanugage1st(String marksLanugage1st) {
		this.marksLanugage1st = marksLanugage1st;
	}

	public String getMarksLanugage2nd() {
		return marksLanugage2nd;
	}

	public void setMarksLanugage2nd(String marksLanugage2nd) {
		this.marksLanugage2nd = marksLanugage2nd;
	}

	public String getMarksLanugage3rd() {
		return marksLanugage3rd;
	}

	public void setMarksLanugage3rd(String marksLlanugage3rd) {
		this.marksLanugage3rd = marksLlanugage3rd;
	}

	public String getMarksScience() {
		return marksScience;
	}

	public void setMarksScience(String marksScience) {
		this.marksScience = marksScience;
	}

	public String getMarksMaths() {
		return marksMaths;
	}

	public void setMarksMaths(String marksMaths) {
		this.marksMaths = marksMaths;
	}

	public String getMarksSocial() {
		return marksSocial;
	}

	public void setMarksSocial(String marksMocial) {
		this.marksSocial = marksMocial;
	}

	public String getExtracurricular() {
		return extracurricular;
	}

	public void setExtracurricular(String extracurricular) {
		this.extracurricular = extracurricular;
	}

	public String getExpectedpulanguage1() {
		return expectedpulanguage1;
	}

	public void setExpectedpulanguage1(String expectedpulanguage1) {
		this.expectedpulanguage1 = expectedpulanguage1;
	}

	public String getExpectedpulanguage2() {
		return expectedpulanguage2;
	}

	public void setExpectedpulanguage2(String expectedpulanguage2) {
		this.expectedpulanguage2 = expectedpulanguage2;
	}

	public String getExpectedpusubject1() {
		return expectedpusubject1;
	}

	public void setExpectedpusubject1(String expectedpusubject1) {
		this.expectedpusubject1 = expectedpusubject1;
	}

	public String getExpectedpusubject2() {
		return expectedpusubject2;
	}

	public void setExpectedpusubject2(String expectedpusubject2) {
		this.expectedpusubject2 = expectedpusubject2;
	}

	public String getExpectedpusubject3() {
		return expectedpusubject3;
	}

	public void setExpectedpusubject3(String expectedpusubject3) {
		this.expectedpusubject3 = expectedpusubject3;
	}

	public String getExpectedpusubject4() {
		return expectedpusubject4;
	}

	public void setExpectedpusubject4(String expectedpusubject4) {
		this.expectedpusubject4 = expectedpusubject4;
	}

	public String getExpectedmedium() {
		return expectedmedium;
	}

	public void setExpectedmedium(String expectedmedium) {
		this.expectedmedium = expectedmedium;
	}
	
	Application() {}
}