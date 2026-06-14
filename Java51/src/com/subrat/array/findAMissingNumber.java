package com.subrat.array;

public class findAMissingNumber {
public static void main(String[] args) {
    int arr[]={2,0,1,4,5};
     int n=arr.length;
     int sum=n*(n+1)/2;
    int actualSum=0;
    for(int a:arr) {
    	actualSum+=a;
    }
    int result=sum-actualSum;
System.out.println("missing number"+result);
}
}