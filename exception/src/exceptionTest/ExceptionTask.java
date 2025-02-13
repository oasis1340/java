package exceptionTest;
//5개의 정수를 입력 받기
//무한 입력 상태로 구현한다
//q를 입력시 나간다
//입력한 각 정수는 배열에 담는다
//if문은 딱 한 번만 사용한다.

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String expression = null, message = "정수 5개를 순서대로 입력하세요 / q를 입력하면 종료 됩니다.", exampleMessage = "번 째 정수";
		
		System.out.println(message);
		try {
			while(true) {
				count++;
				System.out.println(count + exampleMessage);
				expression = sc.next();
				if (expression.equals("q")) {
					System.out.println("반복 종료");
					break;
				}
				arData[count-1] = Integer.parseInt(expression);
			}	
		} catch (NumberFormatException e) {
			System.out.println("정수가 뭔지 모르니?");
			count--;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("5개 입력하라고 임마");
		} catch (Exception e) {		
			e.printStackTrace();
		} 
	}
}
