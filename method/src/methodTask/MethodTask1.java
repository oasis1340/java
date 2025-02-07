package methodTask;

import java.util.Scanner;

public class MethodTask1 {
//	1~10까지 println으로 출력하는 메서드
	void printOneToTen(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println(i+1);
		}
	}
//	"홍길동" 이름을 n번 println()으로 출력하는 메서드
	void printGilDong(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
	}
	
	public static void main(String[] args) {
		
		MethodTask1 mt = new MethodTask1();
		int count1 = 0, count2 = 0;
		String message1 = "1~n까지 출력 합니다 n 값을 입력해주세요. ex) 5", message2 = "홍길동을 n번 출력합니다. n값을 입력해주세요. ex) 5";
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(message1);
		count1 = sc.nextInt();		
		mt.printOneToTen(count1);
		
		System.out.println(message2);
		count2 = sc.nextInt();		
		mt.printGilDong(count2);
		
	}
}
