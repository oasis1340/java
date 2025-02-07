package methodTask;

import java.util.Scanner;

public class MethodTask3 {
//	세 정수를 뺄셈해서 결과값을 알려주는 메서드
	void subtract(int num1, int num2, int num3) {
		System.out.println(num1 - num2 - num3);
	}
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드(배열사용)
	void division(int num1, int num2) {
		int share = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.printf("몫 : %d, 나머지 : %d", share, remainder);
	}
//	1~n까지의 합을 구해주는 메소드
	int total(int num) {
		int total = 0;
		for(int i = 0; i < num; i++) {
			total += i+1;
		}
		return total;
	}
//	어떤 값이 홀수인지 짝수인지 알려주는 메소드
	String isOddEven(int num) {
		return num % 2 == 1 ? "홀수 입니다." : "짝수 입니다.";
	}
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	void printBigSmall(String text) {
		
		char[] textBox = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			textBox[i] = text.charAt(i);
		}
		
		for (int i = 0; i < textBox.length; i++) {
			if (97 <= textBox[i] + 1 && textBox[i] + 1 <= 123) {
				textBox[i] = (char)(textBox[i] - 32);
			}
			else if (65 <= textBox[i] + 1 && textBox[i] + 1 <= 96) {
				textBox[i] = (char)(textBox[i] + 32);
			}
		}
		for (int i = 0; i < textBox.length; i++) {
			System.out.print(textBox[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		MethodTask3 mt = new MethodTask3();
		Scanner sc = new Scanner(System.in);
		String message = "문자열을 입력해주세요. ex)aBc", text = "";
		
		System.out.println(message);
		text = sc.nextLine();

		mt.printBigSmall(text);
		
		
//		char a = 'a'; // 97, A = 65, Z = 90
//		char z = 'z'; // 122
//		
//		System.out.println('z'+1);
		
	} //main
	
} //class
