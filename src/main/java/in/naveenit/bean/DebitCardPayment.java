package in.naveenit.bean;

public class DebitCardPayment  implements IPayment{

	
	 public  DebitCardPayment() {
		 System.out.println(" DebitCardPayment :: constructor");
	 }
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("");
		return true;
	}

}
