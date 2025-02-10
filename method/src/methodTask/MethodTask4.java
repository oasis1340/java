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
//	char[] koreanToNumber(String num) {
//		char[] toNum = new char[num.length()];
//		for(int i = 0; i < num.length(); i++) {
//			toNum[i] = num.charAt(i);
//		}
//		for (int i = 0; i < toNum.length; i++) {
//			switch(toNum[i]) {
//				case '공':{
//					toNum[i] = '0';
//					break;
//				}
//				case '일':{
//					toNum[i] = '1';
//					break;
//				}
//				case '이':{
//					toNum[i] = '2';
//					break;
//				}
//				case '삼':{
//					toNum[i] = '3';
//					break;
//				}
//				case '사':{
//					toNum[i] = '4';
//					break;
//				}
//				case '오':{
//					toNum[i] = '5';
//					break;
//				}
//				case '육':{
//					toNum[i] = '6';
//					break;
//				}
//				case '칠':{
//					toNum[i] = '7';
//					break;
//				}
//				case '팔':{
//					toNum[i] = '8';
//					break;
//				}
//				case '구':{
//					toNum[i] = '9';
//					break;
//				}
//			}	
//		}
//		return toNum;
//	}
//	4) 5개의 정수를 입력받고 최대값과 최소값을 구해 값을 반환해주는 메소드
	int[] printMaxAndMinMethod(int[]data) {
		int max = data[0], min = data[0];
		int result[] = new int[2];
		
		for (int i = 0; i < 5; i++) {
			if (data[i] > max) {
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			}
		}
		result[0] = max;
		result[1] = min;
		return result;
	}
	
//	5) 5개의 정수를 입력받고 최대값과 최소값을 구해주는 기능을 가진 메소드(void)
//	void printMaxAndMin(int[]data1) {
//		int max = data1[0], min = data1[0];
//		
//		for (int i = 0; i < 5; i++) {
//			if (data1[i] > max) {
//				max = data1[i];
//			}
//			if (data1[i] < min) {
//				min = data1[i];
//			}
//		}
//		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
//	}
//	6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	
//	알고리즘 : 문자열 전체와 검색할 문자를 전달 받아서 문자를 키 값으로 새로운 배열에 담아서
//	새로운 배열에 반복문으로 전달 받은 문자의 위치를 출력
		
	void wordFinder(String content, char word) {
		char[] newContent = new char[content.length()];
		int count = 0;
 
		for (int i = 0; i < content.length(); i++) {
			newContent[i] = content.charAt(i);
			count++;
		}
		
		for (int i = 0; i < count; i++) {
			
			if (newContent[i] == word) {		
				System.out.printf("%c는 index[%d]에 있습니다.\n", word, i);
			}
		}
	
	}
	
	
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
//		String message = "문자열을 입력해주세요.";
		int[] arr = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println(message);
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
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
//		mt4.printMaxAndMinMethod(arr);
		
//		5번
//		int[] arr = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String message = "정수 5개를 입력해주세요. ex)1 2 3 4 5";
//		
//		System.out.println(message);
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		mt4.printMaxAndMin(arr);
		
//		6번
//		String message1 = "문자열을 입력해주세요. ex)scanner ", message2 = "찾으시는 문자를 입력해주세요. ex)n", content = "";
//		char text = ' ';
//		System.out.println(message1);
//		content = sc.nextLine();
//		System.out.println(message2);
//		text = sc.next().charAt(0);
//		
//		
//		mt4.wordFinder(content, text);
		
		
		
	} // main
}
