package POJO;

import java.util.Date;

public class Item {
	private int id;
	private String name;
	private String description;
	private String creator;
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id) {
		this.id = id;
	}

	public Item(int id, String name, String description, String creator, Date createTime) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.creator = creator;
		this.createTime = createTime;
	}
}
