package control;
import java.util.Scanner;
public class KimEunJi {
	public static void main(String[] args) {
	//if구문과 for(또는 while구문)사용, break, continue사용
	//생각 -> 코드.
		
	//주사위 값 맞추기
	int num = (int)(Math.random()*6)+1;
	int cnt = 0;
			
		System.out.println("<주사위 게임>");
		System.out.println("던져진 주사위의 숫자를 맞춰보세요.");
	
	while(true){
		Scanner scn = new Scanner(System.in);
		cnt++;
		
		int num2 = scn.nextInt();
		if(num2 == num) {
			System.out.println("정답입니다.");
			break;
		} else if(num2 >= num) {
			System.out.println("정답보다 높은 수 입니다.");
			continue;
		} else if(num2 <= num) {
			System.out.println("정답보다 낮은 수 입니다.");
		}
	} System.out.printf("축하합니다.%d번 만에 맞추셨네요!",cnt);
	
		
		
	}
		
}


