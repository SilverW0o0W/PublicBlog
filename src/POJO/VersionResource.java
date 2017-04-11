package POJO;

import java.util.Date;

public class VersionResource extends Resource{
	private String uniqueId;
	private double version;
	
	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public VersionResource() {
		super();
	}

	public VersionResource(int id) {
		super(id);
	}

	public VersionResource(int id, String name, String description, String creator, Date createTime, String path) {
		super(id, name, description, creator, createTime,path);
	}
}
