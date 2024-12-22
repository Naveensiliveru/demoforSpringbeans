package in.naveenit.bean;

public class CreditCardPayment implements IPayment {

	 public   CreditCardPayment() {
		  System.out.println("CreditCardPayment :: Constructor ");
		 
	 }
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("creditCard Payment Sucessful");
		return  true;
	}
	

}
