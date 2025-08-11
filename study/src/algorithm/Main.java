package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			int remainder = num % 42;
			nums.add(remainder);
		}
		
		List<Integer> remainders = nums.stream().distinct().collect(Collectors.toList());
		
		System.out.println(remainders.size());
	}
}
