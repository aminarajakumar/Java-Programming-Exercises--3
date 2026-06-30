package exercise11;

public class TrimMain{
public static void main(String args[]){
String name=" arul antran vijay ";
String email="arul@company.com";
String department="Computer Science";

String trimmedName=name.trim();

System.out.println("Name: "+trimmedName);
System.out.println("Uppercase: "+trimmedName.toUpperCase());
System.out.println("Lowercase: "+trimmedName.toLowerCase());
System.out.println("Length: "+trimmedName.length());
System.out.println("Company Domain: "+email.endsWith("@company.com"));
System.out.println("Starts with A: "+trimmedName.toUpperCase().startsWith("A"));
System.out.println("First Occurrence of a: "+trimmedName.indexOf('a'));
System.out.println("Replace Spaces: "+trimmedName.replace(' ','_'));
System.out.println("First Four Characters: "+trimmedName.substring(0,4));

String anotherDepartment="Computer Science";
System.out.println("Department Comparison: "+department.equals(anotherDepartment));
}
}