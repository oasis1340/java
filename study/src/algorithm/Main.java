package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = 0;
    	int count = sc.nextInt();
    	
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	
    	for (int i = 0; i < count; i++) {
    		num = sc.nextInt();
    		nums.add(num);
    	}
    	
    	Collections.sort(nums);
    	
    	for (int i = 0; i < nums.size(); i++) {
    		System.out.println(nums.get(i));
    	}
    }    
}
