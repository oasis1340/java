package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;



public class JsonTest2 {
	public static void main(String[] args) {
		
		JSONObject userJSON = new JSONObject();
		JSONArray usersJSON = new JSONArray();
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1, "장재영", 38, "강도");
		User user2 = new User(2, "홍길동", 15, "개발자");
		User user3 = new User(3, "장보고", 20, "요리사");
		User user4 = new User(4, "이순신", 30, "디자이너");
		User user5 = new User(5, "이성계", 40, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
//		for(User user : users) {
//			JSONObject JSONUser = new JSONObject(user);
//			usersJSON.put(JSONUser);
//		}
//		
//		System.out.println(users);
//		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
//			usersJSON.put(user);
//		});
		
		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		System.out.println(usersJSON);
		
		users.forEach((user) -> {System.out.println(user.toString());});
	}
}
