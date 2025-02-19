package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTask2 {
	public static void main(String[] args) {
//		1) 5개의 문자열을 모두 소문자로 변경하기
//		"Black", "WHITE", "reD", "yeLLow", "PINK"
//		ArrayList<String> str = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINK"));
//		ArrayList<Character> cc = new ArrayList<Character>();
//		str.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
		
//		"Black".chars().forEach((c) -> cc.add((char)c));
//		"WHITE".chars().forEach((c) -> cc.add((char)c));
//		"reD".chars().forEach((c) -> cc.add((char)c));
//		"yeLLow".chars().forEach((c) -> cc.add((char)c));
//		"PINK".chars().forEach((c) -> cc.add((char)c));
//		
//		cc.stream().map(c ->  c > 64 && 91 > c ? (char)(c+32) : c).forEach(System.out::print);
		
//		str.stream().map((c) -> {c > 64 && 91 < c ? (char)c+32 : c;});
		
//		2) Apple, banana, Melon, cherry, "딸기"
//		단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
		ArrayList<String> str2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
//		str2.stream().filter(st -> st.contains("A") || st.contains("M")).forEach(System.out::println);;
		str2.stream()
			.filter(ss -> ss.charAt(0) >= 'A')
			.filter(ss -> ss.charAt(0) <= 'Z')
			.forEach(System.out::println);
//		3) 한글을 정수로 변경
//		"일공이사" -> 1024
//		ArrayList<String> str3 = new ArrayList<String>(Arrays.asList("일공이사"));
//		str3.stream().map(stt -> stt.replace("일공이사", "1024")).forEach(pp -> System.out.println(Integer.parseInt(pp)));
		String hangle = "공일이삼사오육칠팔구";
		String input = "일공이사";
		input.chars().map(i -> hangle.indexOf(i)).forEach(System.out::print);
		
//		4) 정수를 한글로 변경
//		"1024" -> "일공이사"
//		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1024));
		String hangle2 = "공일이삼사오육칠팔구";
		String data = "1";

		hangle2.charAt(Integer.parseInt(data));
		
		data.chars().map(c -> c - 48).forEach(i -> {
			System.out.println(hangle2.charAt(i));
		});
		
//		IntStream.range(0, 5).filter(null)
		
		
	}
}
