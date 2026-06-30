package exercise4;

class Person{
String name;
int age;
Person(String name,int age){
this.name=name;
this.age=age;
}
}

class Student extends Person{
int rollNo;
String department;
Student(String name,int age,int rollNo,String department){
super(name,age);
this.rollNo=rollNo;
this.department=department;
}
void display(){
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Roll No: "+rollNo);
System.out.println("Department: "+department);
}
}

public class Main{
public static void main(String args[]){
Student s=new Student("Amina",19,105,"CY");
s.display();
}
}