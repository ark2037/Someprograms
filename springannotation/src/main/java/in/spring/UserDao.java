package in.spring;

import org.springframework.stereotype.Repository;

@Repository			//@Repository annotates classes at the persistence layer, which will act as a database repository.used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public class UserDao {
public UserDao() {
	System.out.println("Dao object created");
}

public boolean save() {
	System.out.println("able to save in db");
	return true;
}

}
