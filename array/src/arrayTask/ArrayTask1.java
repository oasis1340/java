package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		
//		int[] arr1 = new int[5];
//		for (int i = 0; i < 5; i++) {	
//			arr1[i] = 10 - 2*i; 
//			System.out.println(arr1[i]);
//		}
//		System.out.print(arr1);
		
//      1~10까지 배열에 담고 출력

//		int[] arr2 = new int[10];
//		for (int i = 0; i < 10; i++) {
//			arr2[i] = 1 + i;
//			System.out.println(arr2[i]);
//		}
		
//      1~100까지 배열에 담은 후 홀수만 출력
		
//		int[] arr2 = new int[100];
//		
//		for (int i = 0; i < 50; i++) {
//			
//			for (int j = 0; j < 100; j++ ) {
//				arr2[j] = j + 1;
//			}
//			System.out.println(arr2[i*2]);
//		}
		
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arr3 = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < 50; i++) {
//			for (int j = 1; j <= 100; j++)
//				arr3[j-1] = j;
//			}
//			result += arr3[i];
//		}
//		System.out.println(result);
		
//      A~F까지 배열에 담고 출력
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
		
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값을 출력하기
		

//		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요 ex)1 2 3 4 5";
//		System.out.println(message);
//		int max = 0, min = 0;
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		
//		int[] arr6 = {num1, num2, num3, num4, num5};
//		max = arr6[0];
//		min = arr6[0];
//		for(int i = 1; i < 5; i++) {
//			int a = arr6[i];
//
//			if (max < a) {
//				max = a;
//			}
//			
//			if (min > a ) {
//				min = a;
//			}
//		}
//		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
		
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
		
		Scanner sc = new Scanner(System.in);
		String message = "정수의 개수를 입력해주세요. ex)5", addArrMessage = "%d번 째 정수를 입력해주세요. ex)3\n";
		String resultMessage = "모든 정수의 평균은 %.1f 입니다.";
		int count = 0;
		double avg = 0.0, total = 0.0;
		
		System.out.println(message);
		int length = sc.nextInt();		
		int[] arr1 = new int[length];
		
		for(int i = 0; i < length; i++) {
			count++;
			System.out.printf(addArrMessage, count);
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < length; i++) {
			total += arr1[i];
		}
		
		avg = total / length;
		
		System.out.printf(resultMessage, avg);
		
	}
}
