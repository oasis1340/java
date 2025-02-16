package ex03;

public class Student extends Person{
	int number;
	public Student() {;}
		
	public Student(int number, String name, int age, String job, String hobby) {
		super(name, age, job, hobby);
		this.number = number;
	}
		
	@Override
	public void work() {
		System.out.printf("%s은 공부를 합니다.\n", job);
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

	@Override
	public String toString() {
		return "Student [number=" + number + "]";
	}
	
	
}
