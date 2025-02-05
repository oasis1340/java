package variableTest;

public class FormatTest {
	
	public static void main(String[] args) {
		String name = "장재영";
		int age = 10;
		double height = 300;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.0fcm", height);
		
	}
}
