package Test1;

import java.util.*;

import static com.sahitya.package1.TestClass.shareware;

public class Person {
    Person()
    {
        System.out.println("Person class Constructor");
    }
}


interface Disk {
    String name = null;
    int get_brand();
}

class SanDisk implements Disk {
    String name;
    public int get_brand(){
        return 0;
    }
}

class HDDisk implements Disk {
    String name;
    public int get_brand(){
        return 1;
    }
}
interface Rand {
    String name = null;
    int get_brand();
}


class SamRand implements  Rand {
    String name;
    public int get_brand(){
        return 1;
    }
}

class SonyRand implements Rand {
    String name;
    public int get_brand(){
        return 0;
    }
}



interface Laptop {
    Disk disk1 = null;
    Rand ram1 = null;
}

class AppleLaptop implements Laptop {
    public Disk disk1;
    public Rand ram1;
}



class Student extends Person {
    Student()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

/* Driver program to test*/
class Test {
    public static void main(String[] args)
    {
        Student s = new Student();

        AppleLaptop lap1 = new AppleLaptop();

        lap1.disk1 = new HDDisk();
        lap1.ram1 = new SonyRand();

        System.out.println(lap1.disk1.get_brand());


        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Cars", 46);
        map1.put("dog", 473);
        map1.put("fat", 3473);
        map1.put("doggy", 283);

        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);


    }
}

