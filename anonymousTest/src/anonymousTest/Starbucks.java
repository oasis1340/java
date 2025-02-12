package anonymousTest;

public class Starbucks {
	
	public void register(Form form) {
		String[] menu = form.getMenus();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
//		판매 중인 곳인지, 무료나눔을 하고 있는 곳인지 판단
		if (form instanceof Form) {
			form.sell("아메리카노");			
		} else{
			form.free("에이드");			
		}
	}
}
