package action;

public abstract class AsyncAction extends Action {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5602348791558389362L;
	protected String response;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
