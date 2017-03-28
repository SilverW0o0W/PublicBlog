package common.utils;

public class TextUtils extends Utils {
	public static boolean isNullOrEmpty(String string) {
		if (string == null || string.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
