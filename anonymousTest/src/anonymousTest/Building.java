package anonymousTest;

//	실습
//	잠실점 오픈
//	무료나눔 행사중
//	무료나눔 행사중이라면, "무료나눔 행사 승인" 출력
//	무료나눔 행사 중이 아니라면, 판매


public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매 완료");
						break;
					}
					
				}
				
			}
		});
//		잠실점 등록
		Starbucks jamsil = new Starbucks();
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			
			@Override
			public void free(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 나눔 완료");
						break;
					}
				}
			}
		});
	}
}
