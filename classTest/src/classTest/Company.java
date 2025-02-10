package classTest;

public class Company {

//	회사 필드 구성하기
//	이름, 나이, 수입
//	회사의 총 수입
	public Company() {;}
	
	static int money;
	String name;
	int age, income;
	
	public Company(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
		money += income;
	}
	
	
	
	public static void main(String[] args) {
		Company jjy = new Company("장재영", 20, 10000);
		Company hgd = new Company("홍길동", 20, 1000);
		Company lss = new Company("이순신", 20, 2000);
		Company jbg = new Company("장보고", 20, -20000);
		
		System.out.println("총 수입은 " + money + "입니다.");
	}
	
	
//	회사원은 총 4명
//	1번 +10000원
//	2번 +1000원
//	3번 +2000원
//	4번 -20000원
//	각 회사의 총 수입을 출력하기
	
}
