package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        ArrayList<String> print = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
        	int repeat = sc.nextInt();
        	String text = sc.next();
        	
        	String result = "";
        	for (int j = 0; j < text.length(); j++) {
        		for (int k = 0; k < repeat; k++) {
        			result += text.charAt(j);
        		}
        	}
        	print.add(result);
        }
        
        for (int i = 0; i < print.size(); i++) {
        	System.out.println(print.get(i));
        }
    }
}
