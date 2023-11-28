package ai.ineuron.main;
import ai.ineuron.cards.*;
public class Main {
public static void main(String[] args) {
	PaymentaProcess pp = new PaymentaProcess(new CreditCard());
	
	boolean status=pp.doThePayment(100.0);
	if(status)
		System.out.println("Payment sucess come again!");
	else
		System.out.println("Payment failed do you have money? or dishes washing");

}
}
