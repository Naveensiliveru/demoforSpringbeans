package in.naveenit.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  context= new ClassPathXmlApplicationContext("Bean.Xml");
             PaymentService service=context.getBean(PaymentService.class);
             service.doPayment(199.0);
	}

}
