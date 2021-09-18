package practiced;

public class Pr5 {
	public static void main(String[] args) {
		// while구문으로 1~10까지 출력하기
		int i = 1;
		while (true) {
			System.out.println(i);
			if (i >= 10) {
				break;
			}
			i++;
		}
		// while구문을 2,4,6,8,10 짝수만 출력
		i = 1;
		boolean a = true;
		while (a) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
			if (i == 11) {
				a = false;
			}
		}
	
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		i=1;
		while(i<=10) {
			if(i%2==1) {
			System.out.println(i);
			}
			i++;
		}
	}
}
