package service.impl;

import org.junit.Assert;
import org.junit.Test;

import POJO.User;
import service.UserDAO;

public class TestUserDAOImpl {
	@Test
	public void TestUserLogin() {
		User user = new User(1, "silver.codingcat@gmail.com", "admin", "aptx4869");
		UserDAO userDAO = new UserDAOImpl();
		Assert.assertEquals(true, userDAO.login(user));
	}
}
