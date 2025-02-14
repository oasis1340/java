package lotto;

public class Luck {
	public String[] drawNumber() {
		String[] lotto = new String[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = String.valueOf((int)(Math.floor(Math.random() * 10 + 1)));
			for (int j = 0; j < i; j++) {
				if(lotto[j].equals(lotto[i])) {
					
				}
			}
		}

		return lotto;
	}
	
	public String[] checkLotto(String job) {
		String[] lotto = new String[6];
		
		switch(job) {
		case "회사원" : {
			lotto = drawNumber();
		}
		case "연구원" : {
			lotto = drawNumber();
		}
		default : {
			
		}
		}
		return lotto;
	}
		
	
//	public static void main(String[] args) {
//		Luck luck = new Luck();
//		String[] lotto = new String[6];
//		
//		lotto = luck.drawNumber();
//		
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//	}
}
