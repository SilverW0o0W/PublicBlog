package POJO;

import org.junit.Test;

import com.google.gson.Gson;

public class JustTest {
	
	@Test
	public void TestABC(){
		Gson gson=new Gson();
		System.out.println(gson.getClass().getName());
	}
}
