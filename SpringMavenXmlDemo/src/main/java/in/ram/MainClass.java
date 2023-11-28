package in.ram;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Resource resource = new ClassPathResource("Beans.xml");  //it specifies where our xml file is present
//BeanFactory factory = new XmlBeanFactory(resource);  //[old approach-depreciated]
//factory.getBean("debit",DebitCardPay.class);
		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml"); //[new approach]
		factory.getBean("debit",DebitCardPay.class);
		factory.getBean("credit",CreditCardPay.class);
		PaymentProcess process = factory.getBean("payment",PaymentProcess.class);
		process.dopayment(100.0);
		
	}

}
