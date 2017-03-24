package common;

public class AjaxResponse {
	public enum AjaxStatus {
		SUCCESS(0, "success"), WARNGING(1, "warning"), ERROR(2, "error");
		AjaxStatus(int id, String name) {
			this.id = id;
			this.name = name;
		}

		private int id;
		private String name;

		public int toInt() {
			return id;
		}

		public String toString() {
			return name;
		}
	}

	private AjaxStatus status;
	private String action;
	private String message;

	public AjaxStatus getStatus() {
		return status;
	}

	public void setStatus(AjaxStatus status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AjaxResponse() {
	}

	public AjaxResponse(AjaxStatus status, String action, String message) {
		this.status = status;
		this.action = action;
		this.message = message;
	}

}
