package action;

import java.util.Date;

import com.google.gson.Gson;
import com.mysql.fabric.xmlrpc.base.Data;
import com.opensymphony.xwork2.ModelDriven;
import POJO.LinkMusic;
import common.AjaxResponse;
import common.AjaxResponse.AjaxStatus;
import common.factory.GsonFactory;
import service.LinkMusicDAO;
import service.impl.LinkMusicDAOImpl;

public class LinkMusicAction extends AsyncAction implements ModelDriven<LinkMusic> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3816627476063622227L;
	private LinkMusic linkMusic = new LinkMusic();
	private LinkMusicDAO linkMusicDAO;

	public String add() {
		linkMusicDAO = new LinkMusicDAOImpl();
		linkMusic.setCreateTime(new Date());
		Gson gson = GsonFactory.GetInstance();
		AjaxResponse ajaxResponse = new AjaxResponse();
		if (linkMusicDAO.add(linkMusic)) {
			ajaxResponse.setStatus(AjaxStatus.SUCCESS);
		} else {
			ajaxResponse.setStatus(AjaxStatus.ERROR);
		}
		String message = String.format("Add music %s %s.", linkMusic.getName(), ajaxResponse.getStatus().toString());
		ajaxResponse.setMessage(message);
		response = gson.toJson(ajaxResponse);
		return "item_operation";
	}

	public String delete() {
		linkMusicDAO = new LinkMusicDAOImpl();
		Gson gson = GsonFactory.GetInstance();
		AjaxResponse ajaxResponse = new AjaxResponse();
		if (linkMusicDAO.delete(linkMusic)) {
			ajaxResponse.setStatus(AjaxStatus.SUCCESS);
		} else {
			ajaxResponse.setStatus(AjaxStatus.ERROR);
		}
		String message = String.format("Delete music %s %s.", linkMusic.getName(), ajaxResponse.getStatus().toString());
		ajaxResponse.setMessage(message);
		response = gson.toJson(ajaxResponse);
		return "item_operation";
	}

	@Override
	public LinkMusic getModel() {
		return linkMusic;
	}
}
