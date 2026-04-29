package com.subrat.array;

public class UnionOfSortedArrays {
public static void main(String[]args) {
    int arr1[]=new int[]{1,2,4};
    int arr2[]=new int[]{2,3,4};
    int newArr[]=new int[arr1.length+arr2.length];
    
    for(int i=0;i<arr1.length;i++){
        newArr[i]=arr1[i];
    }
     int k=0;
     for(int j=arr1.length;j<newArr.length;j++){
        newArr[j]=arr2[k];
        k++;
    }
    for(int i=0;i<newArr.length;i++){
        boolean unique=true;
        for(int j=i+1;j<newArr.length;j++){
            if(newArr[i]==newArr[j]){
              unique=false;  
              break;
            }
        }
    if(unique){
    System.out.println(newArr[i]);
    }
    }
}
}
