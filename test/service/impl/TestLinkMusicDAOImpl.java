package service.impl;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import POJO.LinkMusic;
import service.LinkMusicDAO;

public class TestLinkMusicDAOImpl {
	@Test
	public void TestAddMusic() {
		LinkMusic linkMusic = new LinkMusic(1, "Lemon", "Just say something", "silver", new Date(), "http://silvercodingcat.com");
		LinkMusicDAO linkMusicDAO=new LinkMusicDAOImpl();
		Assert.assertEquals(true, linkMusicDAO.add(linkMusic));
	}
	@Test
	public void TestDeleteMusic(){
		LinkMusic linkMusic = new LinkMusic(1, "Lemon", "Just say something", "silver", new Date(), "http://silvercodingcat.com");
		LinkMusicDAO linkMusicDAO=new LinkMusicDAOImpl();
		Assert.assertEquals(true, linkMusicDAO.delete(linkMusic));
	}
}
