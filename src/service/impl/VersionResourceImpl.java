package service.impl;

import java.util.List;
import java.util.UUID;

import org.hibernate.Query;

import POJO.VersionResource;
import hibernate.HibernateSessionFactory;
import service.VersionResourceDAO;

public class VersionResourceImpl extends ResourceDAOImpl implements VersionResourceDAO {

	@Override
	public double getNextVersion(Class<? extends VersionResource> itemClass, int id, boolean isMajorVersion) {
		VersionResource item = (VersionResource) query(id, itemClass);
		double version = item.getVersion();
		double nextVersion;
		if (isMajorVersion) {
			nextVersion = (int) version + 1;
		} else {
			nextVersion = version + 0.1;
		}
		return nextVersion;
	}

	@Override
	public String generateUniqueId() {
		return UUID.randomUUID().toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<? extends VersionResource> query(Class<? extends VersionResource> itemClass, String uuid) {
		List<? extends VersionResource> items = null;
		transaction = null;
		try {
			session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			String hql = String.format("from %s where uniqueid = ?", itemClass.getSimpleName());
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setString(0, uuid);
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
}
