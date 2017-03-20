package POJO;

import java.util.Date;

public class LinkMusic extends Resource{

	public LinkMusic(){
		super();
	}
	public LinkMusic(int id, String name, String description, String creator, Date createTime, String path) {
		super(id, name, description, creator, createTime, path);		
	}

}
