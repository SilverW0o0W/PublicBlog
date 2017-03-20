package POJO;

import java.util.Date;

public class Resource extends Item {
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Resource() {
		super();
	}

	public Resource(int id, String name, String description, String creator, Date createTime, String path) {
		super(id, name, description, creator, createTime);
		this.path = path;
	}
}
