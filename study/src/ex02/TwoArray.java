package ex02;

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		Scanner sc = new Scanner(System.in);
		String message1 = "배열의 행 길이 : ", message2 = "배열의 열 길이 : ";
		int row = 0, column = 0, count = 0;
		
		System.out.print(message1);
		row = sc.nextInt();
		System.out.print(message2);
		column = sc.nextInt();
		
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(arr[count] + " ");
				count++;
			}
			System.out.println("");
		}
		
	}

}
