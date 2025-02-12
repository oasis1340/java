package castingTask2;

public class CastingTask2 extends Character {
	public static void main(String[] args) {
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다.
//		오크 : 가죽을 얻는다.
//		요정 : 날개를 얻는다.
//		인간 : 갑옷을 얻는다.
		Character jy = new Character("zl존재영", "도적", 30);
		Monster orc = new Orc();
		Monster fairy = new Fairy();
		Monster human = new Human();
		
		Login login = new Login(jy.name);
		
		login.Login();
		
		jy.hunt(orc);
		jy.hunt(fairy);
		jy.hunt(human);
	}
}
