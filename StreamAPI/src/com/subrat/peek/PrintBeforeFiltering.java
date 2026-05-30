package com.subrat.peek;

import java.util.List;

public class PrintBeforeFiltering {
public static void main(String[] args) {
	List<Integer>list=List.of(2,3,6,8,9);
	list.stream().peek(i->System.out.println("before filter"+i)).filter(num->num%2==0).forEach(n->IO.println("after filter"+n));;
}

}
