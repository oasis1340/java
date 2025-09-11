package algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int length = sc.nextInt();
        
        int result = width * length;
        
        System.out.println(result);
        
    }
}
