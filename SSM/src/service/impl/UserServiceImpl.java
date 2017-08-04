package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mapper.UserMapper;
import mapper.generator.UsersMapper;
import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;//�Զ���mapper
	@Autowired
	private UsersMapper usersMapper;//���򹤳�mapper
	@Override
	public List<User> getlist() {
		return userMapper.getUserList();
	}
	@Override
	public User findbyid(int id) {
		return userMapper.findUserById(id);
	}
	
	
}
