package classTest;

class Market {
//	상품, 가격, 재고
//	sell() 메서드
	String product;
	int price;
	int stock;
//	기본 생성자
	public Market() {;}
	
	{
		this.stock = 0;
	}
//	초기화 생성자
	
	
	void sell(Customer customer) {
		System.out.printf("우유 재고 : %d\n", stock);
		stock --;
		System.out.printf("남은 재고 : %d\n", stock);
	}
	public Market(String product, int price, int stock) {
		super();
		this.product = product;
		this.price = price;
		this.stock = stock;
	}
	
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	String name;
	String phoneNumber;
	int money;
	double discount;
	
	public Customer() {;}
	
	public Customer(String name, String phoneNumber, int money, double discount) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.discount = discount;	
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈 출력
//		마켓 상품의 재고 출력
		Market milk = new Market("우유", 3_000, 10);
		Customer jjy = new Customer("장재영", "010-2564-1340", 100_000, 0.3);
//		Market mk = new Market();
		System.out.println(jjy.name);
		System.out.println(milk.price);
	}
}