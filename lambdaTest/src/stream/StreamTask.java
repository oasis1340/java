package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
//		1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		IntStream.range(0, 10).forEach((num) -> {
			arr.add(num+1);
		});
		System.out.println(arr);
//		2) ABCDEF를 각 문자별로 출력하기
		"ABCDEF".chars().forEach((c) -> {System.out.println((char)c);});
//		3) 1~100까지 홀수만 ArrayList에 담고 출력하기
		IntStream.range(0, 100).forEach((num) -> {
			arr.add(num+1);
		});
		arr.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
//		4) A~F 중 D를 제외하고 ArrayList에 담고 출력하기
		ArrayList<String> str = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
//		ArrayList<String> str = new ArrayList<String>();
		str.stream().filter(n -> n != "D").forEach(System.out::println);
		
	}
}
