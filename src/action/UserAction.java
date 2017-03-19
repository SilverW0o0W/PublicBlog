package action;

import com.opensymphony.xwork2.ModelDriven;

import POJO.User;
import service.UserDAO;
import service.impl.UserDAOImpl;

public class UserAction extends Action implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	private User user = new User();

	public String login() {
		UserDAO userDAO = new UserDAOImpl();
		if (userDAO.login(user)) {
			user = userDAO.getUser();
			session.setAttribute("LoginUser", user);
			return "login_success";
		} else {
			return "login_failure";
		}
	}

	public User getModel() {
		return this.user;
	}
}
