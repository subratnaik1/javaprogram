package com.subrat.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeSerialization {
void main() throws IOException {
	ArrayList<String> ListOfIceCream=new ArrayList<>();
	ListOfIceCream.add("vannila");
	ListOfIceCream.add("chocolate");
	ListOfIceCream.add("strawberry");
	
	//Serialization//
	String filepath="E:\\JAVA NOTES\\IceCream.txt";
	var fos=new FileOutputStream(filepath); //fileOutputStream write bytes to filepath(file)->store data
	var oos=new ObjectOutputStream(fos);
	
	try(fos;oos) {
		oos.writeObject(ListOfIceCream);
		IO.println("data stored successfully");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	//De-Serilisation
	var fin=new FileInputStream(filepath);
	var ois=new ObjectInputStream(fin);
	
	try(fin;ois){
		@SuppressWarnings("unchecked")
		ArrayList<String> icecreames=(ArrayList<String>) ois.readObject();
		IO.println(icecreames);;
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
}
}
