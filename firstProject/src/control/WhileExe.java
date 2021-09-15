package control;

public class WhileExe {
	public static void main(String[] args) {
		// Q1.while 구문을 1~10까지 출력
		// (정답) 
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
		}//나는 이렇게나 길게 함ㅠㅠㅠㅠㅠㅠ
		System.out.println("문제1.끝");
		// Q2.while 구문을 2,4,6,8,10만 출력
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i);
			} i++;
		}
		System.out.println("문제2.끝");
		// Q3.while 구문을 1,3,5,7,9만 출력
		
	}

}
