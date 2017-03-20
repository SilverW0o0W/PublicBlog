package service.impl;

import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import POJO.LinkMusic;
import hibernate.HibernateSessionFactory;
import service.LinkMusicDAO;

public class LinkMusicDAOImpl implements LinkMusicDAO{

	@Override
	public boolean AddMusic(LinkMusic linkMusic) {
		Transaction transaction = null;
		String hql = "";
		try {
			Session session = HibernateSessionFactory.getSesstionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			hql = "insert into LinkMusic values(?,?,?,?,?)";
			Query query = session.createQuery(hql);
			query.setParameter(0, linkMusic.getName());
			query.setParameter(1, linkMusic.getDescription());
			query.setParameter(2, linkMusic.getCreator());
			query.setParameter(3, new Date());
			query.setParameter(4, linkMusic.getPath());
			
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
		}
		return false;
	}

	@Override
	public boolean DeleteMusic(String musicId) {
		// TODO Auto-generated method stub
		return false;
	}

}
