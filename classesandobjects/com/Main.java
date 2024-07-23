package classesandobjects.com;

import java.util.Scanner;

class Student
{
    String studentId;
    String name;
    int age;
    char grade;

    void setFields(String studentId,String name,int age,char grade)
    {
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    String getFields()
    {
        return studentId+" "+name+" "+age+" "+grade;
    }

}

public class Main
{
    public static void main(String [] args)
    {
        //if details need to be taken from user
//        String name;
//        String studentId;
//        int age;
//        char grade;
//        Scanner sc=new Scanner(System.in);
//        Array of objects
//        Student[] students=new Student[5];
//        students[0].setFields("S1","Sandra",22,'A');
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();
        student1.setFields("S1","Sandra",22,'A');
        student2.setFields("S2","Swetha",22,'B');
        student3.setFields("S3","Aswathi",23,'B');
        student4.setFields("S4","Gayathri",22,'A');
        student5.setFields("S5","Lisa",25,'C');
        System.out.println("Details of Students");
        System.out.println(student1.getFields());
        System.out.println(student2.getFields());
        System.out.println(student3.getFields());
        System.out.println(student4.getFields());
        System.out.println(student5.getFields());

    }
}
