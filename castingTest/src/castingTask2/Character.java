package castingTask2;

class Login {
	
	String name;
	
	public Login(String name) {;}
	
	public void Login() {
		System.out.printf("%s님이 로그인 하셨습니다.\n", name);
	}
}


class Monster {
	String name;
	public Monster() {;}
	
	void dropItem() {;}
}

class Orc extends Monster{
	
	public Orc() {;}
	void dropItem () {
		System.out.println("가죽을 얻었습니다.");
	}
}

class Fairy extends Monster{
	
	public Fairy() {;}
	void dropItem () {
		System.out.println("날개를 얻었습니다.");
	}
}

class Human extends Monster{
	
	public Human() {;}
	void dropItem() {
		System.out.println("갑옷을 얻었습니다.");
	}
}

//class Character

public class Character {
//	이름, 직업, 레벨
//	사냥하는 메서드
	String name;
	String job;
	int level;
	
	public Character() {;}
	
	public Character(String name, String job, int level) {
//		super();
		this.name = name;
		this.job = job;
		this.level = level;
	}
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hunt (Monster monster) {
		if (monster instanceof Orc) {
			monster = (Orc)monster;
			monster.dropItem();
		}else if (monster instanceof Fairy) {
			monster = (Fairy)monster;
			monster.dropItem();
		}else if (monster instanceof Human) {
			monster = (Human)monster;
			monster.dropItem();
		}
	}
}
