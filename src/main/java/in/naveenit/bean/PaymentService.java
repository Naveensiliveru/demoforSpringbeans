package in.naveenit.bean;

public class PaymentService {
	
	 private IPayment payment;
	 
	  public PaymentService() {
		super();
		System.out.println(" PaymentService :: constructor  ");
		
	}

	public PaymentService(IPayment payment) {
		
		this.payment = payment;
	}
	
	 public void setPayment(IPayment payment) {
		 System.out.println(" setter injection is excuted");
		 this.payment= payment;
	 }

	public void doPayment(double billAmt) {
		  boolean  status   =payment.processPayment(billAmt);
		  
		   if(status) {
			   System.out.println(" Recipt is printing");
		   } else {
			    System.out.println(" Card declined");
		   }
	  }

}
