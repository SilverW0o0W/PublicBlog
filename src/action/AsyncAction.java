package action;

import java.util.List;

import POJO.Item;

public abstract class AsyncAction extends Action {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5602348791558389362L;
	protected String response;
	protected String dataset;
	protected List<? extends Item> resultList;

	public List<? extends Item> getResultList() {
		return resultList;
	}

	public void setResultList(List<? extends Item> resultList) {
		this.resultList = resultList;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getDataset() {
		return dataset;
	}

	public void setData(String dataset) {
		this.dataset = dataset;
	}
}
