package lambdaTask2;

@FunctionalInterface
public interface PrintString {
	//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
	public int getCharCount (String content, char c);
}
