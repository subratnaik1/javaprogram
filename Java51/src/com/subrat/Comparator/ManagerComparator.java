package com.subrat.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ManagerComparator {
void main() {
	Manager[]manager= {
			new Manager(222,"Scott"),
			new Manager(111,"zebra"),
			new Manager(222,"aladin"),			
	};
	Comparator<Manager> cmpId=new Comparator<Manager>() {

		@Override
		public int compare(Manager m1, Manager m2) {
			return Integer.compare(m1.id(), m2.id());
		}		
	};
	Arrays.sort(manager, cmpId);
	for(Manager mgr:manager) {
		IO.println(mgr);		
	}
	//by using lambda//
	Comparator<Manager> cmpName=(m1,m2)->m1.name().compareTo(m2.name());
	Arrays.sort(manager,cmpName);
	
	for(Manager mgr:manager) {
		IO.println(mgr);	
}
}
}
