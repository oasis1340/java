package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		
		int max = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		dice1 = sc.nextInt();
		dice2 = sc.nextInt();
		dice3 = sc.nextInt();
		
		
		if (dice1 == dice2 && dice2 == dice3) {
			total = 10000 + dice1 * 1000;
			System.out.println(total);
		}else if (dice1 == dice2 || dice1 == dice3) {
			total = 1000 + dice1 * 100;
			System.out.println(total);
		}else if (dice2 == dice3) {
			total = 1000 + dice2 * 100;
			System.out.println(total);
		}else {
			max = dice1;
			if (dice2 > max) {
				max = dice2;
			}
			if (dice3 > max) {
				max = dice3;
			}
			total = max * 100;
			System.out.println(total);
		}
	}
}
