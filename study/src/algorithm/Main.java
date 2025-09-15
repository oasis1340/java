package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = 0;
    	int sum = 0;
    	int avg = 0;
    	int mid = 0;
    	
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	
    	for (int i = 0; i < 5; i++) {
    		num = sc.nextInt();
    		nums.add(num);
    		sum += num;
    	}
    	
    	Collections.sort(nums);
    	
    	avg = sum / 5;
    	mid = nums.get(2);
    	
    	System.out.println(avg);
    	System.out.println(mid);
    }    
}
