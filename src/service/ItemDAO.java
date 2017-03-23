package service;

import POJO.Item;

public interface ItemDAO {
	boolean add(Item item);
	boolean delete(Item item);
}
