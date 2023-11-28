package in.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		UserService service=context.getBean(UserService.class);
		service.storeinDB();
	}

}
