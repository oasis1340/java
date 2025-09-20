package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            String[] num = (n.split(""));
            nums.add(Integer.parseInt(num[i]));
        }

        Collections.sort(nums);
        Collections.reverse(nums);
        
        for (int i = 0; i < nums.size(); i++) {
        	System.out.print(nums.get(i));
        }
    }
}
