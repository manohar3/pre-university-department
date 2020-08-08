package test.puc.pdf.controller;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.puc.pdf.model.Application;
import test.puc.pdf.repository.ApplicationRepository;
import test.puc.pdf.session.SessionManager;

@RestController
@RequestMapping("/download")

public class DownloadResource {

	private static final String EXTERNAL_FILE_PATH = "C:/fileDownloadExample/";
	
	@Autowired
	private ApplicationRepository applicationRepository;

	@RequestMapping("/application/{admissionNumber}")
	public void downloadPDFResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("admissionNumber") String admissionNumber) throws IOException {
		File file = new File(System.getProperty("file.dir")+"/application_"+ admissionNumber+".pdf");
		if (file.exists()) {

			//get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				//unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);

			/**
			 * In a regular HTTP response, the Content-Disposition response header is a
			 * header indicating if the content is expected to be displayed inline in the
			 * browser, that is, as a Web page or as part of a Web page, or as an
			 * attachment, that is downloaded and saved locally.
			 * 
			 */

			/**
			 * Here we have mentioned it to show inline
			 */
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));

			 //Here we have mentioned it to show as attachment
			 //response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) file.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

			FileCopyUtils.copy(inputStream, response.getOutputStream());

		} else {
			throw new IOException(MessageFormat.format("Appliction with adminission number {0} does not exists", new Object[] {admissionNumber}));
		}
	}
	
	@RequestMapping("/report")
	public void generateReport(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if(SessionManager.isUserAdmin(request.getCookies())) {
		File file = new File("applicationsreport.csv");
		if (true) {
			Iterator<Application> itr = applicationRepository.findAll().iterator();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			while(itr.hasNext()) {
				Application application=itr.next();
				StringBuilder builder = new StringBuilder();
				builder.append(application.getId()).append(",");
				builder.append(application.getAdmissionNumber()).append(",");
				builder.append(application.getSatsNumber()).append(",");
				builder.append(application.getLanguages()).append(",");
				builder.append(application.getMedium()).append(",");
				builder.append(application.getSection()).append(",");
				builder.append(application.getCategory()).append(",");
				builder.append(application.getApplicantName()).append(",");
				builder.append(application.getDobDay()).append(",");
				builder.append(application.getDobMonth()).append(",");
				builder.append(application.getDobYear()).append(",");
				builder.append(application.getGender()).append(",");
				builder.append(application.getPlaceofBirth()).append(",");
				builder.append(application.getStateofBirth()).append(",");
				builder.append(application.getDistrictofBirth()).append(",");
				builder.append(application.getTalukofBirth()).append(",");
				
				builder.append(application.getNationality()).append(",");
				builder.append(application.getReligion()).append(",");
				builder.append(application.getCaste()).append(",");
				builder.append(application.getSubCaste()).append(",");
				
				builder.append(application.getPermanentddress()).append(",");
				builder.append(application.getLocalAddress()).append(",");
				builder.append(application.getMobileno()).append(",");
				builder.append(application.getEmail()).append(",");
				
				builder.append(application.getNameoffather()).append(",");
				builder.append(application.getNameofmother()).append(",");
				builder.append(application.getAddressofguardian()).append(",");
				builder.append(application.getAnnualIncome()).append(",");
				builder.append(application.getIsIncomeCertificateEnclosed()).append(",");
				
				builder.append(application.getNameofschoolstudied()).append(",");
				builder.append(application.getRegNumber()).append(",");
				builder.append(application.getMonthofExamPassed()).append(",");
				builder.append(application.getYearofExamPassed()).append(",");
				builder.append(application.getLanugage1st()).append(",");
				builder.append(application.getLanugage2nd()).append(",");	
				builder.append(application.getLanugage3rd()).append(",");
				builder.append(application.getScience()).append(",");
				builder.append(application.getMaths()).append(",");
				builder.append(application.getSocial()).append(",");
				builder.append(application.getMarksLanugage1st()).append(",");
				builder.append(application.getMarksLanugage2nd()).append(",");
				builder.append(application.getMarksLanugage3rd()).append(",");
				builder.append(application.getMarksMaths()).append(",");
				builder.append(application.getMarksScience()).append(",");
				builder.append(application.getMarksSocial()).append(",");
				
				builder.append(application.getResult()).append(",");
				builder.append(application.getPercentage()).append(",");
				builder.append(application.getExtracurricular()).append(",");
				
				builder.append(application.getExpectedpulanguage1()).append(",");
				builder.append(application.getExpectedpulanguage2()).append(",");
				builder.append(application.getExpectedpusubject1()).append(",");
				builder.append(application.getExpectedpusubject2()).append(",");
				builder.append(application.getExpectedpusubject3()).append(",");
				builder.append(application.getExpectedpusubject4()).append(",");
				builder.append(application.getExpectedmedium()).append(",");
				
				writer.write(builder.toString());
				writer.flush();
			}
			writer.close();
			String mimeType = "application/octet-stream";
			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));
			response.setContentLength((int) file.length());
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());
		}
		}else {
			throw new IOException("You dont have permission");
		}
	}
}