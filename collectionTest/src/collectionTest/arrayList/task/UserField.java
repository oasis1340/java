package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	public static String userId;
	final int KEY = 300;
	
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);
		}
	}
	
//	로그인
//	public boolean login(User user) {
//		for(User userInDB : users) {
//			if(userInDB.getId().equals(user.getId())) {
//				if(userInDB.getPassword().equals(user.getPassword())) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//	로그인 로직
	public boolean login(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
	public void logout(User user) {
		userId = null;
	}
	
//	암호화
//	public int hash(User user) {
//		return userId.hashCode();
//	}
	public String encrypt(String password) {
		String encryptPassword = "";
		for(int i = 0; i < password.length(); i++) {
			encryptPassword += (char)(password.charAt(i) * KEY);
		}
		return encryptPassword;
	}
	
//	비밀번호 변경(마이페이지)
//	비밀번호 변경(30일)
//	인증번호 전송
//	인증번호 확인
	public static void main(String[] args) {
		UserField uf = new UserField();
		System.out.println(uf.encrypt("abcdefg"));
	}
	
}
