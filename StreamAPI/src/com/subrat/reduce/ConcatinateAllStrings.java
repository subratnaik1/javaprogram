package com.subrat.reduce;

import java.util.List;
import java.util.Optional;

public class ConcatinateAllStrings {
public static void main(String[] args) {
List	<String>list=List.of("Subrat","sritam","rahul");
Optional<String> reduce = list.stream().reduce((str1,str2)->str1+str2);
System.out.println(reduce.get());
}
}
