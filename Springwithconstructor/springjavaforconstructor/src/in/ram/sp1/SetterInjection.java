package in.ram.sp1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.ram.sp2.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
	
		//FileSystemResource resource = new FileSystemResource("src/context.xml");
		//XmlBeanFactory factory =  new XmlBeanFactory(resource);
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");
		WishMessageGenerator generator=(WishMessageGenerator) factory.getBean("message",WishMessageGenerator.class);
		String result = generator.generateMessage("ram");
		System.out.println(result);
	}

}
