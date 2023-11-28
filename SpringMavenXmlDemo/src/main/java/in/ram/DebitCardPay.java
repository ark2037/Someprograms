package in.ram;

public class DebitCardPay implements IPay {

	public DebitCardPay() {
		System.out.println("debit card object created");
	}
	@Override
	public boolean payBill(Double amt) {
		System.out.println("Bill paid through debit card "+amt);	
		return true;
	}

}
