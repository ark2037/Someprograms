package ai.ineuron.cards;

public class PaymentaProcess {
private ICards payment;
 
public PaymentaProcess(ICards payment) {
	this.payment=payment;
}

public boolean doThePayment(Double bill) {
	return payment.payingBill(bill);
}
}
