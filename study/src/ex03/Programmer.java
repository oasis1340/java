package ex03;

public class Programmer extends Person {
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
			System.out.print(arData[i] + " ");
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
	
	
}
