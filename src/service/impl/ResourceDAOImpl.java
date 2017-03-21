package service.impl;

import service.ResourceDAO;

public class ResourceDAOImpl extends ItemDAOImpl implements ResourceDAO{

	@Override
	public boolean DeleteResource(int id) {
		return DeleteItem(id);
	}
}
