package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
                
        String factor = "factor";
        String multiple = "multiple";
        String neither = "neither";
        
        ArrayList<String> result = new ArrayList<String>();
        
		while ( true ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a != 0 && b != 0) {
				if ( a >= b && a % b == 0 ) {
					result.add(multiple);
				} else if ( a < b && b % a == 0 ) {
					result.add(factor);
				} else if ( a % b != 0 || b % a != 0 ) {
					result.add(neither);
				}
			}
			if ( a == 0 && b == 0) {
				break;
			}
		}
        
        for (int i = 0; i < result.size(); i++) {
        	System.out.println(result.get(i));
        }
    }
}
