package com.rubin.user.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import com.rubin.user.dto.User;

public class UserDAOImplTest {
@Test

public void createShouldCreateUser() {
	userDAO dao=new userDAOImpl();
	User user=new User();
	
	user.setId(1);
	user.setName("RUBIN");
	user.setEmail("Rubinsiby@gmail.com");
	
	dao.create(user);
	
	User result=dao.read(1);
	assertNotNull(result);
	assertEquals("RUBIN",result.getName());
	
}

}
