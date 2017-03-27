package service;

import java.util.List;

import POJO.Item;
import common.Page;

public interface ItemDAO {
	boolean add(Item item);

	boolean delete(Item item);

	long count(Class<? extends Item> itemClass);

	List<? extends Item> query(Class<? extends Item> itemClass);

	List<? extends Item> query(Class<? extends Item> itemClass, int pageNumber);
}
