package exercise9;

class Employee{
int employeeId;
String employeeName;
double salary;
Employee(int employeeId,String employeeName,double salary){
this.employeeId=employeeId;
this.employeeName=employeeName;
this.salary=salary;
}
}
public class ArrayMain{
public static void main(String args[]){
Employee emp[]=new Employee[5];
emp[0]=new Employee(101,"Amina",25000);
emp[1]=new Employee(102,"Ayush",35000);
emp[2]=new Employee(103,"Sanshia",40000);
emp[3]=new Employee(104,"Aaryan",28000);
emp[4]=new Employee(105,"Ananya",50000);
for(int i=0;i<emp.length;i++){
if(emp[i].salary>30000){
System.out.println("Employee ID: "+emp[i].employeeId);
System.out.println("Employee Name: "+emp[i].employeeName);
System.out.println("Salary: "+emp[i].salary);
}
}
}
}