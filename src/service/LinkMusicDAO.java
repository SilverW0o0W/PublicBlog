package service;

import POJO.LinkMusic;

public interface LinkMusicDAO extends ResourceDAO{
	public boolean AddMusic(LinkMusic linkMusic);
	public boolean DeleteMusic(int musicId);
}
