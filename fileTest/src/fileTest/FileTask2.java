package fileTest;

import java.awt.desktop.AboutEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask2 {
	public static void main(String[] args) throws IOException{
		ArrayList<User> users = new ArrayList<User>();
		User user1 = new User(1L, "홍길동", 20, "판사");
		User user2 = new User(1L, "김철수", 30, "코딩");
		User user3 = new User(1L, "김영희", 40, "교사");
		User user4 = new User(1L, "신짱구", 50, "유치원생");
		User user5 = new User(1L, "흰둥이", 10, "개");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		
//		OOO님의 직업은 OOO입니다. 를 jobs.txt에 작성하고, 콘솔에 출력하기
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("jobs.txt", true));
		
//		for(int i = 0; i < users.size(); i++) {
//			
//			bw.write(users.get(users.));
//		}
		users.forEach((user) -> {
			try {
				bw.write(user.getName() + "님의 직업은 " + user.getJob() + "입니다.\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		bw.close();
		
		
	}
}
