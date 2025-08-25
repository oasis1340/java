package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> nums = new ArrayList<>();
		
		int count = sc.nextInt();
		int max = 0;
		double avg = 0;
		double sum = 0;
		
		for (int i = 0; i < count; i++) {
			int num = sc.nextInt();
			nums.add((double) num);
			
			if (num > max) {
				max = num;
			}
		}
		
		for (int j = 0; j < count; j++) {
			double num = nums.get(j);
			nums.set(j, num / max * 100);
		}
		
		
		for (int k = 0; k < count; k++) {
			double num = nums.get(k);
			sum += num;
		}
		
		avg = sum / count;
		
		System.out.println(avg);
	}
}
