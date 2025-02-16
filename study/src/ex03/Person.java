package ex03;

public class Person {
	String name;
	int age;
	String job;
	String hobby;
	
	public Person() {;}

	public Person(String name, int age, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}
	
	public void printName() {
		System.out.println(name); 
	}
	
	public void work() {
		System.out.printf("%s는 하는 일이 없습니다.\n", job);
	}
	
	public void hobby() {
		System.out.printf("취미는 %s 입니다.\n", hobby);
	}


	public static void main(String[] args) {
		
		Person ps = new Person();

//		Student(int number, String name, int age, String job, String hobby)
		Person st = new Student(17, "장재영", 20, "학생", "음악 감상");
		Person pg = new Programmer(true, "재영", 30, "개발자", "영화 감상");
		
		Student st1 = (Student)st;
		Programmer pg1 = (Programmer)pg;
		
		st1.work();
		st1.hobby();
		System.out.println();
		st1.printNumber();
		
		pg1.work();
		pg1.hobby();
		System.out.println();
		pg1.isNoteBook();
		
	}
	
}
