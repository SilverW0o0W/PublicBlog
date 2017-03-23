package service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import POJO.Item;
import POJO.LinkMusic;
import hibernate.HibernateSessionFactory;
import service.ItemDAO;

public abstract class ItemDAOImpl implements ItemDAO {

	@Override
	public boolean Add(Item item) {
		Transaction transaction = null;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(item);
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

	@Override
	public boolean Delete(Item item) {
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
