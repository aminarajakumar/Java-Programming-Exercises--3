package exercise3;

class Employee{
void calculateSalary(){
System.out.println("Employee Salary");
}
}
class FullTimeEmployee extends Employee{
@Override
void calculateSalary(){
System.out.println("Full Time Employee Salary: 50000");
}
}
class PartTimeEmployee extends Employee{
@Override
void calculateSalary(){
System.out.println("Part Time Employee Salary: 20000");
}
}
public class EmployeeMain{
public static void main(String args[]){
FullTimeEmployee f=new FullTimeEmployee();
PartTimeEmployee p=new PartTimeEmployee();
f.calculateSalary();
p.calculateSalary();
}
}