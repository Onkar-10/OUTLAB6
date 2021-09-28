import java.io.*;
import java.util.*;

public class Teacher extends Person
{
    ArrayList<Student> list_students = new ArrayList<>();
    int salary1;
    Teacher(String name,int age,int salary)  {
        super(name,age) ;
        name1=name;
        age1=age;
        salary1=salary;
    }
    Teacher(String name,int age){
        super(name,age) ;
        name1=name;
        age1=age;
        salary1=10000;
    }
    Teacher(Person p,int salary){
        super(p.name1,p.age1) ;
        name1=p.name1;
        age1=p.age1;
        salary1=salary;
    }
    public int getSalary(){
        return salary1;
    }
    
    public void addStudent(Student stud){
        list_students.add(stud);
    }

    public ArrayList<Student> getStudents(){
        return list_students;
    }
    public void intro(){
        System.out.println("I am a Teacher, "+name1+", "+age1+", "+salary1);
    }
}
