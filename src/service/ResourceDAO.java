package service;

import POJO.Resource;

public interface ResourceDAO extends ItemDAO{
	
	boolean DeleteResource(Resource resource);
}
