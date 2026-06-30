package exercise12;

public class StringMain{
public static void main(String args[]){
StringBuffer username=new StringBuffer("JavaUser");

username.append("123");
System.out.println("After Append: "+username);

username.insert(4,"Pro");
System.out.println("After Insert: "+username);

username.replace(7,11,"Developer");
System.out.println("After Replace: "+username);

username.delete(username.length()-3,username.length());
System.out.println("After Delete: "+username);

username.reverse();
System.out.println("After Reverse: "+username);

System.out.println("Length: "+username.length());
System.out.println("Capacity: "+username.capacity());
System.out.println("Character at Index 2: "+username.charAt(2));

username.setCharAt(0,'X');
System.out.println("After Change: "+username);

String str=username.toString();
System.out.println("String Value: "+str);
}
}