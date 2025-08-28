package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (arr[c - 'a'] == -1) {
				arr[c - 'a'] = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
