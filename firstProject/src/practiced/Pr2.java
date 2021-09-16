package practiced;
import java.util.Scanner;
public class Pr2 {
 public static void main(String[] args) {
	
	 Scanner scn=new Scanner(System.in);
	while(true) {
	 System.out.println("<인적사항 조사>");
	 System.out.println("이름을 입력하세요:");
	 String name = scn.nextLine();
	 
	 System.out.println("연락처를 입력하세요:");
	 int phone = scn.nextInt();
	 scn.nextLine();
	 
	 System.out.println("나이를 입력하세요:");
	 int age = scn.nextInt();
	 scn.nextLine();
	 
	 System.out.printf("당신의 이름은 %s, 나이는 %d, 연락처는 %d입니다.\n",name,age,phone);
	 System.out.println("맞으면 1, 틀리면 2를 눌러주세요.");
	 int answer = scn.nextInt();
	 scn. nextLine();
	 
	 if(answer == 1) {
		 System.out.println("조사에 참여해주셔서 감사합니다.");
		 break;
	 } 
 }
}
}
