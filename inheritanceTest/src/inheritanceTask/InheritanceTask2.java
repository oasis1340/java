package inheritanceTask;

// 상속 및 분리 실습
// Person 클래스
class Person {
	String name;
	int age;
	String address;
	String phoneNumber;
	
	
	public Person(String name, int age, String address, String phoneNumber) {
//		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}


	public Person() {;}
}
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다.
class Student extends Person {
	
	String insta;
	public Student() {;}
	
	public Student(String name, int age, String address, String phoneNumber, String insta) {
		super(name, age, address, phoneNumber);
		this.insta = insta;
	}
	
	@Override
	void work () {
		System.out.println("아르바이트를 한다.");
	}
	
	@Override
	void sleep () {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	
	@Override
	void eat () {
		System.out.println("아침을 거른다.");
	}
	
	
}
// Student 클래스
// 인스타아이디
// work 아르바이트를 한다.
// sleep 수업 시간에 잠을 잔다.
// eat 아침을 거른다.
class Employee extends Person {
	
	int exmoney;
	
	public Employee() {;}

	public Employee(String name, int age, String address, String phoneNumber, int exmoney) {
		super(name, age, address, phoneNumber);
		this.exmoney = exmoney;
	}
	
	@Override
	void work () {
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	void sleep () {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat () {
		System.out.println("야식을 먹는다.");
	}
	
}
// Employee 클래스
// 비상금
// work 하루 종일 일을 한다.
// sleep 잠을 설친다.
// eat 야식을 먹는다.

 

public class InheritanceTask2 {
//	메인 메서드 생성 후 객체화
//	각 메서드 출력하기
	public static void main(String[] args) {
		
		
		Person normal = new Person("행인", 35, "종로", "01012345678");
		Student student = new Student("학생", 15, "강남", "01011112222", "lo_vley");
		Employee footballer = new Employee("앙리", 40, "파리", "01014143232", 200_000_000);
		
		System.out.println(normal.name);
		normal.work();
		normal.sleep();
		normal.eat();
		
		System.out.println(student.name);
		student.work();
		student.sleep();
		student.eat();
		
		System.out.println(footballer.name);
		footballer.work();
		footballer.sleep();
		footballer.eat();
		
	}
}
