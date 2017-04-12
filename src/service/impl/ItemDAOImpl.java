package service.impl;

import java.util.Iterator;
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

	protected Session session;
	protected Transaction transaction;
	protected Page page;

	@Override
	public boolean add(Item item) {
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(item);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
			return false;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

	@Override
	public boolean delete(Item item) {
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(item);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.getMessage();
			transaction.rollback();
			return false;
		} finally {
			if (transaction != null) {

				transaction = null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends Item> query(Class<? extends Item> itemClass) {
		List<? extends Item> items = null;
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			String hql = String.format("from %s", itemClass.getSimpleName());
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			items = query.list();
			transaction.commit();
			return items;
		} catch (Exception ex) {
			ex.getMessage();
			transaction.rollback();
			return null;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends Item> query(Class<? extends Item> itemClass, int pageNumber) {
		List<? extends Item> items = null;
		transaction = null;
		try {
			String hql = String.format("from %s", itemClass.getSimpleName());
			page = PageFactory.GetPage(itemClass);
			long recordsCount = this.count(itemClass);
			int firstIndex = page.GetFirstIndex(pageNumber, recordsCount);
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setFirstResult(firstIndex);
			query.setMaxResults(page.GetMaxResults());
			items = query.list();
			transaction.commit();
			return items;
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
			return null;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Item query(int id, Class<? extends Item> itemClass) {
		List<? extends Item> items = null;
		Item item = null;
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			String hql = String.format("from %s where id = ?", itemClass.getSimpleName());
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setInteger(0, id);
			items = query.list();
			Iterator<? extends Item> iterator = items.iterator();
			if (iterator.hasNext()) {
				item = (Item) iterator.next();
			}
			transaction.commit();
			return item;
		} catch (Exception ex) {
			ex.getMessage();
			transaction.rollback();
			return null;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
	}

	@Override
	public long count(Class<? extends Item> itemClass) {
		long count = -1;
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(itemClass);
			criteria.setProjection(Projections.rowCount());
			count = (Long) criteria.uniqueResult();
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
		return count;
	}

	protected int getPagesCount() {
		if (page == null) {
			return 0;
		}
		return page.getPagesCount();
	}
}
