package practiced;
import java.util.Scanner;
public class Pr4 {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("이름을 입력하세요.");
	String name = scn.nextLine();
	
	System.out.println("국어점수를 입력하세요.");
	int guk = scn.nextInt();
	scn.nextLine();
	
	System.out.println("수학점수를 입력하세요.");
	int math = scn.nextInt();
	scn.nextLine();
	
	System.out.println("영어점수를 입력하세요.");
	int eng = scn.nextInt();
	scn.nextLine();
	
	double sum = guk+math+eng;
	double avg = sum/3;
	
	System.out.printf("%s님의 점수합계는 %f이며, 평균은 %f점입니다.",name,sum,avg);
	
	
	
}
}
