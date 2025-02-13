package objectTest;

import java.util.Objects;
//1. 기본 생성자
//2. 초기화 생성자
//3. private 붙이기
//4. getter, setter
//5. toString 재정의
//6. hashcode, equals 재정의

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {;}
	
	public Student(int id, String name, int age) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

	public static void main(String[] args) {
		Student student = new Student(1, "장재영", 20);
		
		if(student.equals(new Student(1, "장재영", 20))) {
			System.out.println("책 대여");
		}else {
			System.out.println("도난 신고");
		}
	}
}
