package control;

public class WhileExample {

	public static void main(String[] args) {
		int i = 1; //초기식
		while(i <= 10) {
			System.out.printf("i의 값은 %d\n", i); //여기서끝나면증감식이없어같은결과만반복
			i++;   //이렇게증감식넣어야정상적으로출력
		}
		System.out.println("###while구문보통이렇게씀###");
		boolean run = true;
		int cnt = 0;
		while(run) {     //while구문 = 조건에맞을때까지반복하겠다
			cnt = (int)(Math.random()*10)+1;
			System.out.println(cnt);
			if(cnt == 8) {
				run = false;
				//break;   while구문에 break;사용가능!
			}
		}
		System.out.println("끝");

	}

}
