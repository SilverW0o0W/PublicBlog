package POJO;

import org.junit.Test;

import com.google.gson.Gson;

public class JustTest {
	@Test
	public void test(){
		Gson gson=new Gson();
		System.out.println(gson.toJson(1234435));
	}
}
