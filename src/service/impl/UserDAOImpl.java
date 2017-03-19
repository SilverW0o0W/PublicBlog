package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import POJO.User;
import hibernate.HibernateSessionFactory;
import service.UserDAO;

public class UserDAOImpl implements UserDAO {

	private User currentUser;

	@Override
	public boolean login(User user) {
		Transaction transaction = null;
		String hql = "";
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			hql = "from User where email=? and password=? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, user.getEmail());
			query.setParameter(1, user.getPassword());
			List list = query.list();
			transaction.commit();
			if (list.size() > 0) {
				currentUser = (User) list.get(0);
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

	@Override
	public User getUser() {
		return new User(currentUser.getId(), currentUser.getEmail(), currentUser.getUsername(), "");
	}

}
