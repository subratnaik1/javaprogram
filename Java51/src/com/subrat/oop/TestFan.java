package com.subrat.oop;

class TestFan {

    int x = m1();   // NSV1

    int m1() {
        System.out.println("NSV1 is executed");
        return 10;                                                                     
    }

    {   // NSB1
        System.out.println("NSB1 is executed");
    }

    TestFan () {
        System.out.println("NPC is executed");
    }

    TestFan (String s) {
        System.out.println("SPC is executed");
    }

    {   // NSB2
        System.out.println("NSB2 is executed");
    }

    int y = m2();   // NSV2

    int m2() {
        System.out.println("NSV2 is executed");
        return 20;
    }

    int z = m3();   // NSV3

    int m3() {
        System.out.println("NSV3 is executed");
        return 30;
    }

    {   // NSB3
        System.out.println("NSB3 is executed");
    }

    void m4() {
        System.out.println("NSM is executed");
    }

    public static void main(String[] args) {
        System.out.println("MM execution start");

        TestFan  t1 = new TestFan ();
        TestFan  t2 = new TestFan("HK");
        
        System.out.println(t1.equals(t2));

        System.out.println("MM execution end");
    }
}





