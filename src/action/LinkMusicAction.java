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
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String add() {
		linkMusicDAO = new LinkMusicDAOImpl();
		linkMusicDAO.add(linkMusic);
		return null;
	}

	public String delete() {
		linkMusicDAO = new LinkMusicDAOImpl();
		if (linkMusicDAO.delete(linkMusic)) {
			message = "{\"result\":\"success\"}";
		} else {
			message = "{\"result\":\"failed\"}";
		}
		return "delete_music";
	}

	@Override
	public LinkMusic getModel() {
		return linkMusic;
	}
}
