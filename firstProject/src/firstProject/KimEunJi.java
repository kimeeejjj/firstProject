package firstProject;
import java.util.Scanner;
public class KimEunJi {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("몸무게입력:");
	int num1 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("신장입력(m):");
	int num2 = scn.nextInt();
	scn.nextLine();
	
	System.out.println("이름입력:");
	String name = scn.nextLine();
	
	int num3 = num2*num2;
	double bmi = (int)num1/num3;
	
	System.out.printf("%s님의 BMI지수는 %d입니다", name,bmi);
	
}
}
