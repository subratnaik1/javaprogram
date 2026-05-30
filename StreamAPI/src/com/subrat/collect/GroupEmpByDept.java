package com.subrat.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employe(String name,String dept) {
	
}
public class GroupEmpByDept {
public static void main(String[] args) {
	Employe e1=new Employe("subrat","java");
	Employe e2=new Employe("sritam","java");
	Employe e3=new Employe("rahul","css");
	List<Employe>list=List.of(e1,e2,e3);
	Map<String, List<Employe>> collect = list.stream().collect(Collectors.groupingBy(e->e.dept()));
	System.out.println(collect);
}}