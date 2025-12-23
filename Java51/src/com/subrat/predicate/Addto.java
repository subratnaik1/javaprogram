package com.subrat.predicate;

import java.util.function.BiConsumer;

public class Addto {
void main() {
Integer a=Integer.parseInt(IO.readln("enter first number"));
Integer b=Integer.parseInt(IO.readln("enter second number"));

BiConsumer<Integer,Integer> sum=(c,d)->System.out.println(c+d);
sum.accept(a, b);

}
}
