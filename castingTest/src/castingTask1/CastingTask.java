package castingTask1;

class Netflix {
	String title;
	
	public Netflix() {;}
	
	void click() {
		System.out.println("시청할 영상을 클릭해주세요.");
	}
}

class Person {
	public Person() {;}
	
	void click(Netflix netflix) {
		if (netflix instanceof Animation) {
			netflix.click();
		}else if (netflix instanceof Movie) {
			netflix.click();
		}else if (netflix instanceof Drama) {
			netflix.click();
		}
	}
}

class Animation extends Netflix{
	
	public Animation() {;}
	
	@Override
	void click() {
		System.out.println("자막 지원");
	}
}

class Movie extends Netflix{
	
	public Movie(String title) {;}
	
	void click() {
		System.out.println("4D");
	}
}

class Drama extends Netflix{
	
	public Drama(String title) {;}
	
	void click() {
		System.out.println("굿즈");
	}
}

public class CastingTask {
// 	넷플릭스
//	애니메이션, 영화, 드라마
//	사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용
//	영화라면 "4D" 기능 사용
//	드라마라면 "굿즈" 기능 사용
	
	public static void main(String[] args) {
		
		Person jy = new Person();
		
		
//		up casting
		Netflix dandadan = new Animation();
//		dandadan.click();
		
		Netflix avengers = new Movie("avengers");
//		avengers.click();
		 
//		error
//		Movie spiderMan = new Netflix("spiderMan"); 
		
//		down casting		
		Netflix narcos = new Drama("narcos");
		Netflix narcos1 = (Drama)narcos;
		
		jy.click(dandadan);
		jy.click(avengers);
		jy.click(narcos1);
//		narcos1.click();
	}
}
