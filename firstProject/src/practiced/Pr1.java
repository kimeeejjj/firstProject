package practiced;
import java.util.Scanner;
public class Pr1 {
	public static void main(String[] args) {
		//이름입력
		//국어점수입력
		//수학점수입력
		//영어점수입력
		//평균이 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 이하 F
		//출력값 ㅇㅇㅇ님의 평균은ㅇ점이며, 성적은 ㅇ입니다.
		
		Scanner scn=new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		
		System.out.println("국어점수를 입력하세요.");
		int korean = scn.nextInt();
		scn.nextLine();
		
		System.out.println("수학점수를 입력하세요.");
		int math = scn.nextInt();
		scn.nextLine();
		
		System.out.println("영어점수를 입력하세요.");
		int eng = scn.nextInt();
		scn.nextLine();
		
		int sum = korean+math+eng;
		double avg = (double)sum/3;
		if(avg >= 90) {
			System.out.printf("%s님의 평균은 %f점이며, 성적은 A입니다.",name,avg);
		} else if(avg >= 80) {
			System.out.printf("%s님의 평균은 %f점이며, 성적은 B입니다.",name,avg);
		} else if(avg >=70 ) {
			System.out.printf("%s님의 평균은 %f점이며, 성적은 C입니다.",name,avg);
		} else if(avg >=60 ) {
			System.out.printf("%s님의 평균은 %f점이며, 성적은 D입니다.",name,avg);
		} else {
			System.out.printf("%s님의 평균은 %f점이며, 성적은 F입니다.",name,avg);
		}
	}
}
		
		