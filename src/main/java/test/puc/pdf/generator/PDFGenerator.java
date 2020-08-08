package test.puc.pdf.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import com.itextpdf.html2pdf.HtmlConverter;

public class PDFGenerator {
	
	public static void generate(String admissionno, String statsno, String language, String medium, String section, String category) throws Exception {
		String templatefile = System.getProperty("file.dir") + "/puc.html";
		String output = System.getProperty("file.dir")+ "/application";
		BufferedReader reader = new BufferedReader(new FileReader(templatefile));
		String line;
		StringBuilder htmlbuilder = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			if(line.contains("adm_no")) {
				line = line.replace("name=\"adm_no\"", "name=adm_no value=" + admissionno); 
			}
			
			if(line.contains("sats_no")) {
				line = line.replace("name=\"sats_no\"", "name=sats_no value=" + statsno);
			}
			
			if(line.contains("lang")) {
				line = line.replace("name=\"lang\"", "name=lang value=" + language);
			}
			
			if(line.contains("medium")) {
				line = line.replace("name=\"medium\"", "name=medium value=" + medium);
			}

			if(line.contains("section")) {
				line = line.replace("name=\"section\"", "name=section value=" + section);
			}
			
			if(line.contains("res")) {
				line = line.replace("name=\"res\"", "name=res value=" + category);
			}
			
			htmlbuilder.append(line).append("\n");
        }
		reader.close();
		HtmlConverter.convertToPdf(htmlbuilder.toString(), new FileOutputStream(new File(output+"_"+admissionno+".pdf"))); 
	}
}
