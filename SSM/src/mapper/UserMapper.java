package mapper;

import java.util.List;

import pojo.User;

public interface UserMapper {
	public User findUserById(int id);
	public List<User> getUserList();
}
