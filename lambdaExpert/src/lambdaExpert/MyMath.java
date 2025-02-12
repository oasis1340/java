package lambdaExpert;

import java.util.Scanner;

//[심화 실습]
//여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOpers를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결
public class MyMath {
//	연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
//	public static Calc caculater(String oper) {
//		return null;
//	}
	
	public static void main(String[] args) {
//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과값을 출력
		
		String message = "값을 입력해주세요. ex)7+5-3", problem = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		problem = sc.nextLine();
		
		Calc caculater = (express) -> {
			int total = 0;
			String[] numBox1 = new String[express.length()];
			String[] numBox2 = new String[express.length()];
			String[] calc = new String[express.length()];
			String num = "";
			String oper = "";
			char[] box = new char[express.length()];
			char[] numBox22 = new char[express.length()];
			char[] plusMinusOperBox = new char[express.length()];
			char[] multiDivOperBox = new char[express.length()];

			numBox1 = express.split("\\+|\\-"); // 우선순위 나누기
			numBox2 = express.split("\\*|\\/"); 
			
			if (!express.contains("*") || !express.contains("/")) {
				calc = express.split("0|1|2|3|4|5|6|7|8|9");
			}
			for (int i = 0; i < calc.length; i++) {
				
			}
			
			for (int i = 0; i < express.length(); i++) {
				box[i] = express.charAt(i);
			}
			for (int i = 0; i < express.length(); i++) {
				
				if (box[i] == '+' || box[i] == '-') {
					plusMinusOperBox[i] += box[i];
					System.out.println(plusMinusOperBox[i]);
				}
			}
			for (int i = 0; i < express.length(); i++) {
				
				if (box[i] == '*' || box[i] == '/') {
					oper += box[i];
				}
			}
			
			if (!express.contains("*") || !express.contains("/")) {				
				for (int i = 0; i < numBox1.length/2; i+=2) {
					total =  Integer.parseInt(numBox1[i]) + (char)plusMinusOperBox[i/2] + Integer.parseInt(numBox1[i+1]);
	
				}
			}
//			if (express.contains("*") || express.contains("/")) {				
//				numBox1 = express.split("\\+|\\-");
//			}
			
//			for (int i = 0; i < numBox1.length; i++) {
//				num += " " + numBox1[i];
//				
//			}
			//	String 배열로 자르고 charAt으로 잘라서 계산
			
			// express = 7+5-3, express.split("\\+") => 7, 5-3
			
			// 사칙연산 우선 순위 => +,-로 잘라낸 나머지를 먼저 계산하고 다시 넣기
				
//			System.out.println(num);
//			System.out.println(oper);
			System.out.println(total);
		};
		caculater.calculater(problem);
	}
}
