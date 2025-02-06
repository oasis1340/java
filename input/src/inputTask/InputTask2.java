package inputTask;

import java.util.Scanner;

public class InputTask2 {
//	3개의 정수를 한 번에 입력받은 뒤
//	3개의 정수의 곱셈을 출력한다
//	단, next()만 사용
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		String message = "3개의 정수를 입력 해주세요. ex)10 20 30", print = "%d * %d * %d = %d 입니다.";
		
		System.out.println(message);
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
//		num3 = Integer.parseInt(sc.next());
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		result = num1 * num2 * num3;
		
		System.out.printf(print, num1, num2, num3, result);
		
	}
}
