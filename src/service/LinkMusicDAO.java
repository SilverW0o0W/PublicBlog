package service;

import POJO.LinkMusic;

public interface LinkMusicDAO {
	public boolean AddMusic(LinkMusic linkMusic);
	public boolean DeleteMusic(String musicId);
}
