package action;

import com.opensymphony.xwork2.ModelDriven;

import POJO.LinkMusic;
import service.LinkMusicDAO;
import service.impl.LinkMusicDAOImpl;

public class LinkMusicAction extends Action implements ModelDriven<LinkMusic> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3816627476063622227L;
	private LinkMusic linkMusic = new LinkMusic();
	private LinkMusicDAO linkMusicDAO;

	public String Add(LinkMusic linkMusic) {
		linkMusicDAO = new LinkMusicDAOImpl();
		linkMusicDAO.AddMusic(linkMusic);
		return null;
	}

	public String Delete(LinkMusic linkMusic) {
		linkMusicDAO = new LinkMusicDAOImpl();
		linkMusicDAO.DeleteItem(linkMusic);
		return null;
	}

	@Override
	public LinkMusic getModel() {
		return linkMusic;
	}
}
