package array;

import java.util.Scanner;

public class MethodTest {
	
	public MethodTest() {;}

	public int countOccurrences(int[] arr, int targetNumber) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targetNumber) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int result = 0;
		int[] arr = {1, 2, 2, 2, 3};
		
		String message = "개수 : " ;
		result = mt.countOccurrences(arr, 2);
		
		System.out.println(message + result);
	}
}
