package service;

import POJO.Item;

public interface ItemDAO {
	boolean Add(Item item);
	boolean Delete(Item item);
}
