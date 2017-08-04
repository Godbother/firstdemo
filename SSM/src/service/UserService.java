package service;

import java.util.List;

import pojo.User;

public interface UserService {
	public List<User> getlist();
	public User findbyid(int id);
}
