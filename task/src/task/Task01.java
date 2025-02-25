package task;

import java.util.Scanner;

public class Task01 {
	
	
	public int[] songs(int coin) {
		int[] songs = new int[coin];
		for (int i = 0; i < coin; i++) {
			songs[i] = (int)Math.floor(Math.random() * 100);
//			if (songs[i] >= 80) {
//				coin++;
//			}
		}
		return songs;
	}
	//<코인노래방 프로그램>
	   //
	   //메뉴
//	      1. 금액 입력하기
//	         노래 한 곡당 300원,
//	         금액을 입력 받아서 부를 수 있는 곡 수
//	         잔돈을 반환 한다.
//	      2. 노래 부르기
//	         노래 점수가 랜덤으로 나온다.
//	         이 때 노래 점수가 80점 이상이면 노래 한 곡을 서비스로 준다.
//	         50점 미만이면 노래 한 곡 차감
//	      3. 나의 실력 확인하기
//	         지금까지 불렀던 노래의 평균 점수가 보여진다.
//	      4. 종료
//	               프로그램이 종료된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task01 ts = new Task01();
		
		System.out.println("한 곡당 300원 입니다.");
		System.out.println("금액을 입력해주세요. ex) 8000");
		int money = sc.nextInt();
		int coin = money / 300;
		int ex = money % 300;
		System.out.printf("%d곡을 넣어드렸습니다. 거스름돈 : %d원 \n", coin, ex);
		
		int[] songs = ts.songs(coin);
		
		
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < coin; i++) {
			sum += songs[i];
		}
		avg = sum / coin;
		
		
		System.out.printf("평균 점수 : %d\n", avg);
		
		
	}
}
