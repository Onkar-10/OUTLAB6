import java.util.*;
public class Person
{
    String name1;
    int age1;
    Person(String name,int age){
        name1=name;
        age1=age;
    }
    public String getName(){
        return name1;
    }
    public int getAge(){
        return age1;
    }
    public void intro(){
        System.out.println("I am a person, "+name1+", "+age1);
    }
}
