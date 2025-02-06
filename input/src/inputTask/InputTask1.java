package inputTask;

import java.util.Scanner;

public class InputTask1 {
// 두 정수를 입력한 뒤 덧셈 결과를 출력한다.
// 단 sc.next()만 사용한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = "두 정수를 입력해주세요. ex)10 20";
		
		System.out.println(message);
		String num1 = sc.next();
		String num2 = sc.next();
		
		System.out.println(num1 + " + " + num2 + " = " + (Integer.parseInt(num1)+Integer.parseInt(num2)) + " 입니다.");
		
		
	}
}
