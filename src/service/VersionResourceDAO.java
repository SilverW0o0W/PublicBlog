package service;

import java.util.List;

import POJO.VersionResource;

public interface VersionResourceDAO {
	double getNextVersion(Class<? extends VersionResource> itemClass, int id, boolean isMajorVersion);

	String generateUniqueId();

	List<? extends VersionResource> query(Class<? extends VersionResource> itemClass, String uuid);
}
