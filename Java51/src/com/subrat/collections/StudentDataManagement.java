package com.subrat.collections;

import java.util.*;

public class StudentDataManagement {
	void main() {
		HashMap<String, Integer> st = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Add Student");
		System.out.println("2-update marks");
		System.out.println("3-delete student");
		System.out.println("4-search student");
		System.out.println("5-display all students");
		System.out.println("6-show topper");
		System.out.println("7-show lowest scorer");
		System.out.println("8-show total and average marks");
		System.out.println("9-exit");
		System.out.println("enter your choice");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1 -> {
			System.out.println("enter name");
			String name = sc.nextLine();
			IO.println("enter marks:");
			int marks = Integer.parseInt(sc.nextLine());
			st.put(name, marks);
			System.out.println("Student added successfully");
		}
		case 2 -> {
			System.out.println("enter student name to update the marks:");
			String name = sc.nextLine();
			System.out.println("enter new marks:");
			int marks = Integer.parseInt(sc.nextLine());
			if (st.containsKey(name)) {
				st.put(name, marks);
				System.out.println("student updated");
			} else {
				System.out.println("student not found");
			}
		}
		case 3 -> {
			System.out.println("enter name to delete");
			String name = sc.nextLine();
			if (st.containsKey(name)) {
				st.remove(name);
				System.out.println("student deleted");
			} else {
				System.out.println("student not found");
			}
		}
		case 4 -> {
			System.out.println("enter name to search");
			String name = sc.nextLine();
			if (st.containsKey(name)) {
				System.out.println("marks:" + st.get(name));
			} else {
				System.out.println("student not found");
			}
		}
		case 5->{System.out.println("-----Student records----");
		for(Map.Entry<String , Integer>s:st.entrySet()) {
			IO.println(s.getKey()+"=>"+s.getValue());
		}
		}
		case 6->{
			
		}
		case 7->{
			
		}
		case 8->{
			
		}
		case 9->{
			System.exit(0);
		}

		}
	}
}
