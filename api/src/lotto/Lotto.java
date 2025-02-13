package lotto;

public class Lotto {
	public String[] drawNumber() {
		String[] luckyNumberArray = new String[6];
		
		for (int i = 0; i < 6; i++) {
			luckyNumberArray[i] = String.valueOf((int)Math.floor(Math.random() * 45 + 1));
			for (int j = 0; j < i; j++) {
				if (luckyNumberArray[j].equals(luckyNumberArray[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumberArray;
	}
	public String[] checkLotto (String job) {
		String[] lotto = new String[6];
		switch(job) {
		case "회사원" :{
			lotto = drawNumber();
			return lotto;
		}
		case "연구원" : {
			lotto = drawNumber();
			return lotto;
		}
		default : {
			System.out.println("로또를 구매할 수 없습니다.");
			return lotto;
		}
		}
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		String[] lotto1st = new String[6]; // 로또 1등 번호
		String[] lotto1 = new String[6]; // 구매한 로또 번호
		int count = 5; // lotto1의 로또 번호 맞은 개수

		lotto1st = lotto.drawNumber(); // 1등 번호 받기
		String lotto1stText = "";
		String message = "이번주 당첨 번호 : ";
		
		
		Job person = new Job("회사원");
//		Job person = new Job("연구원");
//		Job person = new Job("자택 경비원");
		
		// 직업을 비교해서 로또 번호 받기
		lotto1 = lotto.checkLotto(person.getJob());
		
//		for (int i = 0; i < lotto1.length; i++) {
//			System.out.println(lotto1[i]);
//		}
		
		// 로또 1등 번호를 출력하기 위해서 붙여넣기
		for (int i = 0; i < lotto1st.length; i++) {
			lotto1stText += lotto1st[i] + " ";
		}
		
		if (person.getJob() == "회사원" | person.getJob() == "연구원") {
			
			System.out.println(message + lotto1stText);	
			// 로또 번호 받기
			
			for(int i = 0; i < lotto1st.length; i++) {
				
				for(int j = 0; j < lotto1st.length; j++) {
					if (lotto1[i].equals(lotto1st[j])) { 
						count++; // 비교해서 맞은 개수만큼 카운트 증가
//				ex) 1 2 3 -> 3 4 5
					}				
				}
			}
			
			System.out.print("번호 : ");
			for (int i = 0; i < lotto1.length; i++) {
				System.out.print(lotto1[i] + " ");
			}
			
			System.out.println("");
			
			System.out.printf("맞은 개수 : %d\n", count);
			
			if (person.getJob() == "회사원" && count == 6) {
				System.out.println("직장을 그만 둔다.");
			}
			if (person.getJob() == "회사원" && count == 5) {
				System.out.println("전액을 저축 한다.");
			}
			if (person.getJob() == "연구원" && count == 6) {
				System.out.println("연구에 투자한다.");
			}
			if (person.getJob() == "연구원" && count == 5) {
				System.out.println("지인에게 밥을 산다.");
			}
		}
		
	}
}
