package service.impl;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import POJO.Item;
import POJO.LinkMusic;
import action.LinkMusicAction;
import service.LinkMusicDAO;

public class TestLinkMusicDAOImpl {
	@Test
	public void TestAddMusic() {
		LinkMusic linkMusic = new LinkMusic(1, "New Test", "Just say something", "silver", new Date(),
				"http://silvercodingcat.com");
		LinkMusicDAO linkMusicDAO = new LinkMusicDAOImpl();
		Assert.assertEquals(true, linkMusicDAO.add(linkMusic));
	}

	@Test
	public void TestDeleteMusic() {
		LinkMusic linkMusic = new LinkMusic(4, "Lemon", "Just say something", "silver", new Date(),
				"http://silvercodingcat.com");
		LinkMusicDAO linkMusicDAO = new LinkMusicDAOImpl();
		Assert.assertEquals(true, linkMusicDAO.delete(linkMusic));
	}

	@Test
	public void TestQueryMusic() {
		LinkMusicDAO linkMusicDAO = new LinkMusicDAOImpl();
		List<? extends Item> list = linkMusicDAO.query(LinkMusic.class);
		for (Item item : list) {
			System.out.println(item.getName());
		}
	}

	@Test
	public void TestQueryPageMusic() {
		LinkMusicDAO linkMusicDAO = new LinkMusicDAOImpl();
		List<? extends Item> list = linkMusicDAO.query(LinkMusic.class, 2);
		for (Item item : list) {
			System.out.println(item.getName());
		}
	}

	@Test
	public void TestQueryPageMusicAction() {
		LinkMusicAction action = new LinkMusicAction();
		List<LinkMusic> list = action.queryByPage(2);
		for (LinkMusic item : list) {
			System.out.println(item.getPath());
		}
	}

	@Test
	public void TestCountMusic() {
		LinkMusicDAO linkMusicDAO = new LinkMusicDAOImpl();
		long count = linkMusicDAO.count(LinkMusic.class);
		System.out.println(count);
	}
}
