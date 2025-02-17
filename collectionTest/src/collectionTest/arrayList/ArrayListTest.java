package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
//public class ArrayListTest<T extends Number> {
//		<?> : 제네릭 - 포괄적인, 이름이 없는
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
//	T data;
	
	{
//		this.data = 20;
	}
	
	public static void main(String[] args) {
			
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(60);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		datas.add(100);
		System.out.println(datas.size());
		
//		try {
//			datas.get(10);
//		} catch (Exception IndexOutOfBoundsException) {
//			System.out.println("인덱스 똑바로 입력");
//		}
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
		
		Collections.shuffle(datas);
		
//		datas.forEach(datas.add(50, 500));
		if (datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}
		
		
//		수정 (90 -> 9) 수정
		
		if (datas.contains(90)) {
			try {
				datas.set(datas.indexOf(90), 9);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
			} 
		}
		
//		datas.replaceAll(n -> {
//			if (n == 90) {
//				return 9;
//			}else {
//				return n;
//			}
//		});
		
		
//		삭제 
//		80을 인덱스로 삭제
		if ( datas.contains(80)) {
			try {
//				wrapper 클래스
//				작은 것을 큰 것으로 감싸는 것
				
				datas.remove(datas.indexOf(80));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
			} 
		}
			
		
//		80을 값으로 삭제
		if (datas.contains(80)) {
			datas.remove((Integer)80);
		}
		
		
		System.out.println(datas);
	}
}
