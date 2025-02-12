package lambdaTask2;
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
@FunctionalInterface
public interface Dedupe {
	public char[] dedupe (String content);
}
