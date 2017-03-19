package service;

import POJO.User;

public interface UserDAO {
	public boolean login(User user);

	public User getUser();
}
