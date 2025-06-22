package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(0 <= h && h <= 23 && 0 <= m && m <= 59) {
			if (h == 0 && m < 45) {
				m = 60 + (m-45);
				h = 23;
				System.out.printf("%d %d", h, m);
				
			}else if(m < 45) {
				m = 60 + (m-45);
				h -= 1;
				System.out.printf("%d %d", h, m);
			}else {
				m -= 45;
				System.out.printf("%d %d", h, m);
			}
		}
	}
}
