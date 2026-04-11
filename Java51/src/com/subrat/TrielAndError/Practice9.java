package com.subrat.TrielAndError;

import java.util.Objects;

public class Practice9 {

	public static void main(String... args) {
		IO.println(inp("subrat","naik"));

	}

	public static String inp(String ...a) {

		String name = " ";
		for(int i=0;i<a.length;i++) {
			name+=String.valueOf(a[i]);
		}
		return name;
	}
}
