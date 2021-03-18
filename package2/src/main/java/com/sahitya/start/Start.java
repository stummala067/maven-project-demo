package com.sahitya.start;

import common.Person;

class Parent {
    // private methods are not overridden
    public int pid;
    public int cid;

    Parent(int a, int b){
        this.pid = a;
        this.cid = b;
    }

    public void m1()
    {
        System.out.println("From parent m1()");
    }
    public static void m1(int a){
        System.out.println("From parent m1() int " + a);
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
    private static void m3(){
        System.out.println("From parent m3()");
    }
}


class Child extends Parent{
    Child(int a, int b) {
        super(a, b);
    }

    // new m1() method
    // unique to Child class
    public static void m1(int a)
    {
        System.out.println("From child m1() float "+ a);
    }

    public void m1(String a){
        System.out.println("From Child m1() int" +a);
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }

    public void m3(){
        System.out.println("From child m3()");
    }

    public void m4(){
        System.out.println("Only defined in child class");
    }
}


public class Start {
    public static void main(String[] args) {
        Parent obj1;
        obj1 = new Parent(2,3);
        Parent.m1(23);
        obj1.m1();
        obj1.m2();
//        obj1.m3();

        Parent obj2 = new Child(3,4 );
        obj2.m1();
        obj2.m2();
//        obj2.m3();
//        obj2.m4();

        Child obj3;
        obj3= new Child(3,4 );
        Child.m1(34);
        Child.m1(34);
        obj3.m1();
        obj3.m1("sanity");
        obj3.m2();
        obj3.m3();
        obj3.m4();

        Person p1 = new Person("aditya", 23);
        System.out.println(p1.get_name());




    }
}
