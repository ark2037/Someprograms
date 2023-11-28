package in.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service	// @Service annotates classes at the service layer.
public class UserService {
	@Autowired		//@Autowired annotation marks a Constructor, Setter method, Properties and Config() method as to be autowired that is ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism
	private  UserDao udao;
public UserService() {
	System.out.println("userservice object created");
}

public void storeinDB() {
	boolean status = udao.save();
	if(status)
		System.out.println("storage successful");
	else {
		System.out.println("storage failed");
	}
	
}

}
