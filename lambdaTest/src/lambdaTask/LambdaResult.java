package lambdaTask;

public class LambdaResult {
	public static void main(String[] args) {
//		람다식 구현
		PrintName printName = (lastName, firstName) -> lastName + firstName;
		System.out.println(printName.getFullName("장", "재영"));
	}
}
