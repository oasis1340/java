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
		System.out.printf("%s은 하는 일이 없습니다.\n", job);
	}
	
	public void hobby() {
		System.out.printf("취미는 %s 입니다.\n", hobby);
	}
}
	
class Student extends Person{
	int number;
	public Student() {;}
		
	public Student(int number, String name, int age, String job, String hobby) {
		super(name, age, job, hobby);
		this.number = number;
	}
		
	@Override
	public void work() {
		System.out.printf("%s는 공부를 합니다.\n", job);
	}
	
	@Override
	public void hobby() {
		for(int i = 0; i < 10; i++) {
			System.out.print( i+1 + " ");
		}
	}
	
	public void printNumber() {
		System.out.printf("학생의 이름은 %s 이며 학번은 %d 입니다.\n", name, number);
	}
	
	class Programmer extends Person {
		boolean notebook;
			
			public Programmer() {;}

			public Programmer(boolean notebook, String name, int age, String job, String hobby) {
				super(name, age, job, hobby);
				this.notebook = notebook;
			}
			
			@Override
			public void hobby() {
				String[] arData = {"A", "B", "C", "D"};
				for (int i = 0; i < arData.length; i++) {
					System.out.println(arData[i]);
				}
			}
			
			public void isNoteBook() {
				if (notebook = true) {
					System.out.println("노트북이 있습니다.");
				} else {
					System.out.println("노트북이 없습니다.");
				}
			}

			@Override
			public String toString() {
				return "Programmer [notebook=" + notebook + "]";
			}


		

	public static void main(String[] args) {
		
		Person ps = new Person();

//		Student(int number, String name, int age, String job, String hobby)
		Person st = new Student(1, "장재영", 20, "학생", "음악 감상");
		Person pg = new Programmer(true, "재영", 30, "개발자", "영화 감상");
		
		Student st1 = (Student)st;
		Programmer pg1 = (Programmer)pg;
		
		ps.work();
		
		System.out.println("외않되");
		
		st1.work();
		st1.hobby();
		st1.printNumber();
		
		pg1.work();
		pg1.hobby();
		pg1.isNoteBook();
		
	}
	}
}


