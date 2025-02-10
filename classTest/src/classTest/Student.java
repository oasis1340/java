package classTest;

import java.util.Scanner;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수를 입력 받고
//	총점과 평균을 출력하기
	int number;
	String name;
	int koreaScore;
	int englishScore;
	int mathScore;
	static int total; 
	double average;
	
	public Student() {;}
	
	public Student(int number, String name, int korS, int engS, int mathS) {
		this.number = number;
		this.name = name;
		this.koreaScore = korS;
		this.englishScore = engS;
		this.mathScore = mathS;
		total = korS + engS + mathS;
//		this.average = (korS + engS + mathS) / 3;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message1 = "학번을 입력해주세요 : ", message2 = "이름을 입력해주세요 : ", message3 = "국어 점수를 입력해주세요 : ";
		Student jjy = new Student(17, "장재영", 80, 90, 100);
		
		System.out.println(jjy.number + "학번 " + jjy.name + " 학생의 총점은 " + total + "이고 평균 점수는 " + jjy.average + "점 입니다.");
	}
	
}
