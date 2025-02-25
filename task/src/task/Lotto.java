package tms;

import java.util.Objects;
import java.util.Scanner;

public class Lotto extends Person{
	
	private int id;
	private static String[] lottoNumbers;
	
	public Lotto() {;}
	
	public Lotto(int id) {
		super();
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String[] getLottoNumbers() {
		return lottoNumbers;
	}

	public static void setLottoNumbers(String[] lottoNumbers) {
		Lotto.lottoNumbers = lottoNumbers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return id == other.id;
	}

	public String[] drawNumber() {
		String[] lotto = new String[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for (int j = 0; j < i; j++) {
				if(lotto[j].equals(lotto[i])) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	
	public void sellLotto(String job) {
		
		switch(job) {
		case "회사원" : {
			System.out.println("(회사원)로또를 구매 했습니다");
			break;
		}
		case "연구원" : {
			System.out.println("(연구원)로또를 구매 했습니다");
			break;
		}
		default : {
			System.out.println("로또를 구매할 수 없습니다");
			break;
		}
		}
	}
	
	public void byeCompany(String job, int count) {
		if ( job == "회사원" && count == 6) {
			System.out.println("직장을 그만둔다");
		}else {
			System.out.println("다시 일한다.");
		}
	}
	public void saveMoney(String job, int count) {
		if ( job == "회사원" && count == 5) {
			System.out.println("전액을 저축한다");
		}else {
			System.out.println("다시 돈 번다.");
		}
	}
	public void investLab(String job, int count) {
		if ( job == "연구원" && count == 6) {
			System.out.println("연구에 투자한다");
		}else {
			System.out.println("나에게 투자한다.");
		}
	}
	public void buyFood(String job, int count) {
		if ( job == "연구원" && count == 6) {
			System.out.println("지인에게 밥을 산다");
		}else {
			System.out.println("집에 쌀을 산다.");
		}
	}
	
	
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner sc = new Scanner(System.in);
		
		String[] lotto1stNum = new String[6];
		String[] lottoNum = new String[6];
		String lotto1stNumText = "이번주 로또 번호 : ";
		String lottoNumText = "당신의 로또 번호 : ";
		String correctNumText = "맞은 개수 : ";
		int count = 0;
		
		Person person = new Person();
		Person employee = new Employee();
		Person researcher = new Researcher();
		
		Person kim = new Employee(1,"일당백", 20, "01077776666", "IT");
		Employee kim1 = (Employee)kim;
		
		Person park = new Researcher(2, "한우물", 35, "01044467878", "식물연구");
		Researcher park1 = (Researcher)park;
		
//		person.work();
//		employee.work();
//		researcher.work();
		
		Babo jjy = new Babo("회사원");
//		Babo jjy = new Babo("연구원");
//		Babo jjy = new Babo("홈프로텍터");
		
		lotto.sellLotto(jjy.getJob());
		
		
		if ( jjy.getJob() == "회사원" | jjy.getJob() == "연구원") {
			
			String message = "로또 번호(1~45) 6개를 입력 해주세요 ex)1 10 20 30 40 45";
			
			
			System.out.println(message);
			
			for (int i = 0; i < 6; i++) {
				lottoNum[i] = sc.next();
			}
			
			
			lotto1stNum = lotto.drawNumber();
			
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if (lottoNum[i].equals(lotto1stNum[j])) {
						count++;
					}
				}
			}
			
			for (int i = 0; i < 6; i++) {
				lotto1stNumText += lotto1stNum[i] + " ";
				lottoNumText += lottoNum[i] + " ";
			}
			
			correctNumText += count;
			
			System.out.println(lotto1stNumText);
			System.out.println(lottoNumText);
			System.out.println(correctNumText);
			
			if (jjy.getJob() == "회사원" && count == 6) {
				lotto.byeCompany(jjy.getJob(), count);
				lotto.saveMoney(jjy.getJob(), count);
			} else if (jjy.getJob() == "회사원" && count < 6) {
				lotto.byeCompany(jjy.getJob(), count);
				lotto.saveMoney(jjy.getJob(), count);
			}
			
			if (jjy.getJob() == "연구원" && count == 6) {
				lotto.investLab(jjy.getJob(), count);
				lotto.buyFood(jjy.getJob(), count);
			} else if (jjy.getJob() == "연구원" && count < 6) {
				lotto.investLab(jjy.getJob(), count);
				lotto.buyFood(jjy.getJob(), count);
			}
			
			
		}
		
		
	}
}
