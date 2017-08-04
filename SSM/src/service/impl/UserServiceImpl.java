package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.UserMapper;
import mapper.generator.UsersMapper;
import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;//自定义mapper
	@Autowired
	private UsersMapper usersMapper;//逆向工程mapper
	@Override
	public List<User> getlist() {
		return userMapper.getUserList();
	}
	@Override
	public User findbyid(int id) {
		return userMapper.findUserById(id);
	}
	
	
}
