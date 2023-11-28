package in.ram;

public class PaymentProcess {

	private IPay pay;
	
	public void setPay(IPay pay) {
		this.pay=pay;
	}
	public void  dopayment(Double amount) {
		boolean paymentstatus = pay.payBill(amount);
		if(paymentstatus) 
			System.out.println("payment success");
		else 
			System.out.println("payment failed");

		
	}
}
