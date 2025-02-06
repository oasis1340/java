package operTest;

import java.util.Scanner;

public class OperTask1 {
//	(마스터)
//	사용자에게 값을 입력받고
//	정수라면 정수입니다.
//	실수라면 실수입니다.
//	예) 183 -> 입력한 값은 정수입니다.
//	183.5 -> 입력한 값을 실수입니다.
//	삼항 연산자를 사용하기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num = 0.0;
		int intNum = 0;
		String result = null;
		
		String message = "값을 입력해주세요.";
			
		System.out.println(message);
		num = sc.nextDouble();
		
		intNum = (int)num;
		result = num == intNum ? "입력한 값은 정수입니다." : "입력한 값은 실수입니다.";

		System.out.println(result);
	}
}
