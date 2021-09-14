package firstProject;
import java.util.Scanner; // 적어줘야 scanner이름 전부 안적을 수 있음
public class ScannerExample3 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); // scanner쓰려면 이 형식 필수, 걍 암기
	System.out.println("영어점수입력:");
	int number1 = scn.nextInt();  // 숫자
	scn.nextLine(); //문자나 엔터입력역할
	
	System.out.println("수학점수입력:");
	int number2 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("이름입력:");
	String name = scn.nextLine();
	
	int sum = number1+number2;
	int avg = sum/2;
	
	System.out.printf("%s님의 영어,수학점수의 합은 %d,평균은 %d 입니다.",name,sum,avg);
	System.out.println(); //한줄띄워주기
	
	boolean pass = true;
	
	int ps = 120;
	pass = sum >= ps;
	if(pass) {
		System.out.printf("%s님은 합격입니다.",name);
	}else {System.out.printf("%s님은 불합격입니다.",name);}
}
}
