package common.factory;

import com.google.gson.Gson;

public class GsonFactory {
	private GsonFactory() {

	}

	private static Gson gson = new Gson();

	public static Gson GetInstance() {
		return gson;
	}
}
