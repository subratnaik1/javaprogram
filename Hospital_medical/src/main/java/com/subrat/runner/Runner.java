package com.subrat.runner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.subrat.HospitalMedicalApplication;
import com.subrat.entity.PatientRecord;
import com.subrat.repositary.PatientRepos;

@Component
public class Runner implements CommandLineRunner {

    private final HospitalMedicalApplication hospitalMedicalApplication;
	@Autowired
	private PatientRepos repo;

    Runner(HospitalMedicalApplication hospitalMedicalApplication) {
        this.hospitalMedicalApplication = hospitalMedicalApplication;
    }

	@Override
	public void run(String... args) throws Exception {
		IO.println("1 save patient");
		IO.println("2 retrive patient");
		int choice = Integer.parseInt(IO.readln("enter your choice"));
		switch(choice) {
		case 1->{
			PatientRecord pc=new PatientRecord("rahul");
			byte[] allBytes = Files.readAllBytes(Paths.get("E:\\Adobe Draw\\PicsArt_01-17-09.08.25.jpg"));
			pc.setMedicalReport(allBytes);
			String diagnosis=new String(Files.readAllBytes(Paths.get("E:\\resume\\subrat resume.pdf")));
			pc.setDiagnosis(diagnosis);
			PatientRecord p=repo.save(pc);
			IO.println("inserted");
		}
		case 2->{
			System.out.println("patient Imformation Retrieved");
			Optional<PatientRecord> byId = repo.findById(101l);
			PatientRecord e = byId.get();
		    System.out.println(e.getPatientName());
		  	 Files.write(Paths.get("C:\\Users\\91814\\OneDrive\\Pictures\\image.jpg"), e.getMedicalReport());
		    Files.write(Paths.get("C:\\Users\\91814\\OneDrive\\Pictures\\Screenshots\\Desktop\\Text.txt"), e.getDiagnosis().getBytes());		   
		   System.out.println("SuccessFully Retrieved");
		}
		case 3->{
			repo.deleteAll();
			IO.println("deleted");
		}
		}
	}

}
