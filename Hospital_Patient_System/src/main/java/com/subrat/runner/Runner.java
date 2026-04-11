package com.subrat.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Patient;
import com.subrat.repositary.Irepo;
import com.subrat.service.Iservice;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice iserv;
	@Autowired
	private Irepo irepo;

	@Override
	public void run(String... args) throws Exception {
    Patient a=new Patient(1,"subrat","fever",20);
    Patient b=new Patient(2,"rahul","cough",30);
    Patient c=new Patient(3,"ganesh","a",14);
    Patient d=new Patient(4,"sritam","b",26);
    Patient e=new Patient(5,"jafar","fejhb",30);
    Patient f=new Patient(6,"subash","fever",21);
    List<Patient> list=List.of(a,b,c,d,e,f);
   
    irepo.saveAll(list);
    iserv.findByDisease("fever").forEach(IO::println);
    iserv.findByAgeGreaterThan(20).forEach(IO::println);
    iserv.findByNameContaining("s").forEach(IO::println);
    
    iserv.getPatientByPageAndSort(0, 2, true, "name").forEach(IO::println);
	}

}
