package action;

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ModelDriven;

import POJO.LinkMusic;
import common.ajax.AjaxResponse;
import common.ajax.AjaxResponse.AjaxStatus;
import common.factory.GsonFactory;
import common.utils.*;
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
		return "item_operate";
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
		return "item_operate";
	}

	@SuppressWarnings("unchecked")
	private List<LinkMusic> queryAll() {
		linkMusicDAO = new LinkMusicDAOImpl();
		return (List<LinkMusic>) linkMusicDAO.query(LinkMusic.class);
	}

	@SuppressWarnings("unchecked")
	private List<LinkMusic> queryByPage(int pageNumber) {
		linkMusicDAO = new LinkMusicDAOImpl();
		return (List<LinkMusic>) linkMusicDAO.query(LinkMusic.class, pageNumber);
	}

	public String query() {
		Gson gson = GsonFactory.GetInstance();
		int pageNumber;
		String sPageNumber = "";
		if (request != null) {
			sPageNumber = request.getParameter("page");
		}
		if (TextUtils.isNullOrEmpty(sPageNumber)) {
			pageNumber = 0;
		} else {
			pageNumber = Integer.parseInt(request.getParameter("page"));
		}
		List<LinkMusic> linkMusics = queryByPage(pageNumber);
		dataset = gson.toJson(linkMusics);
		return "item_query";
	}

	@Override
	public LinkMusic getModel() {
		return linkMusic;
	}
}
