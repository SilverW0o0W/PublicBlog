package service.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import POJO.Item;
import common.Page;
import common.factory.PageFactory;
import hibernate.HibernateSessionFactory;
import service.ItemDAO;

public abstract class ItemDAOImpl implements ItemDAO {

	@Override
	public boolean add(Item item) {
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
				transaction.rollback();
				transaction = null;
			}
		}
	}

	@Override
	public boolean delete(Item item) {
		Transaction transaction = null;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(item);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.getMessage();
			return false;
		} finally {
			if (transaction != null) {
				transaction.rollback();
				transaction = null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends Item> query(Class<? extends Item> itemClass) {
		List<? extends Item> items = null;
		Transaction transaction = null;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			String hql = "from ?";
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString(0, itemClass.getSimpleName());
			items = query.list();
			transaction.commit();
			return items;
		} catch (Exception ex) {
			ex.getMessage();
			return null;
		} finally {
			if (transaction != null) {
				transaction.rollback();
				transaction = null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends Item> query(Class<? extends Item> itemClass, int pageNumber) {
		List<? extends Item> items = null;
		Transaction transaction = null;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			String hql = "from ?";
			Page page = PageFactory.GetPage(itemClass);
			page.setRecordsCount(this.count(itemClass));
			page.setCurrentPage(pageNumber);
			Query query = session.createQuery(hql);
			query.setString(0, itemClass.getSimpleName());
			items = query.list();
			transaction.commit();
			return items;
		} catch (Exception ex) {
			ex.getMessage();
			return null;
		} finally {
			if (transaction != null) {
				transaction.rollback();
				transaction = null;
			}
		}
	}

	@Override
	public long count(Class<? extends Item> itemClass) {
		long count = -1;
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			Criteria criteria = session.createCriteria(itemClass);
			criteria.setProjection(Projections.rowCount());
			count = (Long) criteria.uniqueResult();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return count;
	}

}
