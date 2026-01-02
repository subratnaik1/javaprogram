package com.subrat.argument;

import java.util.Arrays;

public class RemoveElement {
	void main(){
		int[] arr = {10, 20, 30, 40, 50};
		int index = 2;
		int [] NewArr=new int[4];
		for(int i=0;i<=index-1;i++) {
			NewArr[i]=arr[i];
	}	
		for(int i=index;i<NewArr.length;i++) {
			NewArr[i]=arr[i];
	}
		IO.println(Arrays.toString(NewArr));
	}
}
