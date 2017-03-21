package service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import POJO.Item;
import hibernate.HibernateSessionFactory;
import service.ItemDAO;

public class ItemDAOImpl implements ItemDAO{

	@Override
	public boolean DeleteItem(Item item) {
		Transaction transaction = null;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(item);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

}
