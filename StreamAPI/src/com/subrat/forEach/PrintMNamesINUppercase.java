package com.subrat.forEach;

import java.util.List;

public class PrintMNamesINUppercase {
public static void main(String[] args) {
	List <String>list=List.of("subrat","rahul","Sritam");
	list.stream().forEach(n->System.out.println(n.toUpperCase()));

}
}
