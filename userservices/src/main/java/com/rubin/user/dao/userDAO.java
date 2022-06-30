package com.rubin.user.dao;

import com.rubin.user.dto.User;

public interface userDAO {
//to create a new user
	void create(User user);

	// to get a single user based on id
	User read(int id);
}
