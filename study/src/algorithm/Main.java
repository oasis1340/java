package algorithm;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String ra = new StringBuilder(a).reverse().toString();
		String rb = new StringBuilder(b).reverse().toString();
		
		if (Integer.parseInt(ra) > Integer.parseInt(rb)) {
			System.out.println(ra);
		} else {
			System.out.println(rb);
		}
	}
}
