
package com.subrat.collections;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class CollectionDemo {

	record Student() {};
	record Employee() {};
	record Player() {};
	public static void main(String[] args) {
		
    Vector v=new Vector();//before collection came Vector class available in java.util package from JDK 1.0.
    v.add(new Student());
    v.add(new Employee());
    v.add(new Player());
    v.add(12);//12 is premetive but in collections we use only objects
    v.add(Integer.valueOf(12));//so internally compiler is coverting it into object(AUTOBOXING).  
  
    IO.println(v);
    IO.println("\n"+v.clone());
    
    Vector user=new Vector();
    user.add("subrat@gmail.com");
    user.add("raj@gmail.com");
    user.add("scott@gmail.com");
   IO.println(user);
    Map map=new Hashtable();//hashtable extends dictionary 
  
    map.put("subrat@gmail","sn123");
    IO.println(map);
	}
	Object obj[]=new Object[5];
	
}

// IQ----legacy classes?
//single objects---vector class 
//                  stack class
//group objects--(1.0)Dictionary<k,v>  
//                 (1.0) Hashtable<k,v>   
//                 (1.0) properties.(no key,no value)only supports String type key,string type value.
//Retrival of objects--Enumereration


