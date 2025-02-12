package lambdaTask2;

@FunctionalInterface
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
public interface Reverse {
	public char[] getReverseString(String content);
}
