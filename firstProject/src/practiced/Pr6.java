package practiced;
import java.util.Scanner;
public class Pr6 {
	public static void main(String[] args) {
		//메뉴 선택
		//이름,나이,연락처,종료
		String name = "김은지";
		int age = 25;
		String phone = "010-8370-1707";
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.이름 2.나이 3.연락처 4.종료");
			int num = scn.nextInt();
			scn.nextLine();
			if(num==1) {
				System.out.println(name);	
			}else if(num==2) {
				System.out.println(age);
			}else if(num==3) {
				System.out.println(phone);
			}else if(num==4) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
}
}
