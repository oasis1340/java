package ex01;

public class Calculator {

	public void calcNum1 (int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public double calcNum2 (int num1, double num2) {
		return num1 + num2;
	}
	
	public int calcNum3 (double num) {
		return (int)num;
	}
	
	public void calcNum4 (String a, String b) {
		System.out.println(a + b);
	}
	
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double result1 = 0.0;
		int result2 = 0;
		
		calc.calcNum1(5, 9);
		result1 = calc.calcNum2(5, 9.35);
		System.out.println(result1);
		result2 = calc.calcNum3(5.35);
		System.out.println(result2);
		calc.calcNum4("5", "9");
	}
}
