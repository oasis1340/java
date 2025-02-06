package forTask;

import java.util.Scanner;

public class ForTask1 {

	public static void main(String[] args) {
//      브론즈
//      1~100까지 출력하기
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i+1);
//		}
//      100~1까지 출력하기
//		for(int i = 100; i > 0; i--) {
//			System.out.println(i);
//		}
//      1~100까지 중 짝수만 출력하기
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
      
//      골드
//      1~10까지의 합을 출력하기
//		int result = 0;
//		for(int i = 0; i <= 10; i++) {
//			result += i;
//		}
//		System.out.println(result);
//      1~n까지의 합을 출력하기
		
//		Scanner sc = new Scanner(System.in);
//		String message = "값을 입력해주세요 : ", resultMessage = "1~%d까지의 합은 %d 입니다.";
//		int num = 0, result = 0;
//		
//		System.out.print(message);
//		num = sc.nextInt();
//		for(int i=0; i < num+1; i++) {
//			result += i;
//		}
//		
//		System.out.printf(resultMessage, num, result);
		
//      플레티넘
//      A~F까지 출력하기
//		System.out.println('A' + 1);
//		for(int i=0; i<6; i++) {
		
//			char text = 'A';	
//			System.out.println((char)(text + i));
//			
//		}
//      A~F까지 중 C를 제외하고 출력하기
//		for(int i=0; i<6; i++) {
//			
//			char text = 'A';
//			if (i == 2) {
//				continue;
//			}
//			System.out.println((char)(text + i));
//		}
//      
//      다이아
//      012340123401234 출력하기
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(j);
//			}
//		}
//      aBcDeF...Z까지 출력하기
//		for (int i = 0; i < 13; i++) {
//			char text1 = 'a';
//			char text2 = 'B';
//			System.out.print((char)(text1 + i*2));
//			System.out.print((char)(text2 + i*2));
//		}
//      
//      마스터
//      별찍기
//       *
//      ***
//     *****
//    *******
//   *********		
		char star = '*';
		char space = ' ';
		for (int i = 0; i < 5; i++) {
			
			for (int k = i; k < 5; k++) {
				System.out.print(space);
			}
			
			for (int j = 4-2*i; j < 5; j++) {
				System.out.print(star);		
			}
			
			System.out.println("");
		}
		
	}
}
