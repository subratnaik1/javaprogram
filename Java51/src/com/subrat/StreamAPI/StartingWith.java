package com.subrat.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StartingWith {
	void main() {
    List<String> listOfName=List.of("subrat","subash","raj","shubham");
    
    Set<String>collect=listOfName.stream()
               .filter(name->name.startsWith("s"))
                                     .collect(Collectors.toSet());
    IO.println(collect);
	}
}
