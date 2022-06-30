package com.rubin.user.dao;

import java.util.HashMap;
import java.util.Map;


import com.rubin.user.dto.User;

public class userDAOImpl implements userDAO {
	
	Map<Integer,User> users=new HashMap<>();
	
	
	@Override
	public void create(User user) {
		users.put(user.getId(),user);
	}

	@Override
	public User read(int id) {
		return users.get(id);
	}

}
