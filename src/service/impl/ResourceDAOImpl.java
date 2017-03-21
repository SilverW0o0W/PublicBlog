package service.impl;

import POJO.Resource;
import service.ResourceDAO;

public class ResourceDAOImpl extends ItemDAOImpl implements ResourceDAO{

	@Override
	public boolean DeleteResource(Resource resource) {
		return DeleteItem(resource);
	}
}
