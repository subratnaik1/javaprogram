package com.subrat.inharitance;

class ClassA 
{
    static int a = 5;

    static 
    {
        System.out.println("Static Block :"+a);
        a = 10;
    }
}

public class Execut 
{
    static 
    {
        System.out.println("Example5 Static Block");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main Method");
        System.out.println("Class A a :" + ClassA.a);
    }
}
