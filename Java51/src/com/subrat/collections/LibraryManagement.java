package com.subrat.collections;

import java.util.Scanner;
import java.util.Vector;

record Book(Integer id, String title, String author) {

}

class Library {
	public void displayAvailableBooks(Vector<Book> b1) {
		for (Book bk : b1) {
			IO.println(bk);
		}
	}

	public void issueBook(Vector<Book> is, Scanner sc) {
		System.out.println("enter id of thr book you want to issue");
		int id = sc.nextInt();
		for (Book bk : is) {
			if (bk.id() == id) {
				IO.println(bk);
			}
		}
	}

	public void searchBook(Vector<Book> s1, Scanner sc) {
		System.out.println("Enter keyword to search by title or author:");
		String keword = sc.nextLine();
		boolean isFound=false;
		for (Book bk : s1) {
			if (bk.author().equalsIgnoreCase(keword) || bk.title().equalsIgnoreCase(keword)) {
				IO.println("Found: " + bk);
				isFound=true;
				break;
			} 
		}
		if(isFound==false) {
			IO.println("not found");
			
		}
	}
}

public class LibraryManagement {
	void main() {
		Scanner sc = new Scanner(System.in);
		IO.println("1-Display Books Available in the Library :\n" + "2) Search a Book in the Library :\n"
				+ " 3) Issue a Book from the Library :\n" + " 4) Exit from the application :)");

		Vector<Book> v1 = new Vector<>();
		v1.add(new Book(101, "Core Java", "Mr James"));
		v1.add(new Book(102, "Adv java", "Mr robert"));
		v1.add(new Book(103, "Head Fast java", "Miaa kathy serria"));

		Library lb = new Library();
		while (true) {
			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			if (choice == 1) {
				lb.displayAvailableBooks(v1);
			} else if (choice == 2) {
				lb.issueBook(v1, sc);
			} else if (choice == 3) {
				lb.searchBook(v1, sc);
			} else if (choice == 4) {
				IO.println("thank you for visiting");
				System.exit(0);
			}
		}
	}
}
