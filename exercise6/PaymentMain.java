package exercise6;

interface Payment{
void makePayment(double amount);
}

class UPIPayment implements Payment{
public void makePayment(double amount){
System.out.println("UPI Payment: "+amount);
}
}

class CardPayment implements Payment{
public void makePayment(double amount){
System.out.println("Card Payment: "+amount);
}
}

public class PaymentMain{
public static void main(String args[]){
UPIPayment u=new UPIPayment();
CardPayment c=new CardPayment();
u.makePayment(1000);
c.makePayment(2000);
}
}