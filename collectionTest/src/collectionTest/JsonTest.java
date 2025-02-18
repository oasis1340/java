package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "oasis1340");
		userMap.put("password", "1234");
		userMap.put("name", "장재영");
		userMap.put("age", 63);
		
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
