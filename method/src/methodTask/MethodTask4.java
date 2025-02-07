package methodTask;

import java.util.Scanner;

public class MethodTask4 {
//	1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	void charCount(String content, char text) {
		int count = 0;
		char[] textBox = new char[content.length()];
		for (int i = 0; i < content.length(); i++) {
			if (textBox[i] == text) {
				count++;
			}
		}
		System.out.printf("c%의 개수는 %d개 입니다.", text, count);
	}
//	2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	int fiveIntIndexOf(int[] data, int index) {
		return data[index];
	}
//	3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	void koreanToNumber(String num) {
		char[] toNum = new char[num.length()];
		for(int i = 0; i < num.length(); i++) {
			toNum[i] = num.charAt(i);
		}
		for (int i = 0; i < toNum.length; i++) {
			switch(toNum[i]) {
				case '공':{
					toNum[i] = '0';
					break;
				}
				case '일':{
					toNum[i] = '1';
					break;
				}
				case '이':{
					toNum[i] = '2';
					break;
				}
				case '삼':{
					toNum[i] = '3';
					break;
				}
				case '사':{
					toNum[i] = '4';
					break;
				}
				case '오':{
					toNum[i] = '5';
					break;
				}
				case '육':{
					toNum[i] = '6';
					break;
				}
				case '칠':{
					toNum[i] = '7';
					break;
				}
				case '팔':{
					toNum[i] = '8';
					break;
				}
				case '구':{
					toNum[i] = '9';
					break;
				}
			}	
		}
		for (int i = 0; i < toNum.length; i++) {
			System.out.print(toNum[i]);
		}
	}
//	4) 5개의 정수를 입력받고 최대값과 최소값을 구해 값을 반환해주는 메소드
//	void printMaxAndMin(int[]data) {
//		int max = data[0], min = data[0];
//		
//		for (int i = 0; i < 5; i++) {
//			if (data[i] > max) {
//				max = data[i];
//			}
//			if (data[i] < min) {
//				min = data[i];
//			}
//		}
//		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
//	}
	
//	5) 5개의 정수를 입력받고 최대값과 최소값을 구해주는 기능을 가진 메소드(void)
	void printMaxAndMin(int[]data1, int[]data2) {
		int max = data1[0], min = data1[0];
		
		for (int i = 0; i < 5; i++) {
			if (data1[i] > max) {
				max = data1[i];
			}
			if (data1[i] < min) {
				min = data1[i];
			}
		}
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
	}
//	매개 변수 2개 : 최소값과 최대값을 구할 배열, 최소값과 최대값을 구한 결과를 담을 배열
//	6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	
	
	public static void main(String[] args) {
		
		MethodTask4 mt4 = new MethodTask4();
//		1번
//		String message1 = "문자열을 입력해주세요. ex)안녕하세요", message2 = "원하는 문자를 입력해주세요. ex)안", text1 = "";
//		char text2 = '안';
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(message1);
//		text1 = sc.nextLine();
//		System.out.println(message2);
//		
//		mt4.charCount(text1, text2);
		
//		2번
		
		
//		3번
//		String message = "문자열을 입력해주세요. ex)일공이사", content = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(message);
//		content = sc.nextLine();
//		
//		mt4.koreanToNumber(content);
		
//		4번
//		int[] arr = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String message = "정수 5개를 입력해주세요. ex)1 2 3 4 5";
//		
//		System.out.println(message);
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		mt4.printMaxAndMin(arr);
		
//		5번
		
		
		
	} // main
}
