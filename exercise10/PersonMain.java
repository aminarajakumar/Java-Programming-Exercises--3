package exercise10;

abstract class Person{
abstract void displayDetails();
}

interface SalaryCalculation{
void calculateSalary();
}

class Employee extends Person implements SalaryCalculation{
int employeeId=101;
String employeeName="Amina";
double salary=45000;

void displayDetails(){
System.out.println("Employee ID: "+employeeId);
System.out.println("Employee Name: "+employeeName);
}

public void calculateSalary(){
System.out.println("Salary: "+salary);
}
}

public class PersonMain{
public static void main(String args[]){
Employee e=new Employee();
e.displayDetails();
e.calculateSalary();
}
}