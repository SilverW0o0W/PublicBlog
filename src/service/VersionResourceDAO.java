package service;

public interface VersionResourceDAO {
	double getNextVersion(boolean isMajorVersion);

	String generateUniqueId();
}
