package control;
import java.util.Scanner; //같은클래스인데String은import필요없고얘만이러는이유?
						//java.lang.String;의 경우lang은기본패키지라 선언필요없음.
public class WhileExample2 {
	public static void main(String[] args) {
		String name = "홍길동";
		String age = "20";
		String phone = "010-0101-2345";
		
		// Scanner사용
		// 사용자가1입력-이름,2입력-나이,3입력-연락처 출력
		// 4입력-반복문 종료.
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.이름 2.나이 3.연락처 4.종료");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("이름: "+name);
			} else if(menu == 2) {
				System.out.println("나이:"+age);
			} else if(menu == 3) {
				System.out.println("연락처"+phone);
			} else if(menu == 4) {
				break;
			}
		} 
		System.out.println("끝");
		
	}
}
