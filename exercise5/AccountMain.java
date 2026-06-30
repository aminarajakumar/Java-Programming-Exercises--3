package exercise5;

abstract class BankAccount{
abstract void calculateInterest();
void displayBankName(){
System.out.println("SBI Bank");
}
}

class SavingsAccount extends BankAccount{
void calculateInterest(){
System.out.println("Savings Account Interest: 5%");
}
}

class CurrentAccount extends BankAccount{
void calculateInterest(){
System.out.println("Current Account Interest: 2%");
}
}

public class AccountMain{
public static void main(String args[]){
SavingsAccount s=new SavingsAccount();
CurrentAccount c=new CurrentAccount();
s.displayBankName();
s.calculateInterest();
c.displayBankName();
c.calculateInterest();
}
}