package objectTest;

public class EqualsTest {
	public String[] getLotto() {
		String[] lotto = new String[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = String.valueOf((int)Math.floor(Math.random() * 10 + 1));
			for (int j = 0; j < i; j++) {
				if(lotto[j].equals(lotto[i])) {
					i--;
					break;
				}
			}
		}
		
		
		return lotto;
	}
	
	
	
	
   public static void main(String[] args) {
//      String data1 = "ABC";
//      String data2 = "ABC";
//      String data3 = new String("ABC");
//      String data4 = new String("ABC");
//            
//      System.out.println(data1);
//      System.out.println(data2);
//      System.out.println(data3);
//      System.out.println(data4);
//      System.out.println(data1.equals(data4));
//      System.out.println(data1 == data3);
      EqualsTest lotto = new EqualsTest();
      String[] lottoNumber = new String[6];
      lottoNumber = lotto.getLotto();
      
      for(int i = 0; i < 6; i++) {
    	  System.out.print(lottoNumber[i] + " ");
      }
      
      
      
      
      
      
   }
}
