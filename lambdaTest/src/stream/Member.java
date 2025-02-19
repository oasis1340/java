package stream;

public class Member {
//	2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//	모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//	필드 : 이름, 취미, 소개
//	홍길동, 축구_농구_야구, 나는 축구왕!
//	이순신, 개발_당구_축구, 나는 개발자 좋아!
//	장보고, 피아노, 피아노만 한 우물!
//	김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//	김영희, 골프_야구, 운동 선수는 나의 꿈
//	흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
	private String name;
	private String hobby;
	private String introduce;
	
	public Member() {;}

	public Member(String name, String hobby, String introduce) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}
	
	
	
}
