package synchronizedTest;

public class ATM implements Runnable{
	int money = 10000;
	
	public ATM() {;}
	
	public void withdraw(int money) {
		
//		synchronized(객체) {}
//		synchronized(this) {
//			this.money -= money;
//			
//		}
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
			
//			Thread.interrupted();
//			- 쓰레드가 멈춰있을때만 종료할 수 있다.
//			while(!Thread.interrupted()) {
//				System.out.println("쓰레드 작업중");
//			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
