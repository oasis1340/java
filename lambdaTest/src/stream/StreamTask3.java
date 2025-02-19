package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
		
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		
//		1) 1~50까지 ArrayList에 담고 출력하기
//		ArrayList<Integer> num = new ArrayList<Integer>();
//		IntStream.range(0, 50).forEach((n) -> {
//			num.add(n);
//		});
//		System.out.println(num);
		
//		2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
//		ArrayList<Integer> num1 = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach((n) -> {
//			num1.add(n);
//		});
//		num1.stream().filter((f) -> f % 2 == 1).forEach(System.out::println);
		
//		3) 1~50까지 ArrayList에 짝수만 담고 출력하기
//		ArrayList<Integer> num3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 50).filter(num -> num % 2 == 0).forEach((n) -> {
//			num3.add(n);
//		});
//		num3.forEach(System.out::print);
		
//		4) a~z까지 ArrayList에 담고 출력하기
//		ArrayList<Character> c = new ArrayList<Character>();
//		IntStream.rangeClosed('a', 'z').forEach((cc) -> {
//			c.add((char)cc);
//		});
//		c.forEach(System.out::print);
		
		
//		5) a~z까지 ex) aceg.. 하나씩 건너뛰고 ArrayList에 담고 출력하기
//		ArrayList<Character> c1 = new ArrayList<Character>();
//		IntStream.rangeClosed('a', 'z').filter((ch)-> ch % 2 == 1).forEach((ccc) -> {
//			c1.add((char)ccc);
//		});
//		c1.forEach(System.out::print);
//		
//		6) 1~50까지 ArrayList에 담고 10~20만 출력하기
//		ArrayList<Integer> num6 = new ArrayList<Integer>();
//		IntStream.range(0, 50).forEach((ab) -> {
//			num6.add(ab);
//		});
//		IntStream.rangeClosed(1, 20).forEach(System.out::print);
		
//		7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
//		ArrayList<Integer> num7 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((nums7) -> {
//			num7.add(nums7);
//		});
//		int sum = num7.stream().filter((ns7) -> ns7 % 2 == 0).reduce(0, (a,b) -> a+b);
//		System.out.println(sum);
		
//		8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
//		ArrayList<String> str = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
//		str.stream().filter(s -> s.contains("a")).forEach(System.out::println);
//		
//		9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//		ArrayList<Integer> num9 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(num -> {
//			num9.add(num);
//		});
//		int sum = num9.stream().reduce(0,(a,b) -> a+b);
//		System.out.println(sum);
		
		
		
		
		
		
//	      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//	      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//	      필드 : 이름, 취미, 소개
//	      홍길동, 축구_농구_야구, 나는 축구왕!
//	      이순신, 개발_당구_축구, 나는 개발자 좋아!
//	      장보고, 피아노, 피아노만 한 우물!
//	      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//	      김영희, 골프_야구, 운동 선수는 나의 꿈
//	      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
//		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		int sum = num1.stream().reduce(0, (a, b) -> a + b);
//		
//		System.out.println(sum);
		
		ArrayList<Member> member = new ArrayList<Member>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		member.add(member1);
		member.add(member2);
		member.add(member3);
		member.add(member4);
		member.add(member5);
		member.add(member6);
		
		member.stream().filter(str -> str.getHobby().contains("개발")).forEach(System.out::println);
		
		
	}
}
