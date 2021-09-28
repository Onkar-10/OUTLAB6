import java.util.*;
public class Student extends Person
{
    int rollno1;
    ArrayList<Teacher> list_guides = new ArrayList<>();
    Student(String name,int age,int rollno)  {
        super(name,age);
        name1=name;
        age1=age;
        rollno1=rollno;
    }
    Student(Person p,int rollno) {
        super(p.name1,p.age1);
        name1=p.name1;
        age1=p.age1;
        rollno1=rollno;
    }
    public int getRollNo(){
        return rollno1;
    }
    public void addTeacher(Teacher teachr){    //ques mei teachr hi heii so chill
        list_guides.add(teachr);
    }
    public ArrayList<Teacher> getTeachers(){
        return list_guides ;
    }
    public void intro(){
        System.out.println("I am a Teacher, "+name1+", "+age1+", "+rollno1);
    }
}
