package reference;

public class WhileExample {
	public static void main(String[] args) {
		
		System.out.println("문1.");
		//while 반복문.while에 참 또는 거짓값주기, 참값주면 중괄호안에 false값 나오도록 조건주기
		//증감식필수
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("문2.");
		//1~10 짝수만 출력.
		boolean run = true;
		i = 1;
		while(run) {
			if(i%2==0) {
				System.out.println(i);
			}
			if (i == 10)
				run = false;
			i++;
		}
		
		while(true) {
			if (i == 11) {
				break;
			}
		}
	}

	
}
