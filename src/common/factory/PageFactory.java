package common.factory;

import POJO.*;
import common.Page;

public class PageFactory {

	private PageFactory() {

	}

	public static Page GetPage(Class<? extends Item> itemClass) {
		String className = itemClass.getSimpleName().toLowerCase();
		Page page = null;
		switch (className) {
		case "linkmusic":
			page = new Page(10, className);
			break;
		default:
			page = new Page(10, "default", className);
			break;
		}
		return page;
	}

	public static Page GetPage(Class<? extends Item> itemClass, int customNumber) {
		Page page = GetPage(itemClass);
		if (customNumber > 0) {
			page.setRecordEachPage(customNumber);
		}
		return page;
	}
}
