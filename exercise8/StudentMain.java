package exercise8;

interface College{
String collegeName="KCE";
static void displayCollege(){
System.out.println("College Name: "+collegeName);
}
}
class Student implements College{
int rollNo=105;
String name="Amina";
void display(){
System.out.println("Roll No: "+rollNo);
System.out.println("Name: "+name);
System.out.println("College Name: "+collegeName);
}
}
public class StudentMain{
public static void main(String args[]){
College.displayCollege();
Student s=new Student();
s.display();
}
}
