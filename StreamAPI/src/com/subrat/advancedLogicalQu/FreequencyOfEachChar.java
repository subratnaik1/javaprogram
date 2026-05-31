package com.subrat.advancedLogicalQu;

public class FreequencyOfEachChar {
	public static void main(String[] args) {
		String str = "missisippy";
       str.toLowerCase()
                    .chars()
                        .distinct()
                          .forEach(ch->{ Long count=str.toLowerCase().chars().filter(c->c==ch).count();
                                     System.out.println((char)ch+"="+count);});
	}
}
