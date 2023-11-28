package in.ram;

public class CreditCardPay implements IPay {
	
	public CreditCardPay() {
		System.out.println("Credit card object created");
	}

	@Override
	public boolean payBill(Double amt) {
		System.out.println("Bill paid through credit card "+amt);
		return true;
	}

}
