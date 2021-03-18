package common;

public class Person {
    private int age;
    private String name;
    public Person(String name_in, int age_in){
        age = age_in;
        name = name_in;
    }
    public void set_name(String name1){
        name = name1;
    }
    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
}

class Student extends Person{
    public Student(String name_in, int age_in) {
        super(name_in, age_in);
    }
}
