package com.keen.jwtsecurity.service;

import java.util.List;

import com.keen.jwtsecurity.domain.Role;
import com.keen.jwtsecurity.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User> getUsers();
}
