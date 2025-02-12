package lambdaTask2;
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
@FunctionalInterface

public interface PrintNum {
	public int printNum (int num1, int num2);
}
