package lambdaTask2;
	
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	public static void main(String[] args) {	
		//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		PrintNum printUpTo10 = (num1, num2) -> {
			int total = 0;
			for (int i = num1; i <= num2; i++) {
				total += i;
			}
			return total;
		};
		int result1 = printUpTo10.printNum(1, 10);
		System.out.println(result1);
		
		//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
		PrintString strCount = (content, c) -> {
			int count = 0;
			char[] contentBox = new char[content.length()];

			for (int i = 0; i < contentBox.length; i++) {
				if (contentBox[i] == c) {
					count++;
				}
			}
			return count;
		};
		
		int result2 = strCount.getCharCount("abcccc", 'c');
		System.out.println(result2);
		
		//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
		
		Reverse reverseString = (content) -> {
			char[] contentBox = new char[content.length()];
			char[] reverseBox = new char[content.length()];
			for (int i = 0; i < content.length(); i++) {
				contentBox[i] = content.charAt(i);
			}
			for (int i = 0; i < contentBox.length; i++) {
				reverseBox[i] = contentBox[contentBox.length - i - 1];
			}
			return reverseBox;
			
		};
		char[] result3 = reverseString.getReverseString("abcd");
		System.out.println(result3);
		
		//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
		
		Remove removeStr = (content, c) -> {
			char[] contentBox = new char[content.length()];
			String a = "";
			
			for (int i = 0; i < contentBox.length; i++) {
				if (content.charAt(i) != c) {
					a += content.charAt(i);
				}
			}
			return a;
		};
		String result4 = removeStr.removeText("abcacc", 'c');
		System.out.println(result4); 
		
		//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
		//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		
		Dedupe getDedupe = (content) -> {
			char[] contentBox = new char[content.length()];
			for (int i = 0; i < content.length(); i++) {
				contentBox[i] = content.charAt(i);
			}
			
 		};
	}
}
