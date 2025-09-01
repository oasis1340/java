package algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.next().toUpperCase();
        
        int max = -1;
        char result = '0';
        int[] count = new int[26];
        
        for (int i = 0; i < text.length(); i++) {
        	count[text.charAt(i) - 'A']++;
        }
        
        for (int i = 0; i < 26; i++) {
        	if (count[i] > max) {
        		max = count[i];
        		result = (char) (i + 'A');
        	} else if (count[i] == max) {
        		result = '?';
        	}
        }
        
        System.out.println(result);
    }
}
