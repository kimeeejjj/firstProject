package control;

public class WhileExe {
	public static void main(String[] args) {
		// Q1.while 姥庚聖 1~10猿走 窒径
		// (舛岩) 
		// int i = 1;
		// while(i <= 10) {
		//   system.out.println(i);
		//   i++; }
		boolean run = true;
		int num = 0;
		while (run) {
			num += 1;
			System.out.println(num);
			if (num == 10) {
				run = false;
			} 
		}//蟹澗 戚係惟蟹 掩惟 敗ばばばばばば
		System.out.println("庚薦1.魁");
		// Q2.while 姥庚聖 2,4,6,8,10幻 窒径
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i);
			} i++;
		}
		System.out.println("庚薦2.魁");
		// Q3.while 姥庚聖 1,3,5,7,9幻 窒径
		
	}

}
